package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class CadastroJogador extends JFrame {

	private JPanel contentPane;
	private JTextField cNome;
	private JTextField cRG;
	private JTextField cEndereco;
	private JTextField cTelefone;
	private JButton bSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroJogador frame = new CadastroJogador();
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
	public CadastroJogador() {
		setTitle("Cadastro de Jogadores");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(200dlu;pref):grow"),
				ColumnSpec.decode("max(20dlu;pref):grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "1, 2");
		
		cNome = new JTextField();
		contentPane.add(cNome, "1, 4, fill, default");
		cNome.setColumns(10);
		
		JLabel lblRg = new JLabel("R.G.:");
		contentPane.add(lblRg, "1, 6");
		
		cRG = new JTextField();
		contentPane.add(cRG, "1, 8, left, default");
		cRG.setColumns(20);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		contentPane.add(lblEndereo, "1, 10");
		
		cEndereco = new JTextField();
		contentPane.add(cEndereco, "1, 12, fill, default");
		cEndereco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefone:");
		contentPane.add(lblNewLabel, "1, 14");
		
		cTelefone = new JTextField();
		contentPane.add(cTelefone, "1, 16, left, default");
		cTelefone.setColumns(15);
		
		JLabel lblJogadores = new JLabel("Jogadores:");
		contentPane.add(lblJogadores, "1, 20, left, default");
		
		JLabel labelContagem = new JLabel("1/1");
		contentPane.add(labelContagem, "1, 22");
		
		JButton bLimpar = new JButton("Limpar");
		contentPane.add(bLimpar, "2, 22");
		
		JButton bSalvar = new JButton("Salvar");
		bSalvar.setPreferredSize(new Dimension(100, 23));
		contentPane.add(bSalvar, "1, 24, center, default");
		
		bSair = new JButton("Sair");
		contentPane.add(bSair, "2, 24");
		
		this.setComponentOrientation(null);
	}

}
