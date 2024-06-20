package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField tfNome;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
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
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfNome = new JTextField();
		tfNome.setBounds(90, 109, 239, 30);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton botaClicado = (JButton) e.getSource();
				JOptionPane.showMessageDialog(null, "Nome digitado: " + tfNome.getText());

				JOptionPane.showMessageDialog(null, "Esta é uma mensagem de aviso", "Aviso",
						JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Esta é uma mensagem de ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);

				tfNome.setText("");

			}

		});
		btnMostrar.setBounds(55, 150, 89, 23);
		frame.getContentPane().add(btnMostrar);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(189, 88, 46, 23);
		frame.getContentPane().add(lblNewLabel);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resultado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirmação",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (resultado == JOptionPane.YES_OPTION) {
					frame.dispose();
				} else if (resultado == JOptionPane.NO_OPTION) {
					System.out.println("Usuario escolheu a opção não");
				} else if (resultado == JOptionPane.CANCEL_OPTION) {
					System.out.println("Usuario escolheu a opção cancelar");
				} else if (resultado == JOptionPane.CLOSED_OPTION) {
					System.out.println("Usuario fechou a janela");

				}
			}
		}

		);
		btnSair.setBounds(285, 150, 89, 23);
		frame.getContentPane().add(btnSair);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JPanel painel = new JPanel(new GridLayout(0, 1));
				JLabel lblNome = new JLabel("Nome:");
				JTextField tfName = new JTextField();
				JLabel lblIdade = new JLabel("Idade:");
				JTextField tfIdade = new JTextField();
				painel.add(lblNome);
				painel.add(tfName);
				painel.add(lblIdade);
				painel.add(tfIdade);

				int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastro de pessoa",
						JOptionPane.OK_CANCEL_OPTION);
				if (resultado == JOptionPane.OK_OPTION) {

					String nome = tfName.getText();
					int idade = Integer.parseInt(tfIdade.getText());

				} else {

				}

			}
		});
		btnCadastrar.setBounds(170, 150, 89, 23);
		frame.getContentPane().add(btnCadastrar);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("Pressionar");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {

					JOptionPane.showMessageDialog(null, "Esta na pressão");
				} else {

					JOptionPane.showMessageDialog(null, "Não está na pressão");

				}
			}
		});
		tglbtnNewToggleButton.setBounds(90, 195, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);

		JRadioButton rdbtnPython = new JRadioButton("Python");
		buttonGroup.add(rdbtnPython);
		rdbtnPython.setBounds(408, 49, 109, 23);
		frame.getContentPane().add(rdbtnPython);

		JRadioButton rdbtnJAVA = new JRadioButton("JAVA");
		buttonGroup.add(rdbtnJAVA);
		rdbtnJAVA.setBounds(408, 89, 109, 23);
		frame.getContentPane().add(rdbtnJAVA);

		JRadioButton rdbtCplus = new JRadioButton("C++");
		buttonGroup.add(rdbtCplus);
		rdbtCplus.setBounds(408, 132, 109, 23);
		frame.getContentPane().add(rdbtCplus);

		JButton btnMostrar1 = new JButton("Mostrar-2");
		btnMostrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnPython.isSelected()) {
					String nome = rdbtnPython.getText();
					JOptionPane.showMessageDialog(null, nome + " foi selecionado");

				}
				if (rdbtnJAVA.isSelected()) {
					String nome = rdbtnJAVA.getText();

					JOptionPane.showMessageDialog(null, nome + " foi selecionado");

				}
				if (rdbtCplus.isSelected()) {
					String nome = rdbtCplus.getText();

					JOptionPane.showMessageDialog(null, nome + " foi selecionado");

				}
			}
		});
		btnMostrar1.setBounds(396, 162, 89, 23);
		frame.getContentPane().add(btnMostrar1);

		String[] opcoes = { "Opção1", "Opção2", "Opção3", "Opção4", "Opção5" };
		JComboBox comboBox = new JComboBox(opcoes);
		comboBox.setBounds(629, 49, 121, 22);
		frame.getContentPane().add(comboBox);

		JButton btnMostrar5 = new JButton("Mostrar8");
		btnMostrar5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada = (String) comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(null, opcaoSelecionada + " foi selecionado");

			}
		});
		btnMostrar5.setBounds(661, 88, 89, 23);
		frame.getContentPane().add(btnMostrar5);

		JButton btnNewButton = new JButton("BatatataIntern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaInterna telaInterna = new JanelaInterna();
				frame.getContentPane().add(telaInterna);
				telaInterna.setVisible(true);
				telaInterna.setClosable(true);

			}
		});
		btnNewButton.setBounds(322, 289, 175, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Batatata");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaSecundaria tela2 = new JanelaSecundaria();
				tela2.setVisible(true);
				tela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_1.setBounds(396, 255, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
