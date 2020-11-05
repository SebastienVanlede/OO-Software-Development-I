package domein;

public class Oefening3_Fiets {
	private String kleur;
	private String merk;
	private int aantalVersnellingen;
	private boolean isHerenFiets;
	private double snelheid;

	public Oefening3_Fiets(String kleur) {
		throw new UnsupportedOperationException();
	}

	public String getKleur() {
		return this.kleur;
	}

	public void setAantalVersnellingen(int aAantalVersnellingen) {
		this.aantalVersnellingen = aAantalVersnellingen;
	}

	public void versnelTotMax(double aSnelheid) {
		throw new UnsupportedOperationException();
	}
}