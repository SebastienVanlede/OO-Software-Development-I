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
	
	/*
	    // Other way (uncommenting can cause interference):
	    // ------------------- attribute -------------------
	    private String kleur, merk, nrplaat;
	    private int snelheid;

	    // ------------------- Constructor -------------------
	    public Auto() {
		this("grijs");
	    }

	    public Auto(String kleur) {
		this(kleur, "");
	    }

	    public Auto(String kleur, String merk) {
		this.setKleur(kleur);
		this.setMerk(merk);
		this.setNrplaat("");
		this.snelheid = 0;
	    }

	    public void versnel(int extraSnelheidErbij) {
		if (this.snelheid > 220) {
		    this.snelheid = 220;
		}
	    }


	    // ------------------- getters and setters -------------------

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
	    }

	    public String getNrplaat() {
		return nrplaat;
	    }

	    public void setNrplaat(String nrplaat) {
		this.nrplaat = nrplaat;
	    }

	    public int getSnelheid() {
		return snelheid;
	    }
	*/
}
