package cui;

import java.util.Scanner;

public class Oefening9A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int getal, negatief = 0;
		double gem = 0, som = 0;

		System.out.print("Geef een getal (-1 om te stoppen): ");
		getal = input.nextInt();

		while (getal != -1) {

			if (getal < 0) {
				som += getal;
				negatief++;

			}

			System.out.print("Geef een getal (-1 om te stoppen): ");
			getal = input.nextInt();

		}

		if (negatief == 0)
			System.out.print("Er werden geen negatieve getallen ingevoerd");
		else {
			gem = som / negatief;
			System.out.printf("Het gemiddelde van alle negatieve getallen is %.3f", gem);
		}

		
		

	}

}
