package cui;

import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal, waarde = 0;

		System.out.print("Geef een getal in: ");
		getal = input.nextInt();

		if (getal > 0) {
			System.out.print("Het ingegeven getal was strikt positief en werd verminderd met 10.");
			waarde = getal - 10;
		} else if (getal == 0) {
			System.out.print("Het ingegeven getal was nul en werd vermeerderd met 1.");
			waarde = getal + 1;
		} else {
			System.out.print("Het ingegeven getal was negatief en werd vermeerderd met 10.");
			waarde = getal + 10;
		}
		
		System.out.printf("%nHet heeft nu de waarde %d", waarde);
	}

}