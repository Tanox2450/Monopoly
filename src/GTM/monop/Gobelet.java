package GTM.monop;

public class Gobelet {
	private De de1 = new De();
	private De de2 = new De();

	public De getDe1() {
		return de1;
	}

	public De getDe2() {
		return de2;
	}

	public boolean isDouble() {
		int val1 = de1.getValeur();
		int val2 = de2.getValeur();

		boolean resultat = (val1 == val2);
		return resultat;
	}

	public int lancer() {
		int total = 0;
		total = de1.lancer();
		total += de2.lancer();
		return total;
	}
}