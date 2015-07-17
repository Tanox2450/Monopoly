package GTM.monop;

public class Pion {
	private Case position;
	private Joueur joueur;
	private TypePion typePion = TypePion.Undefined;

	public Pion(Joueur joueur) {
		this.joueur = joueur;
	}

	public TypePion getTypePion() {
		return typePion;
	}

	public void setTypePion(TypePion typePion) {
		this.typePion = typePion;
	}

	public void setPosition(Case position) {
		this.position = position;
	}

	public Case getPosition() {
		return position;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void avancer(int score) {
		for (int i = 0; i < score - 1; i++) {
			this.position = this.position.getSuivante();
			this.position.passer(this.joueur);
		}
		this.position = this.position.getSuivante();
		this.position.arreter(this.joueur);
	}
}