package cui;

import domein.Driehoek;

public class DriehoekApplicatie {

	public static void main(String[] args) {
		Driehoek drie1 = new Driehoek(60, 80, 100);
		System.out.printf("Zijde a = %d%n", drie1.getA());
		System.out.printf("Zijde b = %d%n", drie1.getB());
		System.out.printf("Zijde c = %d%n", drie1.getC());

		if (drie1.isRechthoekigeDriehoek() == true) {
			System.out.println("Is een rechthoekige driehoek");
		} else {
			System.out.println("Is geen rechthoekige driehoek");
		}
	}

}
