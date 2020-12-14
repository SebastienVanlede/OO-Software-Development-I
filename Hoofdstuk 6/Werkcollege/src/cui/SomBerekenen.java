package cui;

import java.util.Scanner;

public class SomBerekenen {

	public static void main(String[] args) {
		Scanner invoer = new Scanner(System.in);
		int n;

		System.out.print("Geef een geheel getal (>= 1): ");
		n = invoer.nextInt();
		System.out.printf("De som van de eerste %d getallen = %d.", n, berekenSom(n));
	}

	private static int berekenSom(int n) {
		// berekenSom(6) = 1 + 2 + 3 + 4 + 5 + 6 -> iteratief
//		int som = 0;
//		for(int i = 1 ; i <= n ; i++)
//			som += i;
//		return som; 

		// recursief 6 + 5 + 4 + 3 + 2 + 1
		if (n == 1) {
			return 1;
		} else {
			return n + berekenSom(n - 1);
		}
	}

}
