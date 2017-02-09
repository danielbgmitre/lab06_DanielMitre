import java.util.HashSet;


public abstract class Usuario {
	private String username;
	private double money;
	private int x2pPoints;
	
	private HashSet<Jogo> jogosComprados;
	
	public Usuario(String username){
		this.username = username;
	}
	
	public boolean comprarJogo(Jogo jogo){
		double comDesconto = jogo.getPreco()-calculaDesconto(jogo);
		if (money >= comDesconto){
			money -= comDesconto;
			jogosComprados.add(jogo);
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
}
