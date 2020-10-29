package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class LottoApplicatie {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		Scanner input = new Scanner(System.in);
		int keuze;
		String naam;
		List<Integer> nummers;
		do {
			do {
				System.out.println("MENU");
				System.out.println("1. Registreer een trekking.");
				System.out.println("2. Controleer je nummers.");
				System.out.println("3. Stoppen.");
				keuze = input.nextInt();
			} while (keuze < 1 || keuze > 3);
			if (keuze == 1) {
				System.out.println("Registreer een trekking: ");
				System.out.print("Geef de naam van de trekking: ");
				naam = input.next();
				
				nummers = new ArrayList<>();
				for (int i = 1; i <= 6; i++) {
					System.out.printf("Geef %d%s nummer in > ", i, i == 1 ? "ste" : "de");
					nummers.add(input.nextInt());
				}

				dc.registreerTrekking(naam, nummers);

				System.out.println("De trekking werd geregistreerd");
			} else if (keuze == 2) {
				System.out.println("Geef de naam van de trekking waarvoor je de nummers wilt contoleren > ");
				naam = input.next();
				dc.selecteerTrekking(naam);

				nummers = new ArrayList<>();
				for (int i = 1; i <= 6; i++) {
					System.out.printf("Geef %d%s nummer in > ", i, i == 1 ? "ste" : "de");
					nummers.add(input.nextInt());
				}
				System.out.printf("Met deze nummers win je %d euro.%n", dc.geefWinst(nummers));
			}
		} while (keuze != 3);

	}

}
