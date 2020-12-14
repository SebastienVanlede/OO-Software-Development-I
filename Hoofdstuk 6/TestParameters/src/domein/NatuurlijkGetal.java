package domein;

public class NatuurlijkGetal {
	private int waarde;

	public NatuurlijkGetal(int waarde) {
		setWaarde(waarde);
	}

	public void setWaarde(int waarde) {
		if (waarde < 0)
			throw new IllegalArgumentException("De waarde voor een natuurlijk getal moet >= 0 zijn");
		this.waarde = waarde;
	}

	public int getWaarde() {
		return this.waarde;
	}
}
