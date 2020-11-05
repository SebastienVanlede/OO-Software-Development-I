package cui;

public class Oefening15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 5; j++)
				System.out.print('@');

			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
