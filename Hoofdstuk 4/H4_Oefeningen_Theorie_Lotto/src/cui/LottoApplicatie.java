package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class LottoApplicatie {

	public static void main(String[] args) {
		// applicatie babbelt enkel met DC, DC == aanspreekpunt
		DomeinController dc = new DomeinController();
		Scanner input = new Scanner(System.in);
		String naam;
		List<Integer> nummers = new ArrayList<>();

		System.out.println("Registreer een trekking: ");
		System.out.print("Geef de naam van de trekking: ");
		naam = input.next(); // naam = input.nextLine(); (nextLine() laat spaties toe)

		for (int i = 1; i <= 6; i++) {
			System.out.printf("Geef %d%s nummer in > ", i, i == 1 ? "ste" : "de");
			nummers.add(input.nextInt());
		}

		dc.registreerTrekking(naam, nummers);
		
		System.out.println("De trekking werd geregistreerd");

	}

}
