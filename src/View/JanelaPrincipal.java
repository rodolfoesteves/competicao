package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import Control.Torneio;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame{


	
	public Torneio torneio;

	
	public JanelaPrincipal() {
		torneio=new Torneio();
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		this.setTitle("Torneio");
		this.setBounds(100, 100, 1200, 567);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new MigLayout("", "[236px][236px][236px][236px][236px]", "[48px][48px][48px][48px][48px][48px][48px][48px][48px][48px][48px][48px][48px]"));
		
		JLabel lblNewLabel = new JLabel("Tabela do Campeonato");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(lblNewLabel, "cell 0 0,grow");
		
		JButton btnNewButton = new JButton("Registrar Jogadores 1/18");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				torneio.chamaTelaCadastro();
			}
		});
		
		this.getContentPane().add(btnNewButton, "flowy,cell 1 0,alignx center,aligny center");
		
		JLabel label_1 = new JLabel("");
		this.getContentPane().add(label_1, "cell 1 0,grow");
		
		JLabel label = new JLabel("");
		this.getContentPane().add(label, "cell 2 0,grow");
		
		JLabel label_2 = new JLabel("");
		this.getContentPane().add(label_2, "flowy,cell 4 0,grow");
		
		JLabel lblJogo_4 = new JLabel("Jogo 9");
		lblJogo_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_4, "cell 0 1,grow");
		
		JLabel lblTeste = new JLabel("Teste");
		this.getContentPane().add(lblTeste, "cell 1 1");
		
		JLabel label_4 = new JLabel("");
		this.getContentPane().add(label_4, "cell 2 1,grow");
		
		JLabel label_5 = new JLabel("");
		this.getContentPane().add(label_5, "cell 3 1,grow");
		
		JRadioButton rdbtnTime_1 = new JRadioButton("Time 2");
		this.getContentPane().add(rdbtnTime_1, "cell 4 1,grow");
		
		JRadioButton rdbtnVencedorJogo_1 = new JRadioButton("Vencedor Jogo 2");
		this.getContentPane().add(rdbtnVencedorJogo_1, "cell 0 2,grow");
		
		JLabel label_6 = new JLabel("");
		this.getContentPane().add(label_6, "cell 1 2,grow");
		
		JLabel label_7 = new JLabel("");
		this.getContentPane().add(label_7, "cell 2 2,grow");
		
		JRadioButton rdbtnVencedorJogo = new JRadioButton("Vencedor Jogo1");
		this.getContentPane().add(rdbtnVencedorJogo, "flowx,cell 4 2,grow");
		
		JLabel label_8 = new JLabel("");
		this.getContentPane().add(label_8, "cell 4 2,grow");
		
		JRadioButton rdbtnVencedorJogo_3 = new JRadioButton("Vencedor Jogo 9");
		this.getContentPane().add(rdbtnVencedorJogo_3, "cell 0 3,grow");
		
		JLabel label_9 = new JLabel("");
		this.getContentPane().add(label_9, "cell 1 3,grow");
		
		JLabel label_10 = new JLabel("");
		this.getContentPane().add(label_10, "cell 3 3,grow");
		
		JLabel lblJogo_1 = new JLabel("Jogo 2");
		lblJogo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_1, "cell 4 3,grow");
		
		JLabel label_11 = new JLabel("");
		this.getContentPane().add(label_11, "flowy,cell 0 4,grow");
		
		JLabel label_12 = new JLabel("");
		this.getContentPane().add(label_12, "cell 2 4,grow");
		
		JLabel label_13 = new JLabel("");
		this.getContentPane().add(label_13, "flowy,cell 4 4,grow");
		
		JRadioButton rdbtnTime_4 = new JRadioButton("Time 5");
		this.getContentPane().add(rdbtnTime_4, "flowx,cell 0 5,grow");
		
		JLabel label_14 = new JLabel("");
		this.getContentPane().add(label_14, "cell 0 5,grow");
		
		JLabel label_15 = new JLabel("");
		this.getContentPane().add(label_15, "cell 3 5,grow");
		
		JRadioButton rdbtnVencedorJogo_4 = new JRadioButton("Vencedor Jogo 10");
		this.getContentPane().add(rdbtnVencedorJogo_4, "cell 4 5,grow");
		
		JRadioButton rdbtnTime_3 = new JRadioButton("Time 4");
		this.getContentPane().add(rdbtnTime_3, "cell 0 6,grow");
		
		JLabel label_16 = new JLabel("");
		this.getContentPane().add(label_16, "cell 1 6,grow");
		
		JLabel label_17 = new JLabel("");
		this.getContentPane().add(label_17, "cell 2 6,grow");
		
		JLabel label_18 = new JLabel("");
		this.getContentPane().add(label_18, "flowy,cell 4 6,grow");
		
		JLabel label_19 = new JLabel("");
		this.getContentPane().add(label_19, "flowy,cell 0 7,grow");
		
		JLabel label_20 = new JLabel("");
		this.getContentPane().add(label_20, "cell 1 7,grow");
		
		JLabel label_21 = new JLabel("");
		this.getContentPane().add(label_21, "cell 3 7,grow");
		
		JRadioButton rdbtnVendedorJogo = new JRadioButton("Vendedor Jogo 4");
		this.getContentPane().add(rdbtnVendedorJogo, "flowx,cell 4 7,grow");
		
		JLabel label_22 = new JLabel("");
		this.getContentPane().add(label_22, "cell 4 7,grow");
		
		JRadioButton rdbtnVencedorJogo_2 = new JRadioButton("Vencedor Jogo 3");
		this.getContentPane().add(rdbtnVencedorJogo_2, "cell 0 8,grow");
		
		JRadioButton rdbtnTime_7 = new JRadioButton("Time 8");
		this.getContentPane().add(rdbtnTime_7, "cell 4 8,grow");
		
		JRadioButton rdbtnTime_6 = new JRadioButton("Time 7");
		this.getContentPane().add(rdbtnTime_6, "cell 0 9,grow");
		
		JLabel label_23 = new JLabel("");
		this.getContentPane().add(label_23, "cell 1 9,grow");
		
		JLabel label_24 = new JLabel("");
		this.getContentPane().add(label_24, "cell 4 9,grow");
		
		JLabel lblJogo_3 = new JLabel("Jogo 4");
		lblJogo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_3, "cell 0 10,grow");
		
		JLabel label_25 = new JLabel("");
		this.getContentPane().add(label_25, "cell 1 10,grow");
		
		JLabel label_26 = new JLabel("");
		this.getContentPane().add(label_26, "cell 2 10,grow");
		
		JLabel label_27 = new JLabel("");
		this.getContentPane().add(label_27, "cell 4 10,grow");
		
		JLabel label_28 = new JLabel("");
		this.getContentPane().add(label_28, "flowy,cell 0 11,grow");
		
		JLabel label_29 = new JLabel("");
		this.getContentPane().add(label_29, "cell 1 11,grow");
		
		JLabel label_30 = new JLabel("");
		this.getContentPane().add(label_30, "cell 2 11,grow");
		
		JLabel label_31 = new JLabel("");
		this.getContentPane().add(label_31, "cell 3 11,grow");
		
		JLabel label_32 = new JLabel("");
		this.getContentPane().add(label_32, "cell 4 11,grow");
		
		JLabel lblJogo_2 = new JLabel("Jogo 3");
		lblJogo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_2, "cell 0 4,grow");
		
		JLabel lblJogo_5 = new JLabel("Jogo 10");
		lblJogo_5.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJogo_5.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblJogo_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_5, "cell 0 7,grow");
		
		JRadioButton rdbtnTime = new JRadioButton("Time1");
		rdbtnTime.setName("rbTime1");
		this.getContentPane().add(rdbtnTime, "cell 0 11,grow");
		
		JRadioButton rdbtnTime_2 = new JRadioButton("Time 3");
		this.getContentPane().add(rdbtnTime_2, "cell 0 12,grow");
		
		JLabel lblJogo = new JLabel("Jogo 1");
		lblJogo.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo, "cell 4 0,grow");
		
		JRadioButton rdbtnTime_5 = new JRadioButton("Time 6");
		this.getContentPane().add(rdbtnTime_5, "cell 4 4,grow");
		
		JLabel lblJogo_6 = new JLabel("Jogo 13");
		lblJogo_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.getContentPane().add(lblJogo_6, "cell 4 6,grow");
	}
}
