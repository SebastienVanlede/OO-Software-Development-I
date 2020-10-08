import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maandsalaris, jaarsalaris, procent;
		double vakantiegeld;
		
		
		System.out.print("Geef je maandsalaris in euro: ");
		maandsalaris = input.nextInt();
		
		jaarsalaris = maandsalaris * 12;
		vakantiegeld = jaarsalaris * 0.08;
		
		System.out.printf("Jaarsalaris = %d € %n", jaarsalaris);
		System.out.printf("Vakantiegeld = %d € %n", vakantiegeld);

		
		
		
		
		
		
		
	}

}
