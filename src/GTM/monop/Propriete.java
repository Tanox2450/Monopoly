package GTM.monop;

public abstract class Propriete extends Case {

	private int prixAchat = 200;
	private int loyer = 20;
	private Joueur proprio;

	public Propriete(String nom) {
		super(nom);
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	@Override
	public void passer(Joueur joueur) {
	}

	@Override
	public void arreter(Joueur joueur) {
		if (proprio == null && joueur.verifierSolde(prixAchat)) {
			int achat = (int) (Math.random() * 2);
			if (achat == 1) {
				this.proprio = joueur;
				joueur.ajouterPropriete(this);
				joueur.debiter(prixAchat);
			}
		} else {
			joueur.debiter(loyer);
			proprio.crediter(loyer);
		}
	}
}