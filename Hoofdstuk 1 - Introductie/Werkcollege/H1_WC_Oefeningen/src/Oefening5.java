import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maandsalaris, jaarsalaris, vakantiegeld;

		System.out.print("Geef je maandsalaris in euro: ");
		maandsalaris = input.nextInt();

		jaarsalaris = maandsalaris * 12;
		vakantiegeld = jaarsalaris * 8 / 100;

		System.out.printf("Jaarsalaris = %d %nVakantieveld = %d", jaarsalaris, vakantiegeld);

	}

}
