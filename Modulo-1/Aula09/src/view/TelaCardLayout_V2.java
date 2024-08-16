package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaCardLayout_V2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCardLayout_V2 window = new TelaCardLayout_V2();
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
	public TelaCardLayout_V2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 240, 240));
		menuBar.setBounds(0, 0, 861, 31);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Escolha a tela");
		menuBar.add(mnNewMenu);

		JMenuItem mntmForest = new JMenuItem("Floresta");

		mnNewMenu.add(mntmForest);
		
		JMenuItem mntmPotato = new JMenuItem("Batata");
		mnNewMenu.add(mntmPotato);

		JMenuItem mntmSea = new JMenuItem("Mar de mar");

		mnNewMenu.add(mntmSea);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(0, 0, 861, 429);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JPanel pForest = new JPanel();
		pForest.setBackground(new Color(0, 128, 0));
		panel.add(pForest, "forest");
		pForest.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaCardLayout_V2.class.getResource("/img/imageg.jpg")));
		label.setBounds(-11, 11, 540, 399);
		pForest.add(label);

		JPanel pSea = new JPanel();
		pSea.setBackground(new Color(0, 0, 128));
		panel.add(pSea, "sea");
		pSea.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCardLayout_V2.class.getResource("/img/mardemar.jpg")));
		lblNewLabel.setBounds(0, 27, 523, 356);
		pSea.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 0));
		panel.add(panel_1, "name_21158568633900");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(324, 206, 46, 14);
		panel_1.add(lblNewLabel_1);

		mntmForest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "forest");

			}
		});
		mntmSea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "sea");
			}
		});
	}
}
