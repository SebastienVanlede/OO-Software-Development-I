package Oefeningen;

import java.util.Scanner;

public class Oefening8_Nieuwjaar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een datum in <ddmmjjjj>: ");
		int getal = input.nextInt();

		int dag, maand, aantalDagenTotNieuwjaar;
		dag = getal / 1000000;
		maand = getal % 1000000 / 10000;
		aantalDagenTotNieuwjaar = 30 - dag + (12 - maand) * 30;

		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!%n", aantalDagenTotNieuwjaar);
	}

}
