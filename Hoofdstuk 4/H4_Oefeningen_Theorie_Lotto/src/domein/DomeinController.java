package domein;

import java.util.List;

public class DomeinController {
	private TrekkingRepository trekkingRepository;
	private Trekking geselecteerdeTrekking;

	public DomeinController() {
		trekkingRepository = new TrekkingRepository();
	}

	public void registreerTrekking(String naam, List<Integer> nummers) {
		Trekking trekking = new Trekking(naam, nummers);
		trekkingRepository.voegTrekkingToe(trekking);
	}

	public void selecteerTrekking(String naam) {
		geselecteerdeTrekking = trekkingRepository.geefTrekking(naam);
	}

	public int geefWinst(List<Integer> nummers) {
		return geselecteerdeTrekking.geefWinst(nummers);
	}
}