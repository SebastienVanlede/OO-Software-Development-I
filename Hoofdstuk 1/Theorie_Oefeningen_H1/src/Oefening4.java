import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, sum;

		System.out.print("Geef een eerste getal: ");
		a = input.nextInt();
		System.out.print("Geef een tweede getal: ");
		b = input.nextInt();
		System.out.print("Geef een derde getal: ");
		c = input.nextInt();

		sum = a * b * c;
		
		System.out.printf("De vermenigvuldiging van %d, %d en %d is %d", a, b, c, sum);

	}

}
