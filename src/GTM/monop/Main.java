package GTM.monop;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Monopoly jeu = new Monopoly();
		Joueur joueur1 = new Joueur("Banzaï");
		Joueur joueur2 = new Joueur("Patate");
		Joueur joueur3 = new Joueur("Dovahkiin");
		Joueur joueur4 = new Joueur("Inconnu");
		String nbToursString = "0";
		int nbTours = 0;

		joueur1.getPion().setTypePion(TypePion.jedi);
		joueur2.getPion().setTypePion(TypePion.pourrite);
		joueur3.getPion().setTypePion(TypePion.dragonHunter);

		jeu.ajouterJoueur(joueur1);
		jeu.ajouterJoueur(joueur2);
		jeu.ajouterJoueur(joueur3);
		jeu.ajouterJoueur(joueur4);

		nbToursString = JOptionPane.showInputDialog(null, "Nombre de tours de jeu", "10");
		nbTours = Integer.parseInt(nbToursString);

		jeu.lancerPartie(nbTours);
	}
}