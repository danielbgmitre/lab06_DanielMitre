import java.util.Set;


public class Jogo {	
	private String nome;
	private double preco;
	
	private Set<Integer> estilos;
	
	private int highestScore;
	private int timesPlayed;
	private int timesFinished;
	
	public Jogo(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		
		highestScore = timesPlayed = timesFinished = 0;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}


	private void setPreco(double preco) {
		this.preco = preco;
	}


	public int getHighestScore() {
		return highestScore;
	}


	public int getTimesPlayed() {
		return timesPlayed;
	}


	public int getTimesFinished() {
		return timesFinished;
	}

	public int registraJogada(int pontos, boolean zerou){
		timesPlayed += 1;
		
		if (pontos > highestScore){
			highestScore = pontos;
		}
		if (zerou){
			timesFinished += 1;
		}
		
		return 1; //x2p
	}
	
	private void addEstilo(int estilo){
		switch (estilo) {
		case EstilosJogo.ONLINE: case EstilosJogo.OFFLINE: case EstilosJogo.MULTIPLAYER:
		case EstilosJogo.COOPERATIVO: case EstilosJogo.COMPETITIVO:
			estilos.add(estilo);
			break;

		default:
			break;
		}
	}
	
	 
}
