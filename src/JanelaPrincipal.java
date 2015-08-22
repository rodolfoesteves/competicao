import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class JanelaPrincipal {

	private JFrame frmCampeonato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal window = new JanelaPrincipal();
					window.frmCampeonato.setVisible(true);
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
		frmCampeonato = new JFrame();
		frmCampeonato.setTitle("Campeonato");
		frmCampeonato.setBounds(100, 100, 1368, 865);
		frmCampeonato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCampeonato.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tabela do Campeonato");
		lblNewLabel.setBounds(463, 11, 457, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmCampeonato.getContentPane().add(lblNewLabel);
		
		JLabel lblJogo1 = new JLabel("Jogo 1");
		lblJogo1.setBounds(10, 47, 50, 15);
		lblJogo1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo1);
		
		JRadioButton rdbtnTime1 = new JRadioButton("Time1");
		rdbtnTime1.setBounds(40, 71, 73, 15);
		rdbtnTime1.setName("rbTime1");
		frmCampeonato.getContentPane().add(rdbtnTime1);
		
		JRadioButton rdbtnTime2 = new JRadioButton("Time 2");
		rdbtnTime2.setBounds(40, 90, 73, 15);
		frmCampeonato.getContentPane().add(rdbtnTime2);
		
		ButtonGroup bgJogo1 = new ButtonGroup();
		bgJogo1.add(rdbtnTime1);
		bgJogo1.add(rdbtnTime2);
		
		JLabel lblJogo2 = new JLabel("Jogo 2");
		lblJogo2.setBounds(10, 127, 50, 15);
		lblJogo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo2);
		
		JRadioButton rdbtnTime3 = new JRadioButton("Time 3");
		rdbtnTime3.setBounds(40, 148, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime3);

		JRadioButton rdbtnTime4 = new JRadioButton("Time 4");
		rdbtnTime4.setBounds(40, 164, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime4);
		
		ButtonGroup bgJogo2 = new ButtonGroup();
		bgJogo2.add(rdbtnTime3);
		bgJogo2.add(rdbtnTime4);
		
		JLabel lblJogo3 = new JLabel("Jogo 3");
		lblJogo3.setBounds(10, 200, 50, 15);
		lblJogo3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo3);
		
		JRadioButton rdbtnTime5 = new JRadioButton("Time 5");
		rdbtnTime5.setBounds(40, 230, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime5);
		
		JRadioButton rdbtnTime6 = new JRadioButton("Time 6");
		rdbtnTime6.setBounds(40, 249, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime6);
		
		ButtonGroup bgJogo3 = new ButtonGroup();
		bgJogo3.add(rdbtnTime5);
		bgJogo3.add(rdbtnTime6);
		
		JLabel lblJogo4 = new JLabel("Jogo 4");
		lblJogo4.setBounds(10, 296, 50, 15);
		lblJogo4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo4);
		
		JRadioButton rdbtnTime7 = new JRadioButton("Time 7");
		rdbtnTime7.setBounds(40, 318, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime7);
		
		JRadioButton rdbtnTime8 = new JRadioButton("Time 8");
		rdbtnTime8.setBounds(40, 336, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime8);
		
		ButtonGroup bgJogo4 = new ButtonGroup();
		bgJogo4.add(rdbtnTime7);
		bgJogo4.add(rdbtnTime8);
		
		JLabel lblJogo5 = new JLabel("Jogo 5");
		lblJogo5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo5.setBounds(10, 373, 50, 15);
		frmCampeonato.getContentPane().add(lblJogo5);
		
		JRadioButton rdbtnTime9 = new JRadioButton("Time9");
		rdbtnTime9.setName("rbTime1");
		rdbtnTime9.setBounds(40, 397, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime9);
		
		JRadioButton rdbtnTime10 = new JRadioButton("Time 10");
		rdbtnTime10.setBounds(40, 416, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime10);
		
		ButtonGroup bgJogo5 = new ButtonGroup();
		bgJogo5.add(rdbtnTime9);
		bgJogo5.add(rdbtnTime10);
		
		JLabel lblJogo6 = new JLabel("Jogo 6");
		lblJogo6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo6.setBounds(10, 453, 50, 15);
		frmCampeonato.getContentPane().add(lblJogo6);
		
		JRadioButton rdbtnTime11 = new JRadioButton("Time 11");
		rdbtnTime11.setBounds(40, 474, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime11);
		
		JRadioButton rdbtnTime12 = new JRadioButton("Time 12");
		rdbtnTime12.setBounds(40, 490, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime12);
		
		ButtonGroup bgJogo6 = new ButtonGroup();
		bgJogo6.add(rdbtnTime11);
		bgJogo6.add(rdbtnTime12);
		
		JLabel lblJogo7 = new JLabel("Jogo 7");
		lblJogo7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo7.setBounds(10, 526, 50, 15);
		frmCampeonato.getContentPane().add(lblJogo7);
		
		JRadioButton rdbtnTime13 = new JRadioButton("Time 13");
		rdbtnTime13.setBounds(40, 556, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime13);
		
		JRadioButton rdbtnTime14 = new JRadioButton("Time 14");
		rdbtnTime14.setBounds(40, 575, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime14);
		
		ButtonGroup bgJogo7 = new ButtonGroup();
		bgJogo7.add(rdbtnTime13);
		bgJogo7.add(rdbtnTime14);
		
		JLabel lblJogo8 = new JLabel("Jogo 8");
		lblJogo8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo8.setBounds(10, 613, 50, 15);
		frmCampeonato.getContentPane().add(lblJogo8);
		
		JRadioButton rdbtnTime15 = new JRadioButton("Time 15");
		rdbtnTime15.setBounds(40, 635, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime15);
		
		JRadioButton rdbtnTime16 = new JRadioButton("Time 16");
		rdbtnTime16.setBounds(40, 653, 71, 15);
		frmCampeonato.getContentPane().add(rdbtnTime16);
		
		ButtonGroup bgJogo8 = new ButtonGroup();
		bgJogo8.add(rdbtnTime15);
		bgJogo8.add(rdbtnTime16);
		
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblJogo13 = new JLabel("Jogo 13");
		lblJogo13.setBounds(529, 174, 73, 15);
		lblJogo13.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo13);
		
		
		JLabel lblJogo9 = new JLabel("Jogo 9");
		lblJogo9.setBounds(229, 90, 141, 15);
		lblJogo9.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo9);
		
		JRadioButton rdbtnVencedor1 = new JRadioButton("Vencedor Jogo1");
		rdbtnVencedor1.setBounds(254, 109, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor1);
		
		
		JRadioButton rdbtnVencedor2 = new JRadioButton("Vencedor Jogo 2");
		rdbtnVencedor2.setBounds(254, 127, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor2);

		
		JRadioButton rdbtnVencedor9 = new JRadioButton("Vencedor Jogo 9");
		rdbtnVencedor9.setBounds(558, 192, 134, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor9);
		
		
		
		JRadioButton rdbtnVencedor10 = new JRadioButton("Vencedor Jogo 10");
		rdbtnVencedor10.setBounds(558, 210, 134, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor10);
		
		
		JLabel lblJogo10 = new JLabel("Jogo 10");
		lblJogo10.setBounds(239, 249, 131, 15);
		lblJogo10.setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCampeonato.getContentPane().add(lblJogo10);
		
		JRadioButton rdbtnVencedor3 = new JRadioButton("Vencedor Jogo 3");
		rdbtnVencedor3.setBounds(264, 271, 133, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor3);
		
		JRadioButton rdbtnVendedor4 = new JRadioButton("Vendedor Jogo 4");
		rdbtnVendedor4.setBounds(264, 291, 133, 15);
		frmCampeonato.getContentPane().add(rdbtnVendedor4);
				
		JLabel lblJogo12 = new JLabel("Jogo 12");
		lblJogo12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo12.setBounds(239, 575, 131, 15);
		frmCampeonato.getContentPane().add(lblJogo12);
		
		JRadioButton rdbtnVencedor7 = new JRadioButton("Vencedor Jogo 7");
		rdbtnVencedor7.setBounds(264, 597, 133, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor7);
		
		JRadioButton rdbtnVendedor8 = new JRadioButton("Vendedor Jogo 8");
		rdbtnVendedor8.setBounds(264, 613, 133, 15);
		frmCampeonato.getContentPane().add(rdbtnVendedor8);
		
		JRadioButton rdbtnVencedor6 = new JRadioButton("Vencedor Jogo 6");
		rdbtnVencedor6.setBounds(254, 453, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor6);
		
		JRadioButton rdbtnVencedor5 = new JRadioButton("Vencedor Jogo 5");
		rdbtnVencedor5.setBounds(254, 435, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor5);
		
		JLabel lblJogo11 = new JLabel("Jogo 11");
		lblJogo11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo11.setBounds(229, 416, 141, 15);
		frmCampeonato.getContentPane().add(lblJogo11);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave.png"));
		label_1.setBounds(116, 62, 151, 127);
		frmCampeonato.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave.png"));
		label_2.setBounds(117, 230, 151, 127);
		frmCampeonato.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave.png"));
		label_3.setBounds(117, 386, 151, 127);
		frmCampeonato.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave.png"));
		label_4.setBounds(117, 546, 151, 127);
		frmCampeonato.getContentPane().add(label_4);
		
		JRadioButton rdbtnVencedor12 = new JRadioButton("Vencedor Jogo 12");
		rdbtnVencedor12.setBounds(560, 536, 132, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor12);
		
		JRadioButton rdbtnVencedor11 = new JRadioButton("Vencedor Jogo 11");
		rdbtnVencedor11.setBounds(560, 518, 132, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor11);
		
		JLabel lblJogo14 = new JLabel("Jogo 14");
		lblJogo14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJogo14.setBounds(529, 496, 73, 15);
		frmCampeonato.getContentPane().add(lblJogo14);
		
		JRadioButton rdbtnVencedorJogo14 = new JRadioButton("Vencedor Jogo 14");
		rdbtnVencedorJogo14.setBounds(865, 358, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedorJogo14);
		
		JRadioButton rdbtnVencedor13 = new JRadioButton("Vencedor Jogo 13");
		rdbtnVencedor13.setBounds(865, 340, 143, 15);
		frmCampeonato.getContentPane().add(rdbtnVencedor13);
		
		JLabel lblFinal = new JLabel("Final");
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFinal.setBounds(835, 318, 157, 15);
		frmCampeonato.getContentPane().add(lblFinal);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave2.png"));
		label_5.setBounds(401, 81, 222, 261);
		frmCampeonato.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave2.png"));
		label_6.setBounds(401, 407, 222, 261);
		frmCampeonato.getContentPane().add(label_6);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\a1420348\\Documents\\competicao\\src\\chave3.png"));
		label.setBounds(698, 164, 222, 407);
		frmCampeonato.getContentPane().add(label);
		
		JLabel lblCampeo = new JLabel("Vencedor Final");
		lblCampeo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCampeo.setBounds(1151, 336, 173, 37);
		frmCampeonato.getContentPane().add(lblCampeo);
		
		JLabel lblCampeo_1 = new JLabel("Campe\u00E3o:");
		lblCampeo_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCampeo_1.setBounds(1055, 336, 197, 37);
		frmCampeonato.getContentPane().add(lblCampeo_1);
	}
}
