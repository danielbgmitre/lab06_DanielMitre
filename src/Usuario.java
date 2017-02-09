import java.util.HashSet;


public abstract class Usuario {
	private String username;
	private HashSet<Jogo> jogosComprados;
	private double money;
	
	public Usuario(String username){
		this.username = username;
	}
	
	private boolean comprarJogo(Jogo jogo){
		if (money > jogo.getPreco()){
			money -= jogo.getPreco();
			jogosComprados.add(jogo);
			return true;
		} else {
			return false;
		}
	}
	
	private void addMoney(double money){
		this.money += money;
	}
	
	public abstract double calculaDesconto(Jogo jogo);
}
