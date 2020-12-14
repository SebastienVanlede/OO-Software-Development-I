package ui;

import domein.DomeinController;

public class VoorwerpApplicatie_Oef3 {

	private DomeinController dc;

	public VoorwerpApplicatie_Oef3() {
		dc = new DomeinController();
	}
	
	public void start() {
		System.out.printf("Beginsituatie:%n%s%n%n", dc.geefOverzicht());
		
		dc.voegWapenToe("Colt", 1.5, 3, 6, false);
		dc.voegSleutelToe("Voordeur", 0.5, 3, 1);
		dc.voegWapenToe("Brown", 0.5, 1,23, true);
		dc.voegSleutelToe("Achterdeur", 0.5, 1, 2);
		System.out.printf("Na het toevoegen van enkele wapens en sleutels:%n%s", dc.geefOverzicht());
	}
	
	
}
