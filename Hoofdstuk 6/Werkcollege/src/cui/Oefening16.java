package cui;

import domein.Kapitaal;
import java.util.Scanner;

public class Oefening16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double beginkapitaal, intrest;
        int aantalJaar;

        System.out.print("Geef je beginkapitaal (>0, 0 om te stoppen): ");
        beginkapitaal = s.nextDouble();

        while (beginkapitaal != 0) {

            System.out.print("Geef de intrestvoet [0-100]: ");
            intrest = s.nextDouble();
            do {
                System.out.print("Geef het aantal jaar: ");
                aantalJaar = s.nextInt();
            } while (aantalJaar < 0);

            Kapitaal k = new Kapitaal(beginkapitaal, intrest);
            System.out.printf("Een kapitaal van €%.2f, uitgezet tegen een "
                    + "intrest van %.2f%%, brengt na %d jaar €%.2f op.%n",
                    k.getBeginBedrag(), k.getIntrest(), aantalJaar,
                    k.berekenKapitaalNaNJaar(aantalJaar));

            System.out.print("Geef je beginkapitaal (>0, 0 om te stoppen): ");
            beginkapitaal = s.nextDouble();

        }
        s.close();
    }

}
