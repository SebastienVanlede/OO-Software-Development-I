package Oefeningen;

import java.util.Scanner;

public class Oefening5_Rechthoek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lengte, breedte, omtrek, oppervlakte;

		System.out.print("Geef de lengte van de rechthoek in: ");
		lengte = input.nextInt();
		System.out.print("Geef de breedte van de rechthoek in: ");
		breedte = input.nextInt();

		omtrek = lengte * 2 + breedte * 2;
		oppervlakte = lengte * breedte;
		
		System.out.printf("De omtrek = %d%n", omtrek);
		System.out.printf("De oppervlakte is = %d", oppervlakte);
	}

}
