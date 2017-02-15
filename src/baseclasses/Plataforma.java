package baseclasses;

public class Plataforma extends Jogo {

	public Plataforma(String nome, double preco) {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou){
		super.registraJogada(score, zerou);
		
		if (zerou){
			return 20;
		} else {
			return 0;
		}
	}
}
