
public class Veterano extends Usuario {
	private int x2pPoints;
	
	public Veterano(String username){
		super(username);
		this.x2pPoints = 1000;
	}

	@Override
	public boolean comprarJogo(Jogo jogo){
		if (super.comprarJogo(jogo)){
			x2pPoints += jogo.getPreco()*15;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double calculaDesconto(Jogo jogo) {
		return jogo.getPreco()*0.20;
	}

}
