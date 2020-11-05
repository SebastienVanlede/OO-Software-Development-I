package domein;

public class GeheimWoord {
	private String gezochteWoord;
	private int waarde;

	public GeheimWoord(String woord, int waarde) {
		this.gezochteWoord = woord;
		this.waarde = waarde;
	}

	public boolean bevatLetter(char letter) {
		return gezochteWoord.indexOf(letter) != 1;
	}

	public void setGezochteWoord(String gezochteWoord) {
		this.gezochteWoord = gezochteWoord;
	}

	public String getGezochteWoord() {
		return gezochteWoord;
	}

	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}

	public int getWaarde() {
		return waarde;
	}
}