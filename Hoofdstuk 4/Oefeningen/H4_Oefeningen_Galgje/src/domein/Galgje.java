package domein;

public class Galgje {
	private String reedsGeradenLetters;
	private int aantalMissers;
	private GeheimWoord geheimWoord;

	public Galgje(GeheimWoord geheimWoord) {
		this.geheimWoord = geheimWoord;
		reedsGeradenLetters = "";
		aantalMissers = 0;
	}

	public void verwerkLetter(char letter) {
		if (geheimWoord.bevatLetter(letter) == true) {
			reedsGeradenLetters += letter;
		} else {
			aantalMissers++;
		}
	}

	public String geefGemaskeerdWoord() {
		String gemaskeerdWoord = "";
		String gezochteWoord = geheimWoord.getGezochteWoord();
		for (int i = 0; i < gezochteWoord.length(); i++) {
			if (reedsGeradenLetters.indexOf(gezochteWoord.charAt(i)) != -1) {
				gemaskeerdWoord += gezochteWoord.charAt(i);
			} else {
				gemaskeerdWoord += "*";
			}
		}
		return gemaskeerdWoord;

	}

	public boolean isWoordGeraden() {
		return geefGemaskeerdWoord().indexOf('*') == -1;
	}

	public int geefScore() {
		return Math.max(geheimWoord.getWaarde() - aantalMissers, 0);
	}

	public boolean isGedaan() {
		return isWoordGeraden() || aantalMissers == 10;
	}

	public String geefGezochteWoord() {
		return geheimWoord.getGezochteWoord();
	}

	public void setAantalMissers(int aantalMissers) {
		this.aantalMissers = aantalMissers;
	}

	public int getAantalMissers() {
		return this.aantalMissers;
	}
}