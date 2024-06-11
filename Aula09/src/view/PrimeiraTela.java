package view;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField tfNome;

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
		frame.setBounds(100, 100, 454, 305);
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
			if (resultado == JOptionPane.OK_OPTION ) {
				
				String nome = tfName.getText();
				int idade = Integer.parseInt(tfIdade.getText()) ;
				
			} else {

			}

			}
		});
		btnCadastrar.setBounds(170, 150, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
}
