package Oefeningen;

import java.util.Scanner;

public class Oefening8_Nieuwjaar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int datum;
		
		System.out.print("Geef een datum in <ddmmjj>: ");
		datum = input.nextInt();
		
		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!");
	}

}
