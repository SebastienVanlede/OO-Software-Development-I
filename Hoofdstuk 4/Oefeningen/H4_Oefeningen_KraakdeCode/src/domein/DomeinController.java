package domein;

import java.util.ArrayList;
import java.util.List;

public class DomeinController {
	private KopOfMuntSpel spel;

	public void maakSpel(int moeilijkheidsgraad) {
		spel = new KopOfMuntSpel(moeilijkheidsgraad);
	}

	public int geefScore(String geradenCode) {
		return spel.geefScore(geradenCode);
	}

	public boolean isGeraden(String geradenCode) {
		return spel.isGeraden(geradenCode);
	}

	public List<String> geefSpelInfo() {
		List<String> spelInfo = new ArrayList<>();
		spelInfo.add(spel.getCode());
		spelInfo.add(String.format("%d", spel.getMoeilijkheidsgraad()));
		return spelInfo;
	}
}