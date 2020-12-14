package domein;

public class Verplaatsing {
	private String van, naar;
	private double aantalKm;

	public Verplaatsing(String van, String naar, double aantalKm) {
		setVan(van);
		setNaar(naar);
		setAantalKm(aantalKm);
	}

	@Override
	public String toString() {
		return String.format("Verplaatsing van %s naar %s", van, naar);
	}

	public String getVan() {
		return van;
	}

	public void setVan(String van) {
		if (van == null || van.isEmpty())
			throw new IllegalArgumentException("Van moet ingevuld zijn!");
		this.van = van;
	}

	public String getNaar() {
		return naar;
	}

	public void setNaar(String naar) {
		if (naar == null || naar.isEmpty())
			throw new IllegalArgumentException("Naar moet ingevuld zijn!");
		this.naar = naar;
	}

	public double getAantalKm() {
		return aantalKm;
	}

	public void setAantalKm(double aantalKm) {
		if (aantalKm <= 0)
			throw new IllegalArgumentException("Aantal km moet een postifietf getal zijn");
		this.aantalKm = aantalKm;
	}

}
