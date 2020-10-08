package cui;

import java.util.Scanner;

public class Oefening14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int totaal = 0, punt, puntenteller = 0;
		double klasGem;

		do {
			System.out.printf("Geef score %d (/20) of stop met -1: ", puntenteller + 1);
			punt = input.nextInt();
		} while (punt < -1 || punt > 20);

		while (punt != -1) {
			puntenteller++;
			totaal += punt;

			if (puntenteller == 10) {
				break;
			}

			do {
				System.out.printf("Geef score %d (/20) of stop met -1: ", puntenteller + 1);
				punt = input.nextInt();
			} while (punt < -1 || punt > 20);
		}

		if (puntenteller != 0) {
			klasGem = (double) totaal / puntenteller;
			System.out.printf("Het klasgemiddelde is %.2f", klasGem);
		} else {
			System.out.print("Er werden geen getallen ingevoerd");
		}
	}

}
