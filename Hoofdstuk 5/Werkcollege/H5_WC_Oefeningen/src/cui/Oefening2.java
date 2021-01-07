package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;
		String getalString;
		List<Integer> nummers = new ArrayList<>();

		do {
			System.out.println("Geef een getal van 8 cijfers: ");
			getal = input.nextInt();
			getalString = String.valueOf(getal);
		} while (getalString.length() != 8);

		for (int index = 0; index < 8; index++) { // wordt 8 keer uitgevoerd -> 8 cijfers
			int temp = Character.getNumericValue(getalString.charAt(index));
			if (!nummers.contains(temp)) {
				nummers.add(temp);
			}
		}

		System.out.print("Alle verschillende cijfers in dit geval (in volgorde van voorkomen) zijn: \n");
		for (int element : nummers) {
			System.out.printf("%d ", element);
		}
		input.close();

		/*
		//Other way (uncommenting can cause interference):
		Scanner scanner = new Scanner(System.in);
		int input;

		do {
		    System.out.print("Geef een getal van 8 cijfers: ");
		    input = scanner.nextInt();
		} while (Integer.toString(input).length() != 8);

		System.out.printf("Alle verschillende cijfers in dit getal (in volgorde van voorkomen) zijn: %n");
		String[] arrOfStr = Integer.toString(input).split("");

		for (String str: arrOfStr) {
		    System.out.printf("%s ", str);
		}
		*/
	}

}
