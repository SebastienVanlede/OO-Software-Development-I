package cui;

public class Oefening16 {

	public static void main(String[] args) {
		/*
		 * System.out.println("Patroon A:"); for (int rij = 1; rij <= 10; rij++) { //
		 * zorgt voor 10 rijen for (int kol = 1; kol <= rij; kol++) {
		 * System.out.print('*'); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * System.out.println("Patroon C:"); for (int rij = 1; rij <= 10; rij++) { for
		 * (int kol = 10; kol >= rij; kol--) { System.out.print('*'); }
		 * System.out.println();
		 * 
		 * }
		 */

		System.out.println("Patroon B");
		for (int rij = 1; rij <= 10; rij++) {
			for (int spatie = 1; spatie <= rij-1; spatie++) {
				System.out.print(' ');
			}
			for (int ster = 10; ster >= rij; ster--) {
				System.out.print('*');
			}
			System.out.println();

		}
	}

}
