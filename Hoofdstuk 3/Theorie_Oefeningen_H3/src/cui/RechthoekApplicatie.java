package cui;

import domein.Rechthoek;

public class RechthoekApplicatie {

	public static void main(String[] args) {
		Rechthoek recht1 = new Rechthoek(50, 70);
		System.out.printf("De lengte van de rechthoek is: %.1f%n", recht1.getLengte());
		System.out.printf("De breedte van de rechthoek is: %.1f%n", recht1.getBreedte());
		System.out.printf("De oppervlakte van de rechthoek is %.1f%n", recht1.berekenOppervlakte());
		System.out.printf("De omtrek van de rechthoek is %.1f%n", recht1.berekenOmtrek());

	}

}
