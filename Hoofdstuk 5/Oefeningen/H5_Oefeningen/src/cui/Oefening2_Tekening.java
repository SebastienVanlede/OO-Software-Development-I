package cui;

public class Oefening2_Tekening {

	public static void main(String[] args) {
		int[] tekening = { 52, 0, 23, -3, 26, 0, 23, -6, 23, 0, 23, -7, 22, 0, 23, -7, 22, 0, 22, -8, 22, 0, 21, -9, 22,
				0, 20, -23, 9, 0, 18, -26, 8, 0, 7, -8, 2, -26, 9, 0, 7, -8, 2, -25, 10, 0, 7, -8, 2, -27, 8, 0, 7, -8,
				2, -26, 9, 0, 7, -8, 2, -24, 11, 0, 7, -8, 2, -25, 10, 0, 7, -8, 2, -24, 11, 0, 7, -8, 2, -23, 12, 0, 7,
				-8, 2, -22, 13, 0, 7, -8, 2, -21, 14, 0, 7, -8, 37, 0, 52, 0 };

		for (int i = 0; i < tekening.length; i++) {
			if (tekening[i] > 0) {
				for (int j = 0; j < tekening[i]; j++) {
					System.out.print("*");
				}
			} else if (tekening[i] < 0) {
				for (int j = 0; j > tekening[i]; j--) {
					System.out.print(" ");
				}
			}else if (tekening[i] == 0) {
				System.out.println();
			}

		}
	}

}
