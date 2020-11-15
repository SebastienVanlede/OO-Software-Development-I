package domein;

public class Gebakje {
	private String naam;
	private double prijs;

	public Gebakje(String naam, double prijs) {
		setNaam(naam);
		setPrijs(prijs);
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		if (naam != null && !naam.isEmpty())
			this.naam = naam;
		else
			this.naam = "onbekend";
	}

	public double getPrijs() {
		return prijs;
	}

	private void setPrijs(double prijs) {
		if (prijs > 0)
			this.prijs = prijs;
		else
			this.prijs = 1;
	}

	@Override
	public String toString() {
		return String.format("%s (�%.2f)", naam, prijs);
	}
}