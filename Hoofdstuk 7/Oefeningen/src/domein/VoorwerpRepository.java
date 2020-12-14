package domein;

import java.util.ArrayList;
import java.util.List;

public class VoorwerpRepository {

	private List<Voorwerp> voorwerpen;

	public VoorwerpRepository() {
		voorwerpen = new ArrayList<>();
	}

	public void voegVoorwerpToe(Voorwerp voorwerp) {
		voorwerpen.add(voorwerp);
	}

	public String geefOverzicht() {
		if (voorwerpen.isEmpty()) {
			return "collectie is leeg";
		}
		String result = "";
		for (Voorwerp voorwerp : voorwerpen) {
			result += voorwerp.toString();
			result += "\n";

		}
		return result;
	}
}
