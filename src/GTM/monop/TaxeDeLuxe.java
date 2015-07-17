package GTM.monop;

public class TaxeDeLuxe extends Case {
	private final int DEBIT_ARRET = 100;

	public TaxeDeLuxe(String nom) {
		super(nom);
	}

	@Override
	public void arreter(Joueur joueur) {
		joueur.debiter(DEBIT_ARRET);
	}
}
