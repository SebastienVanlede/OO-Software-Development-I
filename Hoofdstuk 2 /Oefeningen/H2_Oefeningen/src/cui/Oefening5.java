package cui;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int getal, temp, grootste = 0, tweede = 0;

		for (int i = 1; i <= 10; i += 1) {
			System.out.printf("Geef getal %d in: ", i);
			getal = input.nextInt();

			if (getal > grootste) {
				temp = grootste;
				grootste = getal;
				tweede = temp;
			} else if (getal < grootste && getal > tweede)
				tweede = getal;
		}
		System.out.printf("Het op één na grootse getal is %d", tweede);

		/*
		// Other way (uncommenting can cause interference):
		Scanner scanner = new Scanner(System.in);
		int i, getal;

		ArrayList<Integer> intArr = new ArrayList<>();

		for (i = 1; i < 11; i++) {
		    do {
			System.out.printf("Geef getal %d in: ", i);
			getal = scanner.nextInt();
		    } while (getal < -100 || getal > 100);
		    intArr.add(getal);
		}

		getal = Integer.MIN_VALUE;
		for (i = 0; i < intArr.size(); i++) {
		    getal = Math.max(getal, intArr.get(i));
		}

		System.out.printf("Grootste: " + getal);
		*/
	}

}
