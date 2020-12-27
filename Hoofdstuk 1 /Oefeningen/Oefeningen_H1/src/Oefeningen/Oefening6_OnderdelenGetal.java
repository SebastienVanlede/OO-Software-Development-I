package Oefeningen;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal;

		System.out.printf("Geef een getal (>=999 en <= 9999) in: ");
		getal = input.nextInt();

		int duizendtallen, honderdtallen, tientallen, eenheden;
		duizendtallen = getal / 1000;
		getal = getal % 1000;
		honderdtallen = getal / 100;
		getal = getal % 100;
		tientallen = getal / 10;
		eenheden = getal % 10;

		System.out.printf("%s%n%d%s%n%d%s%n%d%s%n%d%s%n", "Het getal bestaat uit:", duizendtallen, " duizendtallen",
				honderdtallen, " hondertallen", tientallen, " tientallen", eenheden, " eenheden");
	/*
	// Other way (when uncommenting it will interfere with above):
	Scanner scanner = new Scanner(System.in);
        int inputNumber;
        
	do {
            System.out.printf("Give me a number from 999 to 9999: ");
            inputNumber = scanner.nextInt();
        } while (inputNumber <= 1000 || inputNumber > 9999);

        int duizendtallen, honderdtallen, tientallen, eenheden;
	
        duizendtallen = inputNumber / 1000;
        honderdtallen = (inputNumber - duizendtallen * 1000) / 100;
        tientallen = (inputNumber - duizendtallen * 1000 - honderdtallen * 100) / 10;
        eenheden = (inputNumber - duizendtallen * 1000 - honderdtallen * 100 - tientallen * 10);

        System.out.printf("%d duizendtallen %n" +
                        "%d honderdtallen %n" +
                        "%d tientallen %n" +
                        "%d eenheden %n",
                duizendtallen, honderdtallen, tientallen, eenheden);
	*/
	
	}

}
