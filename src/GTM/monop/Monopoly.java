package GTM.monop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Monopoly {
	Gobelet gobelet = new Gobelet();
	Plateau plateau = new Plateau();
	List<Joueur> joueurs = new ArrayList<Joueur>();
	private Integer countTours = 1;

	public Monopoly() {
	}

	public void lancerPartie(int nbTours) {
		String ancienneCase = new String();
		String nouvelleCase = new String();
		String pion = new String();

		// List<Integer> joueursASupprimer = new ArrayList<Integer>();

		System.out.println("=== Debut de la partie ===\n");

		for (countTours = 0; countTours < nbTours; countTours++) {
			System.out.println("=== Tour " + (countTours + 1) + " ===\n");
			Iterator iterat = joueurs.iterator();
			while (iterat.hasNext()) {
				Joueur joueur = (Joueur) iterat.next();

				pion = joueur.getPion().getTypePion().toString();
				ancienneCase = joueur.getPion().getPosition().getNom();

				joueur.jouer(this.gobelet);
//				if (joueur.verifierSolde(0) == false)
//					iterat.remove();

				System.out.println(joueur.getNom() + " joue :");
				System.out.println(joueur.getNom() + " fait " + joueur.getDernierScore());

				nouvelleCase = joueur.getPion().getPosition().getNom();

				System.out.println(pion + " passe de " + ancienneCase + " à " + nouvelleCase);
				System.out.println("Solde : " + joueur.getSolde());
				System.out.println();
			}
		}

	}

	public void ajouterJoueur(Joueur joueur) {
		joueur.getPion().setPosition(plateau.getCaseDepart());
		joueurs.add(joueur);
	}
}
