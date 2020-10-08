package Oefeningen;

import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal1, getal2, getal3, som, gemiddelde, rest;
		
		System.out.print("Geef een eerste getal in: ");
		getal1 = input.nextInt();
		System.out.print("Geef een tweede getal in: ");
		getal2 = input.nextInt();
		System.out.print("Geef een derde getal in: ");
		getal3 = input.nextInt();
		
		som = getal1 + getal2 + getal3;
		gemiddelde = som / 3;
		rest = gemiddelde%3;
		
		
		System.out.printf("Van de ingevoerde getallen %d, %d en %d%n is de som %d%n het gemiddelde %d%n en de rest %d", getal1, getal2, getal3, som, gemiddelde, rest);
	}

}
