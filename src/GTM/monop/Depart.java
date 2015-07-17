package GTM.monop;

public class Depart extends Case {
	private final int CREDIT_PASSAGE = 200;
	private final int CREDIT_ARRETAGE = 400;

	public Depart(String nom) {
		super(nom);
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
