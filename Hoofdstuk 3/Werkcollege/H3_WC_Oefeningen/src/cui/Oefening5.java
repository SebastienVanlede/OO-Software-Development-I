package cui;

import java.util.Scanner;

import domein.Driehoek;
import domein.Rechthoek;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, keuze, totaal = 0, opp50 = 0, rechthoekig = 0; // totaal = opp50 = rechthoekig = 0 -> zelfde als totaal = 0, opp50 = 0, rechthoekig = 0;
		double lengte, breedte;


		System.out.println("Rechthoeken en driehoeken \n-------------------------");
		System.out.print("Wil je graag nog een vorm ingeven? (0 = Stoppen, 1 = Rechthoek, 2 = Driehoek): ");
		keuze = input.nextInt();

		do {
			if (keuze == 1) {
				System.out.print("Geef de lengte van de rechthoek: ");
				lengte = input.nextDouble();
				System.out.print("Geef de breedte van de rechthoek: ");
				breedte = input.nextDouble();
				
				Rechthoek rechthoek = new Rechthoek(lengte, breedte);
				
				if (rechthoek.berekenOppervlakte() >= 50) {
					++opp50;
				}
				
				totaal++;

				System.out.print("Wil je graag nog een vorm ingeven? (0 = Stoppen, 1 = Rechthoek, 2 = Driehoek): ");
				keuze = input.nextInt();
			} else if (keuze == 2) {
				System.out.print("Geef de lengte van zijde A: ");
				a = input.nextInt();
				System.out.print("Geef de lengte van zijde B: ");
				b = input.nextInt();
				System.out.print("Geef de lengte van zijde C: ");
				c = input.nextInt();
				
				Driehoek driehoek = new Driehoek(a, b, c);
				
				if (driehoek.isRechthoekigeDriehoek()) {
					++rechthoekig;
				}

				totaal++;

				System.out.print("Wil je graag nog een vorm ingeven? (0 = Stoppen, 1 = Rechthoek, 2 = Driehoek): ");
				keuze = input.nextInt();
			}
		} while (keuze != 0); // while do gebruiken kan ook

		System.out.println("Overzicht vormen: ");
		System.out.printf(
				"Totaal aantal vormen: %d%nAantal rechthoeken met opp > 50: %d%nAantal rechthoekige driehoeken: %d",
				totaal, opp50, rechthoekig);
	}

}
