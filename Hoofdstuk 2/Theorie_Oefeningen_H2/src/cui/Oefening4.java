package cui;

public class Oefening4 {

	public static void main(String[] args) {
		// A
		int age = 19;

		if (age >= 65)
			System.out.println("Age greater than or equal to 65");
		else
			System.out.println("Age is less than 65");

		// B
		int x = 1, total = 0;

		while (x <= 10) {
			total += x;
			x++;
		}

		// C
		int z = 10;
		while (z <= 100) {
			total += z;
			z++;
		}
	}

}
