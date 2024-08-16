package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class TelaLogin {

	private JFrame frame;
	private JPasswordField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 102));
		frame.setBounds(100, 100, 657, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.ITALIC, 20));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 96, 85, 30);
		frame.getContentPane().add(lblNewLabel);

		JToggleButton btnAcessar = new JToggleButton("Acessar");
		btnAcessar.setBackground(new Color(0, 255, 128));

		btnAcessar.setForeground(new Color(255, 255, 255));
		btnAcessar.setFont(new Font("SansSerif", Font.ITALIC, 24));
		btnAcessar.setBounds(232, 274, 134, 60);
		frame.getContentPane().add(btnAcessar);

		JTextArea tfEmail = new JTextArea();
		lblNewLabel.setLabelFor(tfEmail);
		tfEmail.setFont(new Font("SansSerif", Font.ITALIC, 20));
		tfEmail.setBounds(143, 129, 279, 34);
		frame.getContentPane().add(tfEmail);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBackground(new Color(255, 255, 255));
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("SansSerif", Font.ITALIC, 20));
		lblSenha.setEnabled(false);
		lblSenha.setBounds(143, 187, 85, 30);
		frame.getContentPane().add(lblSenha);

		tfPassword = new JPasswordField();
		lblSenha.setLabelFor(tfPassword);
		tfPassword.setFont(new Font("SansSerif", Font.ITALIC, 20));
		tfPassword.setBounds(143, 218, 279, 35);
		frame.getContentPane().add(tfPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome ****!");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.ITALIC, 30));
		lblNewLabel_1.setBounds(186, 37, 203, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, -4, 641, 30);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		mnNewMenu.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/arquivo.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Editar");
		mnNewMenu_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/edit.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Exibir");
		mnNewMenu_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/contato.png")));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JLabel lblNewLabel_2 = new JLabel("l");
		lblNewLabel_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/cidade.png")));
		lblNewLabel_2.setBounds(29, 96, 104, 67);
		frame.getContentPane().add(lblNewLabel_2);

		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String secretaEmail = "teste@teste.com";
				String secretaSenha = "23456";
				String inputEmail = tfEmail.getText().trim();
				String inputSenha = new String(tfPassword.getPassword());

				if (secretaEmail.equals(inputEmail) && secretaSenha.equals(inputSenha)) {
					JOptionPane.showMessageDialog(null, "Bem Vindo: " + inputEmail);
				} else {
					JOptionPane.showMessageDialog(null, "Email ou senha incorretos");
				}

			}
		});
	}
}
