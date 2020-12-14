package cui;

import domein.Grijpkraan;
import domein.KauwgomAutomaat;

public class AutomaatApplicatie {
	public static void main(String[] args) {
		KauwgomAutomaat ka = new KauwgomAutomaat(200);
		final int aantalPogingen = 10;

		System.out.printf("%d keer aan de hendel draaien van een kauwgomautomaat met %d kauwgomballen:%n",
				aantalPogingen, ka.getAantalItems());
		// TO DO
		for (int i = 1; i <= aantalPogingen; i++) {
			ka.betaal();
			Boolean resDraai = ka.draaiHendel();
			String uitvoer = resDraai ? String.format("%s kauwgombal", ka.bepaalKleur()) : "Er is iets misgegaan";
			System.out.printf("Poging %d: %s%n", i, uitvoer);
			ka.neemItem();
		}

		Grijpkraan g = new Grijpkraan(20);

		System.out.printf("%d keer aan de hendel draaien van een grijpkraan met %d prijzen:%n", aantalPogingen,
				g.getAantalItems());
		// TO DO

		for (int i = 1; i <= aantalPogingen; i++) {
			g.betaal();
			Boolean resDraai = g.draaiHendel();
			String uitvoer = resDraai ? "Prijs gewonnen" : "Niets gewonnen";
			System.out.printf("Poging %d: %s%n", i, uitvoer);
			if (g.isItemInBak()) {
				g.neemItem();

			}
		}

		// zonder te betalen
		System.out.print("Zonder te betalen...");
		System.out.println(ka.draaiHendel() ? "toch gelukt!" : "mislukt!");
		System.out.println();

		// munt teruggenomen!
		System.out.print("Munt teruggenomen...");
		ka.betaal();
		ka.neemMuntTerug();
		System.out.println(ka.draaiHendel() ? "toch gelukt!" : "mislukt!");
		System.out.println();

		// item vergeten uit te nemen!
		System.out.println("Twee pogingen, maar vergeten item er uit te nemen na de eerste...");
		ka.betaal();
		System.out.printf("Poging 1: %s%n", ka.draaiHendel() ? "kauwgombal in bak" : "geen kauwgombal in bak");
		ka.betaal();
		System.out.printf("Poging 2: %s%n%n",
				ka.draaiHendel() ? "tweede kauwgombal in bak" : "eerste kauwgombal zit er nog in");

		// items zijn allemaal op!
		System.out.println("En als alle items op zijn...");
		KauwgomAutomaat ka2 = new KauwgomAutomaat(1);
		ka2.betaal();
		System.out.printf("Poging 1: %s%n", ka2.draaiHendel() ? "kauwgombal in bak" : "geen kauwgom meer");
		ka2.neemItem();
		ka2.betaal();
		System.out.printf("Poging 2: %s%n%n", ka2.draaiHendel() ? "kauwgombal in bak" : "geen kauwgom meer");
	}
}