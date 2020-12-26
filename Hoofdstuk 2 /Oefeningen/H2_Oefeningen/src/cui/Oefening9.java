package cui;

import java.util.Scanner;

public class Oefening9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1, posGetal, getal = 0;

        do {
            System.out.print("Geef een strikt positief getal in: ");
            posGetal = scanner.nextInt();
        } while (posGetal <= 0);

        while (posGetal != 1) {
            if ((posGetal % 2) == 0) {
                posGetal /= 2;
            } else {
                posGetal *= 3;
                posGetal++;
            }
            getal++;
        }

        System.out.printf("Het getal wijzigt %d %s", getal, getal > 1 ? "keren" : "keer");
    }
}
