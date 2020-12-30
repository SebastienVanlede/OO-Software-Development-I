package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double input;
		ArrayList<Double> listPos = new ArrayList<>();

		do {
		    System.out.print("Geef positief bedrag, stop met -1: ");
		    input = scanner.nextDouble();
		    if (input >= 0) {
			listPos.add(input);
		    }
		} while (input != -1);

		if (listPos.isEmpty()) {
		    System.out.println("De lijst is leeg!");
		} else {
		    System.out.print("De lijst met bedragen: ");
		    for (int index = 0; index < listPos.size(); index++) {
			System.out.printf("%8.2f", listPos.get(index));
		    }
		}
		
		scanner.close();

	}

}
