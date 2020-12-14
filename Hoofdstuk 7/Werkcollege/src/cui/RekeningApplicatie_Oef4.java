package cui;

import domein.DomeinController;

public class RekeningApplicatie_Oef4 {
	public final DomeinController dc; // dc globaal
	
	public RekeningApplicatie_Oef4(DomeinController dc) { // dc is lokaal voor RekeningApplicatie
		this.dc = dc; // globale dc wijst nu ook naar lokale dc
	}
	
	public void werkMetRekeningen() {
		System.out.println(dc.geefRekeningen());
	}

}
