package cui;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;

		do {
			System.out.print("Geef een strikt positief geheel getal in: ");
			getal = input.nextInt();
		} while (getal <= 0);

		System.out.printf("De delers zijn: 1");
		for (int i = 2; i <= getal / 2; i++) {
			if (getal % i == 0)
				System.out.printf("%4d", i);
		}
		System.out.printf(" en %d", getal);

	}
}