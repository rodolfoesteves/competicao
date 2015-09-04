package Control;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;

import Model.Jogador;
import Model.Partida;
import View.CadastroJogador;
import View.Frame;
import View.JanelaPrincipal;

public class Torneio {
 
	
	private CadastroJogador cadastroJogador;
	private LinkedList<Jogador> jogadores;
	private LinkedList<Partida> partidas;
	private Jogador campeao;
	private int qtdJogadores;
	

	public static void main(String[] args) {

		JanelaPrincipal frame = new JanelaPrincipal();
		frame.setVisible(true);
	
	}
	
	public Torneio(){
		cadastroJogador=new CadastroJogador();
		jogadores=new LinkedList<Jogador>();
		partidas=new LinkedList<Partida>();
		campeao=new Jogador();
		qtdJogadores=0;
		}
	
	//Chama a tela de cadastro;
	public void chamaTelaCadastro(){
		if(jogadores.size()>17){
			JOptionPane.showConfirmDialog(null, "Voce ja cadastrou todos os jogadores");
		}else{
			cadastroJogador.setVisible(true);
		}
		
	}
	
	//Cadastra o jogador no campeanato e retorna se o cadastro foi feito com sucesso
	public boolean insertJogador(Jogador jog){
		
		try{
			jogadores.add(jog);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	//Cadastra a partida no campeonato e retorna se o cadastro foi feito com sucesso
	public boolean insertPartido(Partida partida){
		
		try{
			partidas.add(partida);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	private void gerarPrimeirosJogos(){
		
		Random rand=new Random();
		LinkedList<Jogador> temp=new LinkedList<Jogador>();
		
		int  n = 0;
		
		while(!jogadores.isEmpty()){
			n = rand.nextInt(jogadores.size());
			temp.add(jogadores.get(n));
			jogadores.remove(n);
		}
		
		jogadores=temp;
		
	}
	
	//Retorna todos os jogadores
	public LinkedList readJogadores(){
		return jogadores;
	}
	
	public int getQtdJogadores() {
		return qtdJogadores;
	}
	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	}
	public Jogador getCampeao() {
		return campeao;
	}
	public void setCampeao(Jogador campeao) {
		this.campeao = campeao;
	}
	
	
	
}
