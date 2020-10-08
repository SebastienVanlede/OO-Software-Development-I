package Oefeningen;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;
		
		System.out.printf("Geef een getal (>=999 en <= 9999) in: ");
		getal = input.nextInt();

		System.out.print("Het getal bestaat uit: %n");
		System.out.printf("%1d duizendtallen", getal);
	}

}
