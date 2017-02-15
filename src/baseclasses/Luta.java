package baseclasses;

public class Luta extends Jogo {
	private int highestScore;
	private int timesPlayed;
	private int timesFinished;

	public Luta(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou){
		int bonusX2P = 0;
		timesPlayed += 1;
		
		if (score > highestScore){
			highestScore = score;
			bonusX2P = Math.floorDiv(score, 1000);
		}
		if (zerou){
			timesFinished += 1;
		}
		
		return bonusX2P;
	}

}
