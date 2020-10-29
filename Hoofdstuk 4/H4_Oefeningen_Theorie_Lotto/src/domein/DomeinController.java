package domein;

import java.util.List;

public class DomeinController {
	private TrekkingRepository trekkingRepository;

	public DomeinController() {
		trekkingRepository = new TrekkingRepository();
	}

	public void registreerTrekking(String naam, List<Integer> nummers) {
		Trekking trekking = new Trekking(naam, nummers);
		trekkingRepository.voegTrekkingToe(trekking);
	}
}