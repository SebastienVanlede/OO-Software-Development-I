package cui;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 5, temp = 22;

		if (0 <= x)
			System.out.printf("Positief%n");
		else
			System.out.printf("Negatief%n");

		if (10 >= temp)
			System.out.printf("Koud%n");
		else if (20 > temp)
			System.out.printf("Goed%n");
		else
			System.out.printf("Warm%n");

		if (x >= 0)
			if (x % 2 == 0)
				System.out.print("Positief en even");
			else
				System.out.print("Positief en oneven");
		else if (x % 2 == 0)
			System.out.print("Negatief en even");
		else
			System.out.print("Negatief en oneven");

	}

}
