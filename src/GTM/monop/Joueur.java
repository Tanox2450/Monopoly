package GTM.monop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Joueur {
	private String nom = new String("");
	private static int soldeInit = 2000;
	private int solde = 0;
	private Pion pion = new Pion(this);
	private int dernierScore = 0;
	List<Propriete> proprietes = new ArrayList<Propriete>();

	public Joueur(String nom) {
		this.nom = nom;
		initSolde();
	}

	public Joueur(String nom, int soldePasse) {
		this.nom = nom;
		soldeInit = soldePasse;
		initSolde();
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public List<Propriete> getProprietes() {
		return proprietes;
	}

	public void setProprietes(List<Propriete> proprietes) {
		this.proprietes = proprietes;
	}

	private void initSolde() {
		this.solde = soldeInit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSolde() {
		return solde;
	}

	public void jouer(Gobelet gobelet) throws SoldeNegatifException {
		int score = 0;
		int countDouble = 0;

		score = gobelet.lancer();
		this.avancer(score);
		dernierScore = score;
		while (gobelet.isDouble()) {
			countDouble++;
			if (countDouble < 2) {
				score = gobelet.lancer();
				this.avancer(score);
				dernierScore += score;
			} else {
				// this.getPion().setPosition() orison
			}
		}
	}

	public int getDernierScore() {
		return dernierScore;
	}

	public boolean verifierSoldeSup(int verif) {
		return (this.solde > verif);
	}

	public void avancer(int score) throws SoldeNegatifException {
		this.pion.avancer(score);
	}

	public void crediter(int somme) {
		this.solde += somme;
	}

	public void debiter(int somme) throws SoldeNegatifException {
		this.solde -= somme;
		if (this.verifierSoldeSup(0) == false)
			throw new SoldeNegatifException("Le solde de " + this.getNom() + " est négatif");
	}

	public void ajouterPropriete(Propriete propriete) {
		proprietes.add(propriete);
	}
	
	public void supprimerProprietes(){
		Iterator<Propriete> iterateurProp = this.getProprietes().iterator();
		while (iterateurProp.hasNext()) {
			Propriete prop = (Propriete) iterateurProp.next();
			prop.supprProprio();
		}
	}
}
