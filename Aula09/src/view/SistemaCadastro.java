package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.PessoaDao;
import entidades.Pessoa;

public class SistemaCadastro {

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo;
	private PessoaDao dao = new PessoaDao();
	private Pessoa pessoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaCadastro window = new SistemaCadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SistemaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 762, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 69, 614, 183);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Nome", "Idade", "Email" }));

		// Redimensionar as colunas para ajustar com os valores
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		// Centralizando os dados dos campos
		DefaultTableCellRenderer centralizar = new DefaultTableCellRenderer();
		centralizar.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(1).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(2).setCellRenderer(centralizar);

		// Impedindo edição
		table.setDefaultEditor(Object.class, null);

		// Impedindo mexer o lugar das colunas
		table.getTableHeader().setReorderingAllowed(false);

		JLabel lblTitulo = new JLabel("Cadastro de Pessoas");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(233, 11, 274, 59);
		frame.getContentPane().add(lblTitulo);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarPessoa();
			}

		});
		btnCadastrar.setBounds(61, 263, 106, 23);
		frame.getContentPane().add(btnCadastrar);

		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removerPessoa();
			}

		});
		btnRemover.setBounds(189, 263, 106, 23);
		frame.getContentPane().add(btnRemover);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarPessoa();
			}
		});
		btnEditar.setBounds(317, 263, 106, 23);
		frame.getContentPane().add(btnEditar);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarPessoa();
			}
		});
		btnPesquisar.setBounds(443, 263, 106, 23);
		frame.getContentPane().add(btnPesquisar);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarTabela();
			}
		});
		btnListar.setBounds(569, 263, 106, 23);
		frame.getContentPane().add(btnListar);

		atualizarTabela();

	}

	public void atualizarTabela() {

		modelo = (DefaultTableModel) table.getModel();

		modelo.setRowCount(0);

		List<Pessoa> lista = dao.listarPessoas();

		for (Pessoa pessoa : lista) {

			modelo.addRow(new Object[] { pessoa.getId(), pessoa.getNome(), pessoa.getIdade(), pessoa.getEmail() });
		}

	}

	public void cadastrarPessoa() {

		JLabel lblNome = new JLabel("Nome");
		JLabel lblEmail = new JLabel("Email");
		JLabel lblIdade = new JLabel("Idade");

		JTextField tfNome = new JTextField();
		JTextField tfEmail = new JTextField();
		JTextField tfIdade = new JTextField();

		JPanel painel = new JPanel(new GridLayout(0, 1));

		painel.add(lblNome);
		painel.add(tfNome);

		painel.add(lblIdade);
		painel.add(tfIdade);

		painel.add(lblEmail);
		painel.add(tfEmail);

		int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastro", JOptionPane.OK_CANCEL_OPTION);

		if (resultado == JOptionPane.OK_OPTION) {

			String nome = tfNome.getText();
			int idade = Integer.parseInt(tfIdade.getText());
			String email = tfEmail.getText();

			Pessoa pessoa = new Pessoa(nome, idade, email);

			dao.inserirPessoa(pessoa);

			atualizarTabela();

		}

	}

	public void removerPessoa() {

		int linha = table.getSelectedRow();

		if (linha != -1) {

			Object idObj = table.getValueAt(linha, 0);

			int id = (Integer) idObj;

			dao.excluirPessoa(id);

			atualizarTabela();

		} else {

			JOptionPane.showMessageDialog(null, "Selecione uma pessoa para remover");
		}

	}

	public void editarPessoa() {

		int linha = table.getSelectedRow();

		if (linha != -1) {

			Object idObj = table.getValueAt(linha, 0);

			int id = (Integer) idObj;

			Pessoa pessoa = dao.pesquisarPorId(id);

			JLabel lblNome = new JLabel("Nome");
			JLabel lblEmail = new JLabel("Email");
			JLabel lblIdade = new JLabel("Idade");

			JTextField tfNome = new JTextField(pessoa.getNome());
			JTextField tfEmail = new JTextField(pessoa.getEmail());
			JTextField tfIdade = new JTextField(String.valueOf(pessoa.getIdade()));

			JPanel painel = new JPanel(new GridLayout(0, 1));

			painel.add(lblNome);
			painel.add(tfNome);

			painel.add(lblIdade);
			painel.add(tfIdade);

			painel.add(lblEmail);
			painel.add(tfEmail);

			int resultado = JOptionPane.showConfirmDialog(null, painel, "Editar", JOptionPane.OK_CANCEL_OPTION);

			if (resultado == JOptionPane.OK_OPTION) {

				String nome = tfNome.getText();
				int idade = Integer.parseInt(tfIdade.getText());
				String email = tfEmail.getText();
				pessoa = new Pessoa(id, nome, idade, email);
				dao.alterarPessoa(pessoa);

				atualizarTabela();

			}

		} else {

			JOptionPane.showMessageDialog(null, "Selecione uma pessoa para editar");
		}

	}

	public void pesquisarPessoa() {

		JRadioButton nome = new JRadioButton("Nome");
		JRadioButton email = new JRadioButton("Email");

		JTextField campoTexto = new JTextField();

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(nome);
		grupo.add(email);

		JPanel painel = new JPanel(new GridLayout(4, 2));
		painel.add(nome);
		painel.add(email);
		painel.add(campoTexto);

		int resultado = JOptionPane.showConfirmDialog(null, painel, "Pesquisa", JOptionPane.OK_CANCEL_OPTION);

		if (resultado == JOptionPane.OK_OPTION) {

			String valor = campoTexto.getText();
			List<Pessoa> listaPessoas;
			if (nome.isSelected()) {

				listaPessoas = dao.pesquisar("nome", valor);
			} else {
				listaPessoas = dao.pesquisar("email", valor);

			}
			modelo = (DefaultTableModel) table.getModel();

			modelo.setRowCount(0);

			for (Pessoa pessoa : listaPessoas) {
				modelo.addRow(new Object[] { pessoa.getId(), pessoa.getNome(), pessoa.getIdade(), pessoa.getEmail() });

			}

		}

	}
}
