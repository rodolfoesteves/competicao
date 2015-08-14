import java.util.LinkedList;

public class Torneio {
 
	private LinkedList<Jogador> jogadores;
	private LinkedList<Partida> partidas;
	private Jogador campeao;
	private int qtdJogadores;
	

	public Torneio(){
		jogadores=new LinkedList<Jogador>();
		partidas=new LinkedList<Partida>();
		campeao=new Jogador();
		qtdJogadores=0;
	}
// teste do Rodolfo
	//Cadastra o jogador no campeanato e retorna se o cadastro foi feito com sucesso
	public boolean insertJogador(Jogador jog){
		
		try{
			jogadores.add(jog);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	//Retorna todos os jogadores
	public LinkedList readJogadores(){
		return jogadores;
	}
	
	
	public Jogador getCampeao() {
		return campeao;
	}

	public void setCampeao(Jogador campeao) {
		this.campeao = campeao;
	}
	
	
	
}
