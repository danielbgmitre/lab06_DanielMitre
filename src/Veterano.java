
public class Veterano extends Usuario {

	public Veterano(String username){
		super(username);
	}
	
	@Override
	public double calculaDesconto(Jogo jogo) {
		return jogo.getPreco()*0.20;
	}

}
