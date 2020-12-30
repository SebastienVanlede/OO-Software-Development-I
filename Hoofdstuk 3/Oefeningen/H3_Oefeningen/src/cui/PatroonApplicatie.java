package cui;

import domein.Patroon;

public class PatroonApplicatie {

	public static void main(String[] args) {
		Patroon patroon = new Patroon('D', '*');
		
		System.out.print(patroon.teken());
		
		/*
		// Other way (uncommenting can cause interference):
		Patroon patroon;

		for (char alphabet = 'A'; alphabet <= 'D'; alphabet++) {
		    patroon = new Patroon(alphabet, '*');
		    System.out.printf(patroon.teken());
		}
		*/
	}

}
