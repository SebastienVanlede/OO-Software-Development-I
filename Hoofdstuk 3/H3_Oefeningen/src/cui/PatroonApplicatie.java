package cui;

import domein.Patroon;

public class PatroonApplicatie {

	public static void main(String[] args) {
		Patroon patroon = new Patroon('D', '*');
		
		System.out.print(patroon.teken());
	}

}
