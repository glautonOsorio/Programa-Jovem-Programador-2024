package view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entidades.Pessoa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabela {

	private JFrame frame;
	private DefaultTableModel modelo;
	private List<Pessoa> listaPessoas = new ArrayList();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabela window = new Tabela();
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
	public Tabela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 781, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(45, 38, 630, 362);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				int coluna = table.getSelectedColumn();

				System.out.println(linha);
				System.out.println(coluna);
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Roberto", 30, "shikanoko@noko.koshi" }, { "Roberta", 15, "shikanoko@noko.koshi" } },
				new String[] { "Nome", "Idade", "E-mail" }));

		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		DefaultTableCellRenderer centralizar = new DefaultTableCellRenderer();

		centralizar.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(1).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(2).setCellRenderer(centralizar);

		table.setDefaultEditor(Object.class, null);

		listaPessoas.add(new Pessoa("Shika", 14, "shika@deer.com"));
		listaPessoas.add(new Pessoa("Iori", 28, "iori@deer.com"));
		listaPessoas.add(new Pessoa("Kyo", 29, "kyo@deer.com"));
		listaPessoas.add(new Pessoa("Naruto", 30, "charuto@deer.com"));
		listaPessoas.add(new Pessoa("BATATA", 999, "batata@deer.com"));

		atualizarTabela();
	}

	public void atualizarTabela() {

		modelo = (DefaultTableModel) table.getModel();

		for (Pessoa pessoa : listaPessoas) {

			modelo.addRow(new Object[] { pessoa.getNome(), pessoa.getIdade(), pessoa.getEmail() });

		}

	}
}
