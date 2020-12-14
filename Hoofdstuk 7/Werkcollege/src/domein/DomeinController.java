package domein;

import java.util.List;

public class DomeinController {
	private final RekeningRepository rr;
	
	public DomeinController() {
		rr = new RekeningRepository();
	}
	
	public String geefRekeningen() {
		List<Rekening> lijst = rr.geefGewijzigdeRekening();
		String uitvoerString = "";
		for (Rekening rek : lijst) {
			uitvoerString += String.format("%s%n", rek.toString());
		}
		return uitvoerString;
	}
}
