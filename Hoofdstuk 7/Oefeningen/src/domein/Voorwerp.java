package domein;

public class Voorwerp {
	private final String naam;
	private double gewicht;
	private int niveau;

	public Voorwerp(String naam, double gewicht, int niveau) {
		controleerNaam(naam);
		this.naam = naam;
		setGewicht(gewicht);
		setNiveau(niveau);
	}

	public Voorwerp(String naam, double gewicht) {
		this(naam, gewicht, 1);
	}

	@Override
	public String toString() {
		return String.format("%s %s met gewicht %.3f kg uit niveau %d", 
				this.getClass().getSimpleName(), 
				naam, 
				gewicht,
				niveau);
	}

	private void controleerNaam(String naam) {
		if (naam == null || naam.isEmpty()) {
			throw new IllegalArgumentException("De naam mag niet leeg zijn");
		}
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		if (gewicht < 0 || gewicht >= 1000) {
			throw new IllegalArgumentException("Gewicht moet positief en kleiner dan 1000 zijn");
		}
		this.gewicht = gewicht;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		if (niveau < 1 || niveau > 10) {
			throw new IllegalArgumentException("Niveau moet tussen 1 en 10 zijn");

		}
		this.niveau = niveau;
	}

	public String getNaam() {
		return naam;
	}

}
