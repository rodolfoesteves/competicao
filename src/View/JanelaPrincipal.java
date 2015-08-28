package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.GridLayout;

public class JanelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 886, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(20, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Tabela do Campeonato");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		
		JLabel lblJogo = new JLabel("Jogo 1");
		lblJogo.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo);
		
		JLabel label_2 = new JLabel("");
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		frame.getContentPane().add(label_3);
		
		JRadioButton rdbtnTime = new JRadioButton("Time1");
		rdbtnTime.setName("rbTime1");
		frame.getContentPane().add(rdbtnTime);
		
		JLabel label_4 = new JLabel("");
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		frame.getContentPane().add(label_5);
		
		JRadioButton rdbtnTime_1 = new JRadioButton("Time 2");
		frame.getContentPane().add(rdbtnTime_1);
		
		JLabel lblJogo_4 = new JLabel("Jogo 9");
		lblJogo_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_4);
		
		JLabel label_6 = new JLabel("");
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		frame.getContentPane().add(label_7);
		
		JRadioButton rdbtnVencedorJogo = new JRadioButton("Vencedor Jogo1");
		frame.getContentPane().add(rdbtnVencedorJogo);
		
		JLabel label_8 = new JLabel("");
		frame.getContentPane().add(label_8);
		
		JLabel lblJogo_1 = new JLabel("Jogo 2");
		lblJogo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_1);
		
		JRadioButton rdbtnVencedorJogo_1 = new JRadioButton("Vencedor Jogo 2");
		frame.getContentPane().add(rdbtnVencedorJogo_1);
		
		JLabel label_9 = new JLabel("");
		frame.getContentPane().add(label_9);
		
		JRadioButton rdbtnTime_2 = new JRadioButton("Time 3");
		frame.getContentPane().add(rdbtnTime_2);
		
		JLabel label_10 = new JLabel("");
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		frame.getContentPane().add(label_11);
		
		JRadioButton rdbtnTime_3 = new JRadioButton("Time 4");
		frame.getContentPane().add(rdbtnTime_3);
		
		JLabel label_12 = new JLabel("");
		frame.getContentPane().add(label_12);
		
		JLabel lblJogo_6 = new JLabel("Jogo 13");
		lblJogo_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_6);
		
		JLabel label_13 = new JLabel("");
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		frame.getContentPane().add(label_14);
		
		JRadioButton rdbtnVencedorJogo_3 = new JRadioButton("Vencedor Jogo 9");
		frame.getContentPane().add(rdbtnVencedorJogo_3);
		
		JLabel lblJogo_2 = new JLabel("Jogo 3");
		lblJogo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_2);
		
		JLabel label_15 = new JLabel("");
		frame.getContentPane().add(label_15);
		
		JRadioButton rdbtnVencedorJogo_4 = new JRadioButton("Vencedor Jogo 10");
		frame.getContentPane().add(rdbtnVencedorJogo_4);
		
		JRadioButton rdbtnTime_4 = new JRadioButton("Time 5");
		frame.getContentPane().add(rdbtnTime_4);
		
		JLabel label_16 = new JLabel("");
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		frame.getContentPane().add(label_17);
		
		JRadioButton rdbtnTime_5 = new JRadioButton("Time 6");
		frame.getContentPane().add(rdbtnTime_5);
		
		JLabel label_18 = new JLabel("");
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("");
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("");
		frame.getContentPane().add(label_20);
		
		JLabel lblJogo_5 = new JLabel("Jogo 10");
		lblJogo_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_5);
		
		JLabel label_21 = new JLabel("");
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("");
		frame.getContentPane().add(label_22);
		
		JRadioButton rdbtnVencedorJogo_2 = new JRadioButton("Vencedor Jogo 3");
		frame.getContentPane().add(rdbtnVencedorJogo_2);
		
		JLabel label_23 = new JLabel("");
		frame.getContentPane().add(label_23);
		
		JLabel lblJogo_3 = new JLabel("Jogo 4");
		lblJogo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblJogo_3);
		
		JRadioButton rdbtnVendedorJogo = new JRadioButton("Vendedor Jogo 4");
		frame.getContentPane().add(rdbtnVendedorJogo);
		
		JLabel label_24 = new JLabel("");
		frame.getContentPane().add(label_24);
		
		JRadioButton rdbtnTime_6 = new JRadioButton("Time 7");
		frame.getContentPane().add(rdbtnTime_6);
		
		JLabel label_25 = new JLabel("");
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("");
		frame.getContentPane().add(label_26);
		
		JRadioButton rdbtnTime_7 = new JRadioButton("Time 8");
		frame.getContentPane().add(rdbtnTime_7);
		
		JLabel label_27 = new JLabel("");
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("");
		frame.getContentPane().add(label_28);
	}
}
