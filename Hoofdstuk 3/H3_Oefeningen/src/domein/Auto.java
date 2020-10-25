package domein;

public class Auto {

	// attributen
	private String kleur, merk, nrPlaat;
	private int snelheid;

	// getters en settters
	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public String getMerk() {
		return merk;
	}

	private void setMerk(String merk) {
		this.merk = merk;
	}

	public String getNrPlaat() {
		return nrPlaat;
	}

	public void setNrPlaat(String nrPlaat) {
		this.nrPlaat = nrPlaat;
	}

	public int getSnelheid() {
		return snelheid;
	}

	// constructors
	public Auto() {
		setKleur("grijs");
		setMerk("onbekend");
		setNrPlaat("onbekend");
	}

	public Auto(String kleur) {
		setKleur(kleur);
	}

	public Auto(String kleur, String merk) {
		setKleur(kleur);
		setMerk(merk);
	}
	
	public void versnel(int extraSnelheidErbij) {
		snelheid += extraSnelheidErbij;
		
		if (snelheid > 220) {
			snelheid = 220;
		}
		
	}
	
}
