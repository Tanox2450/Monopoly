package GTM.monop;

public class Plateau {
	private Case[] cases = new Case[40];

	public Plateau() {
		super();
		this.initialiserCases();
		this.lierCases();
	}

	public void lierCases() {
		for (int i = 0; i < cases.length - 1; i++) {
			cases[i].setSuivante(cases[i + 1]);
		}
		cases[cases.length - 1].setSuivante(cases[0]);
	}

	public void initialiserCases() {
		for (int i = 0; i < cases.length; i++) {
			switch (i) {
			case 0:
				cases[i] = new Depart("Case Départ");
				break;
			case 1:
			case 3:
			case 6:
			case 8:
			case 9:
			case 11:
			case 13:
			case 14:
			case 16:
			case 18:
			case 19:
			case 21:
			case 23:
			case 24:
			case 26:
			case 27:
			case 29:
			case 31:
			case 32:
			case 34:
			case 37:
			case 39:
				cases[i] = new Rue("Rue " + i);
				break;
			case 4:
				cases[i] = new Impot("Case Impôt");
				break;
			case 5:
			case 15:
			case 25:
			case 35:
				cases[i] = new Gare("Gare " + i);
				break;
			case 12:
			case 28:
				cases[i] = new Compagnie("Compagnie " + i);
				break;
			case 38:
				cases[i] = new TaxeDeLuxe("Case Taxe de luxe");
				break;
			default:
				cases[i] = new Case("Case " + i);
				break;
			}
		}
	}

	public Case getCaseDepart() {
		return cases[0];
	}
}