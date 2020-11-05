package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class LottoApplicatie_UC2 {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		Scanner input = new Scanner(System.in);
		String naam;
		List<Integer> nummers;

		System.out.print("Geef de naam van de trekking waarvoor je de nummers wilt contoleren > ");
		naam = input.nextLine();
		
		dc.selecteerTrekking(naam);
		
		do {
			nummers = new ArrayList<>();
			for (int i = 1; i <= 6; i++) { // 6 keer
				System.out.printf("Geef %d%s nummer in > ", i, i == 1 ? "ste" : "de");
				nummers.add(input.nextInt());
			}
			System.out.printf("Met deze nummers win je %d euro.", dc.geefWinst(nummers));
			System.out.println("Wil je nog nummers controleren? (1; Ja, 2: Nee)");
		} while (input.nextInt() == 1);
	}

}
