package GTM.monop;

public abstract class Propriete extends Case {

	private int prixAchat = 200;
	private int loyer = 20;
	private Joueur proprio = null;

	public Propriete(String nom) {
		super(nom);
	}

	public Propriete() {
		super();
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

	public void supprProprio() {
		this.proprio = null;
	}

	@Override
	public String getNom() {
		if (this.proprio == null) {
			return nom;
		} else {
			return nom + "|" + proprio.getNom() + "|";
		}
	}

	@Override
	public void passer(Joueur joueur) {
	}

	@Override
	public void arreter(Joueur joueur) throws SoldeNegatifException {
		if (this.proprio == null && joueur.verifierSoldeSup(prixAchat)) {
			int achat = (int) (Math.random() * 2);
			if (achat == 1 && joueur.verifierSoldeSup(prixAchat)) {
				this.proprio = joueur;
				joueur.ajouterPropriete(this);
				joueur.debiter(prixAchat);
			}
		} else if (proprio != joueur) {
			System.out.println(joueur.getNom());
			System.out.println(this.nom);
			System.out.println(proprio.getNom());

			joueur.debiter(loyer);
			proprio.crediter(loyer);
		}
	}
}