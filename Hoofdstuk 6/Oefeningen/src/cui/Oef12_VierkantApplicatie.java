package cui;

import java.util.Scanner;

import domein.Oef12_Punt;
import domein.Oef12_Vierkant;

public class Oef12_VierkantApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Geef de x-coördinaat van de linkerbovenhoek in: ");
		int x = input.nextInt();
		System.out.print("Geef de y-coördinaat van de linkerbovenhoek in: ");
		int y = input.nextInt();
		System.out.print("De zijden van het vierkant hebben ook een lengte. Geef deze lengte in: ");
		int zijde = input.nextInt();

		Oef12_Punt punt = new Oef12_Punt(x, y);
		Oef12_Vierkant vierkant = new Oef12_Vierkant(x, y, zijde);
		System.out.print(vierkant);

		int keuze = maakKeuzeInMenu();

		do {
			if (keuze == 1) {
				vierkant.krimp();

			} else if (keuze == 2) {
				vierkant.groei();

			} else {
				System.out.print("Geef de x-coördinaat van de linkerbovenhoek in: ");
				x = input.nextInt();
				System.out.print("Geef de y-coördinaat van de linkerbovenhoek in: ");
				y = input.nextInt();

				punt.setXCoord(x);
				punt.setYCoord(y);
				vierkant = new Oef12_Vierkant(x, y, zijde);

			}
			System.out.print(vierkant);
			keuze = maakKeuzeInMenu();
		} while (keuze != 4);

	}

	private static int maakKeuzeInMenu() {
		Scanner inputScanner = new Scanner(System.in);
		int keuze;

		do {
			System.out.printf(
					"%nMenu:%n1) Krimpen van het bestaande vierkant%n2) Groeien van het bestaande vierkant%n3) Een nieuwe linkerbovenhoek definiëren%n4) Applicatie afsluiten%n");
			keuze = inputScanner.nextInt();
		} while (keuze < 1 || keuze > 4);

		return keuze;
	}

}
