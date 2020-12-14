package ui;

import java.util.ArrayList;
import java.util.List;

import domein.VerplaatsingPerAuto;
import domein.VerplaatsingPerBusTram;

public class VerplaatsingApplicatie_Oef2 {
	public void start() {
		List<VerplaatsingPerAuto> auto = new ArrayList<>();
		List<VerplaatsingPerBusTram> busTram = new ArrayList<>();

		VerplaatsingPerAuto auto1 = new VerplaatsingPerAuto("Hogent Campus Schoonmeersen", "EFFIX Waregem", 35.1, 1.591,
				0.0538);
		VerplaatsingPerAuto auto2 = new VerplaatsingPerAuto("Hogent campus Aalst", "Brenso NV Affligem", 12.4, 1.591,
				0.0538);

		VerplaatsingPerBusTram bus1 = new VerplaatsingPerBusTram("Hogent campus schoonmeersen", "technologiepark", 52.3,
				70, true, false);
		VerplaatsingPerBusTram bus2 = new VerplaatsingPerBusTram("Hogent campus schoonmeersen", "koremarkt", 87.5, 22,
				false, true);

		auto.add(auto1);
		auto.add(auto2);
		busTram.add(bus1);
		busTram.add(bus2);

		double prijs = 0;
		for (VerplaatsingPerAuto aut : auto) {
			prijs += aut.berekenPrijs();
			System.out.printf("\n%s\nKosten voor deze verplaatsing: €%.2f\n", aut.toString(), prijs);
		}
		for (VerplaatsingPerBusTram bT : busTram) {
			prijs += bT.berekenPrijs();
			System.out.printf("\n%s\nKosten voor deze verplaatsing: €%.2f\n", bT.toString(), bT.berekenPrijs());
		}
		System.out.printf("\nTotale kosten voor alle verplaatsingen samen: € %.2f", prijs);
	}
}
