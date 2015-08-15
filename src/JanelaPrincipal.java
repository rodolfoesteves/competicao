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
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabela do Campeonato");
		lblNewLabel.setBounds(0, 0, 434, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnTime = new JRadioButton("Time1");
		rdbtnTime.setName("rbTime1");
		rdbtnTime.setBounds(18, 74, 109, 23);
		frame.getContentPane().add(rdbtnTime);
		
		JRadioButton rdbtnTime_1 = new JRadioButton("Time 2");
		rdbtnTime_1.setBounds(18, 100, 109, 23);
		frame.getContentPane().add(rdbtnTime_1);
		
		JRadioButton rdbtnTime_2 = new JRadioButton("Time 3");
		rdbtnTime_2.setBounds(18, 166, 109, 23);
		frame.getContentPane().add(rdbtnTime_2);
		
		JRadioButton rdbtnTime_3 = new JRadioButton("Time 4");
		rdbtnTime_3.setBounds(18, 192, 109, 23);
		frame.getContentPane().add(rdbtnTime_3);
		
		JRadioButton rdbtnTime_4 = new JRadioButton("Time 5");
		rdbtnTime_4.setBounds(18, 254, 109, 23);
		frame.getContentPane().add(rdbtnTime_4);
		
		JRadioButton rdbtnTime_5 = new JRadioButton("Time 6");
		rdbtnTime_5.setBounds(18, 280, 109, 23);
		frame.getContentPane().add(rdbtnTime_5);
		
		JRadioButton rdbtnTime_6 = new JRadioButton("Time 7");
		rdbtnTime_6.setBounds(18, 348, 109, 23);
		frame.getContentPane().add(rdbtnTime_6);
		
		JRadioButton rdbtnTime_7 = new JRadioButton("Time 8");
		rdbtnTime_7.setBounds(18, 374, 109, 23);
		frame.getContentPane().add(rdbtnTime_7);
		
		JLabel lblJogo = new JLabel("Jogo 1");
		lblJogo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo.setBounds(25, 53, 46, 14);
		frame.getContentPane().add(lblJogo);
		
		JLabel lblJogo_1 = new JLabel("Jogo 2");
		lblJogo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_1.setBounds(25, 145, 46, 14);
		frame.getContentPane().add(lblJogo_1);
		
		JLabel lblJogo_2 = new JLabel("Jogo 3");
		lblJogo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_2.setBounds(25, 233, 46, 14);
		frame.getContentPane().add(lblJogo_2);
		
		JLabel lblJogo_3 = new JLabel("Jogo 4");
		lblJogo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_3.setBounds(25, 327, 46, 14);
		frame.getContentPane().add(lblJogo_3);
		
		JLabel lblJogo_4 = new JLabel("Jogo 9");
		lblJogo_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_4.setBounds(140, 100, 46, 14);
		frame.getContentPane().add(lblJogo_4);
		
		JRadioButton rdbtnVencedorJogo = new JRadioButton("Vencedor Jogo1");
		rdbtnVencedorJogo.setBounds(129, 117, 109, 23);
		frame.getContentPane().add(rdbtnVencedorJogo);
		
		JRadioButton rdbtnVencedorJogo_1 = new JRadioButton("Vencedor Jogo 2");
		rdbtnVencedorJogo_1.setBounds(129, 141, 109, 23);
		frame.getContentPane().add(rdbtnVencedorJogo_1);
		
		JLabel lblJogo_5 = new JLabel("Jogo 10");
		lblJogo_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_5.setBounds(140, 280, 46, 14);
		frame.getContentPane().add(lblJogo_5);
		
		JRadioButton rdbtnVencedorJogo_2 = new JRadioButton("Vencedor Jogo 3");
		rdbtnVencedorJogo_2.setBounds(129, 302, 109, 23);
		frame.getContentPane().add(rdbtnVencedorJogo_2);
		
		JRadioButton rdbtnVendedorJogo = new JRadioButton("Vendedor Jogo 4");
		rdbtnVendedorJogo.setBounds(129, 331, 109, 23);
		frame.getContentPane().add(rdbtnVendedorJogo);
		
		JLabel lblJogo_6 = new JLabel("Jogo 13");
		lblJogo_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo_6.setBounds(307, 192, 46, 14);
		frame.getContentPane().add(lblJogo_6);
		
		JRadioButton rdbtnVencedorJogo_3 = new JRadioButton("Vencedor Jogo 9");
		rdbtnVencedorJogo_3.setBounds(284, 213, 109, 23);
		frame.getContentPane().add(rdbtnVencedorJogo_3);
		
		JRadioButton rdbtnVencedorJogo_4 = new JRadioButton("Vencedor Jogo 10");
		rdbtnVencedorJogo_4.setBounds(284, 238, 126, 23);
		frame.getContentPane().add(rdbtnVencedorJogo_4);
	}
}
