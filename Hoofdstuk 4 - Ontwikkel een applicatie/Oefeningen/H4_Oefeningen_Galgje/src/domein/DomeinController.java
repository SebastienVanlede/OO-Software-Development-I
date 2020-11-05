package domein;

public class DomeinController {
	private GeheimWoordRepository geheimWoordRepository;
	private Galgje galgje;

	public DomeinController() {
		geheimWoordRepository = new GeheimWoordRepository();
	}

	public void startGalgje() {
		galgje = new Galgje(geheimWoordRepository.geefWillekeurigGeheimWoord());
	}

	public void kiesLetter(char letter) {
		galgje.verwerkLetter(letter);
	}

	public String geefGemaskeerdWoord() {
		return galgje.geefGemaskeerdWoord();
	}

	public boolean isWoordGeraden() {
		return galgje.isWoordGeraden();
	}

	public int geefScore() {
		return galgje.geefScore();
	}

	public boolean isEindeGalgjeBereikt() {
		return galgje.isGedaan();
	}

	public String geefGezochteWoord() {
		return galgje.geefGezochteWoord();
	}

	public int geefAantalMissers() {
		return galgje.getAantalMissers();
	}
}