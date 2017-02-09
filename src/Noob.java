
public class Noob extends Usuario {

	public Noob(String username) {
		super(username);
	}
	
	@Override
	public double calculaDesconto(Jogo jogo){
		return jogo.getPreco()*0.10;
	}
}
