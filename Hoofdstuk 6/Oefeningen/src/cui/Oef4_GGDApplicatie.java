package cui;

import java.util.Scanner;

public class Oef4_GGDApplicatie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int teller, noemer;

		System.out.print("Geef een geheel getal voor de teller van de breuk: ");
		teller = input.nextInt();

		do {
			System.out.print("Geef een geheel getal verschillend van nul voor de noemer van de breuk: ");
			noemer = input.nextInt();
		} while (noemer == 0);

		int ggd = Oef4_Berekening.berekenGrootsteGemeneDeler(teller, noemer);

		System.out.printf("De grootste gemene deler van %d en %d is %d%n", teller, noemer, ggd);

		if (ggd == 1) {
			System.out.printf("We kunnen de breuk %d / %d dus niet vereenvoudigen", teller, noemer);
		} else {
			System.out.printf("We kunnen de breuk %d / %d dus vereenvoudigen tot %d / %d", teller, noemer, teller / ggd,
					noemer / ggd);
		}
		
		input.close();

	}

}
