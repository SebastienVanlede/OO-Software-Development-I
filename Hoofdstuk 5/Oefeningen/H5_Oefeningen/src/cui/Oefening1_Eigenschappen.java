package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening1_Eigenschappen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> posEig = new ArrayList<>();
		List<String> negEig = new ArrayList<>();
		int aantalEig = 0, eigenschap = 0;

		do {
			do {
				System.out.println("Is het een positieve [1] of een negatieve [2] eigenschap?");
				eigenschap = input.nextInt();
				if (eigenschap == 1) {
					System.out.println("Omschrijf deze eigenschap: ");
					posEig.add(input.next());
				} else if (eigenschap == 2) {
					System.out.println("Omschrijf deze eigenschap: ");
					negEig.add(input.next());
				}
			} while (!(eigenschap == 1 || eigenschap == 2));
			aantalEig++;

		} while (aantalEig < 3);

		if (posEig.isEmpty()) {
			System.out.print("Geen positieve eigenschappen");
			System.out.print("\nNegatieve eigenschappen: " + String.valueOf(negEig));

		} else if (negEig.isEmpty()) {
			System.out.print("Positieve eigenschappen: " + String.valueOf(posEig));
			System.out.print("\nGeen negatieve eigenschappen");
		} else {
			System.out.print("Positieve eigenschappen: " + String.valueOf(posEig));
			System.out.print("\nNegatieve eigenschappen: " + String.valueOf(negEig));

		}

		input.close();
	}

}
