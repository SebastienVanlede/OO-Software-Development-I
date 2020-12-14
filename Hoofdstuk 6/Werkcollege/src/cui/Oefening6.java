package cui;

import domein.Vierkant;
import java.util.Scanner;

public class Oefening6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef de zijde van het vierkant in : ");
        int z = scan.nextInt();
        scan.nextLine(); //nodig om buffer volledig leeg te maken

        System.out.print("Geef het karakter in : ");
        String kar = scan.nextLine();

        String res;
        if (kar.length() == 0) {
            res = Vierkant.maakVierkant(z);
        } else {
            res = Vierkant.maakVierkant(z, kar.charAt(0));
        }

        System.out.println(res);
    }
}
