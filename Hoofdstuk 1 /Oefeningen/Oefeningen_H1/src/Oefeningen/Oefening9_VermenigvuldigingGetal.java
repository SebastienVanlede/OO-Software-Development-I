package Oefeningen;

import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;

		System.out.print("Geef een positief getal in: ");
		getal = input.nextInt();
		System.out.printf("%10d%10d%10d%10d%10d%n", 1, 10, 100, 1000, 10000);
		System.out.printf("%10d%10d%10d%10d%10d", getal * 1, getal * 10, getal * 100, getal * 1000, getal * 10000);

	}

}
