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

	public String getNaam() {
		return this.naam;
	}

	public int geefWinst(List<Integer> nummers) {
		int winst = 0, aantalJuisteNummers = 0;
		for (int nummer : nummers) { // overloopt alle nummers van het lid
			if (this.nummers.contains(nummer))
				aantalJuisteNummers++;
		}

		// 0, 1 of 2 => winst == 0 => niet behandelen, winst staat al op 0
		winst = switch (aantalJuisteNummers) {
		case 3, 4 -> 5;
		case 5 -> 10;
		case 6 -> 50;
		default -> 0;
		};

		return winst;
	}
}