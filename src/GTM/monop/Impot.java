package GTM.monop;

public class Impot extends Case {

	public Impot(String nom) {
		super(nom);
	}

	public Impot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		double somme = 0;
		somme = (double) joueur.getSolde() * 10.0 / 100.0;
		if (somme > 500)
			somme = 500;

		joueur.debiter((int) somme);
	}
}