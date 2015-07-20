package GTM.monop;

public class Depart extends Case {
	private final int CREDIT_PASSAGE = -100;
	private final int CREDIT_ARRETAGE = -100;

	public Depart(String nom) {
		super(nom);
	}

	public Depart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void passer(Joueur joueur) {
		joueur.crediter(CREDIT_PASSAGE);
	}

	@Override
	public void arreter(Joueur joueur) {
		joueur.crediter(CREDIT_ARRETAGE);
	}
}
