import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Rectangle;

public class Cadastro_Jogador_View {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtRG;
	private JTextField txtTelefone;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JComboBox cmbEstado;
	private Torneio torneio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Jogador_View window = new Cadastro_Jogador_View();
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
	public Cadastro_Jogador_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private Jogador getJogador(){
		Jogador jogador = new Jogador();
		jogador.setNome(txtNome.getText());
		jogador.setRg(txtRG.getText());
		jogador.setTelefone(txtTelefone.getText());
		jogador.setEndereco(txtLogradouro.getText()+txtNumero.getText()+txtComplemento.getText()+txtBairro.getText()+txtCidade.getText()+(String)cmbEstado.getSelectedItem());
		Limpar();
		return jogador ;
	}
	
	private void Limpar(){
		txtNome.setText("");
		txtRG.setText("");
		txtTelefone.setText("");
		txtLogradouro.setText("");
		txtNumero.setText("");
		txtComplemento.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		cmbEstado.setSelectedItem("");
		}
	
	private void initialize() {
		torneio = new Torneio();
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(0, 4, 0, 0));
		frame.setBounds(100, 100, 560, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 100, 30};
		gridBagLayout.rowHeights = new int[] {60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCadastroDeJogadores = new JLabel("CADASTRO DE JOGADORES");
		lblCadastroDeJogadores.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCadastroDeJogadores = new GridBagConstraints();
		gbc_lblCadastroDeJogadores.insets = new Insets(0, 0, 5, 5);
		gbc_lblCadastroDeJogadores.gridx = 1;
		gbc_lblCadastroDeJogadores.gridy = 0;
		frame.getContentPane().add(lblCadastroDeJogadores, gbc_lblCadastroDeJogadores);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		frame.getContentPane().add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		frame.getContentPane().add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblRg = new GridBagConstraints();
		gbc_lblRg.insets = new Insets(0, 0, 5, 5);
		gbc_lblRg.gridx = 0;
		gbc_lblRg.gridy = 2;
		frame.getContentPane().add(lblRg, gbc_lblRg);
		
		txtRG = new JTextField();
		txtRG.setColumns(10);
		GridBagConstraints gbc_txtRG = new GridBagConstraints();
		gbc_txtRG.insets = new Insets(0, 0, 5, 5);
		gbc_txtRG.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRG.gridx = 1;
		gbc_txtRG.gridy = 2;
		frame.getContentPane().add(txtRG, gbc_txtRG);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		frame.getContentPane().add(lblTelefone, gbc_lblTelefone);
		
		JTextField txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 3;
		frame.getContentPane().add(txtTelefone, gbc_txtTelefone);
		
		JLabel lblLogradouro = new JLabel("LOGRADOURO:");
		lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblLogradouro = new GridBagConstraints();
		gbc_lblLogradouro.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogradouro.gridx = 0;
		gbc_lblLogradouro.gridy = 4;
		frame.getContentPane().add(lblLogradouro, gbc_lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		GridBagConstraints gbc_txtLogradouro = new GridBagConstraints();
		gbc_txtLogradouro.insets = new Insets(0, 0, 5, 5);
		gbc_txtLogradouro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLogradouro.gridx = 1;
		gbc_txtLogradouro.gridy = 4;
		frame.getContentPane().add(txtLogradouro, gbc_txtLogradouro);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblN = new GridBagConstraints();
		gbc_lblN.insets = new Insets(0, 0, 5, 5);
		gbc_lblN.gridx = 0;
		gbc_lblN.gridy = 5;
		frame.getContentPane().add(lblN, gbc_lblN);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		GridBagConstraints gbc_txtNumero = new GridBagConstraints();
		gbc_txtNumero.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumero.gridx = 1;
		gbc_txtNumero.gridy = 5;
		frame.getContentPane().add(txtNumero, gbc_txtNumero);
		
		JLabel lblComplemento = new JLabel("COMPLEMENTO:");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblComplemento = new GridBagConstraints();
		gbc_lblComplemento.insets = new Insets(0, 0, 5, 5);
		gbc_lblComplemento.gridx = 0;
		gbc_lblComplemento.gridy = 6;
		frame.getContentPane().add(lblComplemento, gbc_lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		GridBagConstraints gbc_txtComplemento = new GridBagConstraints();
		gbc_txtComplemento.insets = new Insets(0, 0, 5, 5);
		gbc_txtComplemento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtComplemento.gridx = 1;
		gbc_txtComplemento.gridy = 6;
		frame.getContentPane().add(txtComplemento, gbc_txtComplemento);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblBairro = new GridBagConstraints();
		gbc_lblBairro.insets = new Insets(0, 0, 5, 5);
		gbc_lblBairro.gridx = 0;
		gbc_lblBairro.gridy = 7;
		frame.getContentPane().add(lblBairro, gbc_lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		GridBagConstraints gbc_txtBairro = new GridBagConstraints();
		gbc_txtBairro.insets = new Insets(0, 0, 5, 5);
		gbc_txtBairro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBairro.gridx = 1;
		gbc_txtBairro.gridy = 7;
		frame.getContentPane().add(txtBairro, gbc_txtBairro);
		
		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 8;
		frame.getContentPane().add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 8;
		frame.getContentPane().add(txtCidade, gbc_txtCidade);
		
		JLabel lblEstado = new JLabel("ESTADO:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 9;
		frame.getContentPane().add(lblEstado, gbc_lblEstado);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"SELECIONE", "Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA) ", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		cmbEstado.setToolTipText("");
		GridBagConstraints gbc_cmbEstado = new GridBagConstraints();
		gbc_cmbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cmbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbEstado.gridx = 1;
		gbc_cmbEstado.gridy = 9;
		frame.getContentPane().add(cmbEstado, gbc_cmbEstado);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				torneio.insertJogador(getJogador());
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 0;
		gbc_btnEnviar.gridy = 10;
		frame.getContentPane().add(btnEnviar, gbc_btnEnviar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		btnCancelar.setActionCommand("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 10;
		frame.getContentPane().add(btnCancelar, gbc_btnCancelar);
	}

}
