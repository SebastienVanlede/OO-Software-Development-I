package cui;

import domein.Oef5_Stappenteller;
import java.util.Scanner;

public class Oef5_StappentellerApp {
	public static void main(String[] args) {
		Oef5_StappentellerApp sa = new Oef5_StappentellerApp();

		int beginuur = sa.voerUurIn("Geef het uur waarop je bent opgestaan", 0, 23);
		int einduur = sa.voerUurIn("Geef het uur waarop je bent gaan slapen", beginuur, 23);

		int totaal = 0;
		String uitvoer = String.format("%4S%40S%10S%n%n", "uur", "activiteit", "#stappen");

		for (int uren = beginuur; uren <= einduur; uren++) {
			Oef5_Stappenteller s = sa.maakStappenteller(uren);
			int stappen = s.geefAantalStappen();
			uitvoer += String.format("%4d%s%n", uren, s);
			totaal += stappen;
		}

		uitvoer += String.format("%n%44S%10d%n", "totaal", totaal);
		System.out.println("\n" + uitvoer);
	}

	private int voerUurIn(String prompt, int van, int tot) {
		Scanner input = new Scanner(System.in);
		int uur;
		do {
			System.out.printf("%s (tussen %d en %d): ", prompt, van, tot);
			uur = input.nextInt();
		} while (uur < van || uur > tot);
		return uur;
	}

	private Oef5_Stappenteller maakStappenteller(int hetUur) {
		Scanner input = new Scanner(System.in);
		String wat;
		int aantal, soort;
		System.out.printf("Wat heb je om %du gedaan? ", hetUur);
		wat = input.nextLine();
		do {
			System.out.print("Hoeveel stappen heb je gezet (max. 1000)? ");
			aantal = input.nextInt();
		} while (aantal < 0 || aantal > 1000);
		do {
			System.out.printf("Geef 1 voor een activiteit op vlakke grond, %n2 voor een activiteit bergop"
					+ " en 3 voor een activiteit bergaf. %nWelk soort activiteit was dit? ");
			soort = input.nextInt();
		} while (soort < 1 || soort > 3);
		return new Oef5_Stappenteller(wat, aantal, soort);
	}
}