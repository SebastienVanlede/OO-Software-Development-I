package domein;

public class Oef5_Stappenteller {
	private String activiteit;
	private int hoeveelheid, soort;

	public Oef5_Stappenteller(String activiteit, int hoeveelheid, int soort) {
		this.setActiviteit(activiteit);
		this.setHoeveelheid(hoeveelheid);
		this.setSoort(soort);
	}

	public final void setActiviteit(String activiteit) {
		this.activiteit = activiteit;

	}

	public String getActiviteit() {
		return activiteit;
	}

	public int getHoeveelheid() {
		return hoeveelheid;
	}

	public final void setHoeveelheid(int hoeveelheid) {
		if (hoeveelheid > 0 && hoeveelheid <= 1000) {
			this.hoeveelheid = hoeveelheid;
		} else
			throw new IllegalArgumentException("De hoeveelheid moet groter zijn dan 0 en mag maximaal 1000 zijn.");

	}

	public int getSoort() {
		return soort;
	}

	public final void setSoort(int soort) {
		if (soort == 1 || soort == 2 || soort == 3) {
			this.soort = soort;
		} else
			throw new IllegalArgumentException("De soort moet 1, 2 of 3 zijn.");
	}

	public int geefAantalStappen() {
		int aantalstappen = 0;
		switch (soort) {
		case 1:
		default:
			return aantalstappen += hoeveelheid;

		case 2:
			return aantalstappen += hoeveelheid * 2;

		case 3:
			return aantalstappen += hoeveelheid / 2;

		}

	}

	@Override
	public String toString() {

		return String.format("%40s%10d", activiteit, geefAantalStappen());
	}

}
