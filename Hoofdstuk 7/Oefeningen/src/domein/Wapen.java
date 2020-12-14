package domein;

public class Wapen extends Voorwerp {

	private int kracht;
	private boolean gebruikt;

	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		super(naam, gewicht, niveau);
		controleerNiveau(niveau);
		setKracht(kracht);
		setGebruikt(gebruikt);
	}

	private void controleerNiveau(int niveau) {
		if (niveau < 1 || niveau > 5)
			throw new IllegalArgumentException("Wapenniveau moet tussen 1 en 5 liggen.");
	}

	@Override
	public String toString() {

		return String.format("%s en met kracht %d %s", 
				super.toString(), 
				kracht,
				gebruikt ? "al gebruikt." : "nog niet gebruikt.");
	}

	public int getKracht() {
		return kracht;
	}

	public void setKracht(int kracht) {
		if (kracht <= 0)
			throw new IllegalArgumentException("Kracht moet groter zijn dan 0.");
		this.kracht = kracht;
	}

	public boolean isGebruikt() {
		return gebruikt;
	}

	public void setGebruikt(boolean gebruikt) {
		this.gebruikt = gebruikt;
	}

}
