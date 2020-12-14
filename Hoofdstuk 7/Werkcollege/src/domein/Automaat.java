package domein;

public class Automaat {
	private int aantalItems;
	private int aantalMunten;
	private boolean muntInGleuf;
	private boolean itemInBak;

	public Automaat(int aantaItems) {
		setAantalItems(aantalItems);
	}

	public void betaal() { // gebruiker of speler betaalt -> munt in gleuf
		setMuntInGleuf(true);
	}

	public boolean draaiHendel() {
		if (muntInGleuf && itemInBak == false && aantalItems != 0) {
			aantalItems--;
			aantalMunten++;
			setMuntInGleuf(false);
			setItemInBak(true);
			return true;
		}
		neemMuntTerug();
		return false;
	}

	public void neemItem() {
		setItemInBak(false);
	}

	public void neemMuntTerug() {
		setMuntInGleuf(false);
	}

	public final void setAantalItems(int aantalItems) {
		if (aantalItems <= 0)
			throw new IllegalArgumentException("Aantal items moet > 0 zijn");
		this.aantalItems = aantalItems;
	}

	public int getAantalItems() {
		return this.aantalItems;
	}

	public final void setAantalMunten(int aantalMunten) {
		this.aantalMunten = aantalMunten;
	}

	public int getAantalMunten() {
		return this.aantalMunten;
	}

	public final void setMuntInGleuf(boolean muntInGleuf) {
		this.muntInGleuf = muntInGleuf;
	}

	public boolean isMuntInGleuf() {
		return this.muntInGleuf;
	}

	public void setItemInBak(boolean itemInBak) {
		this.itemInBak = itemInBak;
	}

	public boolean isItemInBak() {
		return itemInBak;
	}
}