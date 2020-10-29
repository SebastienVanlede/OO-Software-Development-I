package domein;

import java.util.ArrayList;
import java.util.List;

public class Trekking {
	private String naam;
	private List<Integer> nummers;

	public Trekking(String naam, List<Integer> nummers) {
		this.naam = naam;
		this.nummers = new ArrayList<>(nummers);
	}
}