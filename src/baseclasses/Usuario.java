package baseclasses;
import java.util.HashMap;

public abstract class Usuario {
	private String username;
	private double money;
	private int x2pPoints;
	
	private HashMap<String, Jogo> jogosComprados;
	
	public Usuario(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public boolean podeComprar(Jogo jogo){
		if (money >= calculaPreco(jogo)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean comprarJogo(Jogo jogo){
		if (podeComprar(jogo)){
			money -= calculaPreco(jogo);
			jogosComprados.put(jogo.getNome(), jogo);
			return true;
		} else {
			return false;
		}
	}
	
	public void addMoney(double money){
		this.money += money;
	}
	
	public double calculaDesconto(Jogo jogo){
		return 0;
	}
	
	public double calculaPreco(Jogo jogo){
		return jogo.getPreco() - calculaDesconto(jogo);
	}
	
	public void registraJogada(String gameName, int score, boolean zerou){
		x2pPoints += jogosComprados.get(gameName).registraJogada(score, zerou);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		
		if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
