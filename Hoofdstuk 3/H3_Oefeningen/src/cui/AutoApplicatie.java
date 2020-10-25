package cui;

import java.util.Scanner;

import domein.Auto;

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

	}

}
