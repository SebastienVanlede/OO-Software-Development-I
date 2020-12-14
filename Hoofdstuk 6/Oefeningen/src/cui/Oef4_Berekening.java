package cui;

public class Oef4_Berekening {

	public static int berekenGrootsteGemeneDeler(int getal1, int getal2) {
        if (getal2 == 0) {
            return getal1;
        } else {
            return berekenGrootsteGemeneDeler(getal2, getal1 % getal2);
        }
    }
}
