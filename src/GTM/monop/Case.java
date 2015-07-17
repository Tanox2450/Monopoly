package GTM.monop;

public class Case {
	private Case suivante;
	private String nom = new String();

	public Case(String nom) {
		super();
		this.nom = nom;
	}

	public Case getSuivante() {
		return suivante;
	}

	public void setSuivante(Case suivante) {
		this.suivante = suivante;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void arreter(Joueur joueur) {
	}

	public void passer(Joueur joueur) {
	}
}
