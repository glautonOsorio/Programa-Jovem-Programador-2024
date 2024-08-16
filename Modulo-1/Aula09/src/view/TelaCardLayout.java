package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCardLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCardLayout window = new TelaCardLayout();
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
	public TelaCardLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 868, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 49, 852, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel.add(panel_1, "rosa");
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel.add(panel_2, "vermelho");
		panel_2.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		panel.add(panel_3, "magenta");
		panel_3.setLayout(null);

		JButton btnRosa = new JButton("Rosa");
		btnRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "rosa");
			}
		});
		btnRosa.setBackground(Color.BLUE);
		btnRosa.setForeground(Color.PINK);
		btnRosa.setBounds(54, 11, 89, 23);
		frame.getContentPane().add(btnRosa);

		JButton btnVermelho = new JButton("Vermelho");
		btnVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "vermelho");
			}

		});
		btnVermelho.setBackground(Color.BLUE);
		btnVermelho.setForeground(Color.RED);
		btnVermelho.setBounds(339, 11, 89, 23);
		frame.getContentPane().add(btnVermelho);

		JButton btnMagenta = new JButton("Magenta");
		btnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "magenta");
			}
		});
		btnMagenta.setBackground(Color.BLUE);
		btnMagenta.setForeground(Color.MAGENTA);
		btnMagenta.setBounds(602, 11, 89, 23);
		frame.getContentPane().add(btnMagenta);
	}
}
