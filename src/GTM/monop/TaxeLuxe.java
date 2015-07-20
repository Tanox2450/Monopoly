package GTM.monop;

public class TaxeLuxe extends Case {
	private final int DEBIT_ARRET = 100;

	public TaxeLuxe(String nom) {
		super(nom);
	}

	public TaxeLuxe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		joueur.debiter(DEBIT_ARRET);
	}
}
