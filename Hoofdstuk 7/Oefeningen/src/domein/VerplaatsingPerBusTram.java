package domein;

public class VerplaatsingPerBusTram extends Verplaatsing {

	private int lijnnr;
	private boolean bus;
	private boolean stadslijn;
	private final double PRIJS_PER_HALTE = 0.32;

	public VerplaatsingPerBusTram(String van, String naar, double aantalKm, int lijnnr, boolean bus,
			boolean stadslijn) {
		super(van, naar, aantalKm);
		setLijnnr(lijnnr);
		setBus(bus);
		setStadslijn(stadslijn);

	}

	public double berekenPrijs() {
		double prijs;
		if (getAantalKm() % 10 == 0)
			prijs = 2 * (int) getAantalKm() * PRIJS_PER_HALTE;
		else
			prijs = 2 * (((int) getAantalKm()) + 1) * PRIJS_PER_HALTE;
		if (stadslijn)
			return prijs * (0.80);
		return prijs;
	}

	@Override
	public String toString() {

		return String.format("%s met %s %d", super.toString(), bus ? "stadsbus" : "stadstram", lijnnr);
	}

	public int getLijnnr() {
		return lijnnr;
	}

	public void setLijnnr(int lijnnr) {
		if (lijnnr <= 0)
			throw new IllegalArgumentException("Lijnnummer moet strikt positief zijn!");
		this.lijnnr = lijnnr;
	}

	public boolean isBus() {
		return bus;
	}

	public void setBus(boolean bus) {
		this.bus = bus;
	}

	public boolean isStadslijn() {
		return stadslijn;
	}

	public void setStadslijn(boolean stadslijn) {
		this.stadslijn = stadslijn;
	}

}
