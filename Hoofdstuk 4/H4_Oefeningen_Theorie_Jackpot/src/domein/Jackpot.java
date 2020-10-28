package domein;

import java.util.*;
import domein.Wiel;

public class Jackpot {
	private List<Wiel> wielen;

	public Jackpot() {
		wielen = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			wielen.add(new Wiel());
		}

	}

	public List<Integer> geefGetallenVanWielen() {
		List<Integer> getallen = new ArrayList<>();
//		for (int i = 0; i < 3; i++) {
//			getallen.add(wielen.get(i).getGetal());
//		}
		for (Wiel wiel : wielen) {
			getallen.add(wiel.getGetal());
		}
		return getallen;
	}

	public void speel() {
		for (Wiel wiel : wielen) {
			wiel.draai();
		}
	}

	public int geefScore() {
		int getal1 = wielen.get(0).getGetal();
		int getal2 = wielen.get(1).getGetal();
		int getal3 = wielen.get(2).getGetal();

		if (getal1 == getal2 && getal2 == getal3) {
			if (getal1 == 9) {
				return 50;
			} else {
				return 10;
			}
		} else { // niet 3x hetzelfde getal
			if (getal1 == getal2 || getal1 == getal3 || getal2 == getal3) {
				return 5;
			}
		}

		return 0; // indien geen van voorgaande ifs waar is

	}
}