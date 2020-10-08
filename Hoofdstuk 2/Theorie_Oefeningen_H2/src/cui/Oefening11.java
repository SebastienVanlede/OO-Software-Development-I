package cui;

import java.util.Scanner;

public class Oefening11 {

	public static void main(String[] args) {

		int aantalLeeuwen = 50, toename, aantalJaren = 0;

		do {
			toename = aantalLeeuwen * 15 / 100;
			aantalLeeuwen += toename;
			aantalJaren++;
		} while (aantalLeeuwen <= 1000);

		System.out.printf("Het duurde %d jaar voor er 1000 leeuwen waren", aantalJaren);

	}

}
