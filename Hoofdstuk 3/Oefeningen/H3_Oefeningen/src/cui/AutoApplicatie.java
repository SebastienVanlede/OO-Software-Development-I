package cui;

import java.util.Scanner;
import domein.Auto;
import java.util.ArrayList;
import com.sun.xml.internal.bind.v2.runtime.property.StructureLoaderBuilder;

public class AutoApplicatie {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String kleur = " ", merk = " ";
		int keuze, grijs = 0, geregistreerd = 0;
		Auto auto1 = new Auto();
		Auto auto2 = new Auto(kleur, merk);

		System.out.println("Registratie auto");
		System.out.printf(" (1) Auto (alles standaard) %n (2) Auto met gekozen kleur%n");
		System.out.printf("%nWens je nog een auto te registreren?");
		keuze = inputScanner.nextInt();

		do {
			if (keuze == 1) {
				grijs++;
				geregistreerd++;

				System.out.println("Registratie auto");
				System.out.printf(" (1) Auto (alles standaard) %n (2) Auto met gekozen kleur%n");
				System.out.printf("%nWens je nog een auto te registreren?");
				keuze = inputScanner.nextInt();
			} else if (keuze == 2) {
				System.out.printf("Geef een kleur: ");
				kleur = inputScanner.next();
				if (kleur == "grijs") {
					grijs++;
				}

				geregistreerd++;

				System.out.println("Registratie auto");
				System.out.printf(" (1) Auto (alles standaard) %n (2) Auto met gekozen kleur%n");
				System.out.printf("%nWens je nog een auto te registreren?");
				keuze = inputScanner.nextInt();

			}
		} while (keuze == 1 || keuze == 2);

		System.out.printf("Aantal geregistreerde auto's: %d%nAantal grijze auto's: %d%n", geregistreerd, grijs);

		/*
		// Other way (uncommenting can cause interference):
		Scanner scanner = new Scanner(System.in);

		ArrayList<Auto> autos = new ArrayList<Auto>();
		int intInput, grijzeAutos = 0;
		String stringInput = "";


		do {
		    System.out.printf("Registratie auto%n (1) Auto (alles standaard)%n (2) Auto met gekozen kleur");
		    System.out.printf("%n%nWens je nog een auto te registreren (3 om te stoppen): ");
		    intInput = scanner.nextInt();

		    if (intInput == 1) {
			autos.add(new Auto());
		    }
		    if (intInput == 2) {
			System.out.printf("Geef een kleur: ");
			stringInput = scanner.next();
			autos.add(new Auto(stringInput));
		    }
		} while (intInput != 3);

		for (int i = 0; i < autos.size(); i++) {
		    Auto auto = autos.get(i);
		    if (auto.getKleur().equals("grijs")) {
			grijzeAutos++;
		    }
		}
		System.out.printf("Aantal geregistreerde auto's: %d%n" +
			"Aantal grijze auto's: %d", autos.size(), grijzeAutos);
		*/
	}

}
