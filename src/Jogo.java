import java.util.HashSet;
import java.util.Set;


public  class Jogo {	
	private String nome;
	private double preco;
	
	private HashSet<EstilosJogo> estilos;
	
	private int highestScore;
	private int timesPlayed;
	private int timesFinished;
	
	public Jogo(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		
		highestScore = timesPlayed = timesFinished = 0;
	}
	
	public Jogo getClone(){
		Jogo clone = new Jogo(nome, preco);
		clone.setEstilos(getEstilos());
		return clone;
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
	
	public HashSet<EstilosJogo> getEstilos(){
		HashSet<EstilosJogo> copiaEstilos = new HashSet<EstilosJogo>();
		for (EstilosJogo e : estilos) {
			copiaEstilos.add(e);
		}
		return copiaEstilos;
	}

	public void setEstilos(HashSet<EstilosJogo> estilos){
		this.estilos = estilos;
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
		
		return 0; //x2p
	}
	
	public void addEstilo(EstilosJogo estilo){
		estilos.add(estilo);
		
		/*
		switch (estilo) {
		case ONLINE: case OFFLINE: case MULTIPLAYER:
		case COOPERATIVO: case COMPETITIVO:
			estilos.add(estilo);
			break;

		default:
			break;
		}
		*/
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		
		if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	 
}
