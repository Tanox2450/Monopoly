package GTM.monop;

public class De {
	private int valeur = 1;

	public int getValeur() {
		return valeur;
	}

	public int lancer() {
		this.valeur = (int) ((Math.random() * 6) + 1);
		return this.valeur;
	}
}
