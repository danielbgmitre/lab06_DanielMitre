package baseclasses;

public class Noob extends Usuario {
	private int x2pPoints;
	
	public Noob(String username) {
		super(username);
		x2pPoints = 0;
	}
	
	@Override
	public boolean comprarJogo(Jogo jogo){
		if (super.comprarJogo(jogo)){
			x2pPoints += jogo.getPreco()*10;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double calculaDesconto(Jogo jogo){
		return jogo.getPreco()*0.10;
	}
}
