package cui;

public class Oefening7 {

	public static void main(String[] args) {
		// Deel 1
		int[] getal = { 4, 8, 2, 3, 5, 17, 7, 99, 3, 12 };
		int kleinste = Integer.MAX_VALUE;
		for (int element : getal) {
			if (element < kleinste)
				kleinste = element;
		}
		
		// Deel 2
		for (int element : getal) {
			getal[element] *= 2;
		}
	}

}
