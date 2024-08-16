package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;

public class JanelaInterna extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInterna frame = new JanelaInterna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaInterna() {
		getContentPane().setBackground(Color.MAGENTA);
		setBounds(100, 100, 856, 452);

	}

}
