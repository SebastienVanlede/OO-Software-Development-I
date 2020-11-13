package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oefening1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// invoer double stop -1
		Scanner input = new Scanner(System.in);
		double bedrag;
		List<Double> deLijst = new ArrayList<>();

		System.out.print("Geef positief bedrag, stop met -1: ");
		bedrag = input.nextDouble();

		while (bedrag != -1) {
			if (bedrag >= 0) {
				deLijst.add(bedrag);
			}

			System.out.print("Geef positief bedrag, stop met -1: ");
			bedrag = input.nextDouble();
		}
		if (deLijst.isEmpty()) {
			System.out.println("De lijst is leeg!");
		} else {
			System.out.print("De lijst met bedragen: ");
			for (int index = 0; index < deLijst.size(); index++) {
				System.out.printf("%8.2f", deLijst.get(index));
			} // mogelijke oplossing

			System.out.print("De lijst met bedragen: ");
			for (double element : deLijst) {
				System.out.printf("%8.2f", element);
			} // mogelijke oplossing
		}
		input.close();

	}

}
