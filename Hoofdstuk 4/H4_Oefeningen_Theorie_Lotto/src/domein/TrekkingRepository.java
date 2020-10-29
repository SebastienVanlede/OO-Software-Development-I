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
}