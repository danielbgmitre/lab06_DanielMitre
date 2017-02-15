package baseclasses;

public class RPG extends Jogo {

	public RPG(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou){
		super.registraJogada(score, zerou);
		return 10;
	}
}
