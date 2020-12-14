package cui;

import domein.Doos;

public class Oefening4_Doos {

	public static void main(String[] args) {
		Oefening4_Doos oef = new Oefening4_Doos();
		Doos d1 = oef.maakDoos(true);
		Doos d2 = oef.maakDoos(false);

		drukDoosAf(1, d1);
		drukDoosAf(2, d2);

		System.out.printf("Dozen aanweizg in de applicatie: %d%n", Doos.getAantalDozen());
	}

	private static void drukDoosAf(int nummer, Doos d) {
		System.out.printf("Doos %d: %s%n", nummer, d.toString());
	}

	public Doos maakDoos(boolean automatisch) {
		Doos d;
		if (automatisch == true) {
			d = new Doos();
		} else {
			d = new Doos(5, 6, 8, "geel");
		}
		return d;
	}

}
