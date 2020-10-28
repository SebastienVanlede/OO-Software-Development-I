package domein;

import java.util.List;

public class DomeinController {
	private Jackpot jackpot;

	public void startNieuweJackpot() {
		jackpot = new Jackpot();
	}

	public List<Integer> geefGetallenVanWielen() {
		return jackpot.geefGetallenVanWielen();
	}

	public void speel() {
		jackpot.speel();
	}

	public int geefScore() {
		return jackpot.geefScore();
	}
}