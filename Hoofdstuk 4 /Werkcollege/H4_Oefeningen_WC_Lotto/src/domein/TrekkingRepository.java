package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import domein.Trekking;

public class TrekkingRepository {
	private List<Trekking> trekkingen;

	public TrekkingRepository() {
		trekkingen = new ArrayList<>();
	}

	public void voegTrekkingToe(Trekking trekking) {
		trekkingen.add(trekking);
	}

	public Trekking geefTrekking(String naam) {
		for (Trekking trekking : trekkingen) {
			if (trekking.getNaam().equals(naam))
				return trekking;
		}
		return null; // in het geval dat er geen trekking aanwezig is met naam naam
	}
}