package Model;

public class Partida {

	private Jogador jogador1;
	private Jogador jogador2;
	private Jogador ganhador;
	private int nivel;
	
	public Partida(){
		jogador1=new Jogador();
		jogador2=new Jogador();
		ganhador=new Jogador();
		nivel=0;
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public Jogador getGanhador() {
		return ganhador;
	}

	public void setGanhador(Jogador ganhador) {
		this.ganhador = ganhador;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
}
