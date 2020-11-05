package cui;

public class Oefening5 {

	public static void main(String[] args) {
		// A
		int y, x = 1, total = 0;

		while (x <= 10) {
			y = x * x;
			System.out.printf("%d%n", y);
			total += y;
			++x;
		}

		System.out.printf("Total is %d%n", total);

		// B
		int count = 1;
		while (count <= 10) {
			System.out.println(count % 2 == 1 ? "****" : "+++++++");
			++count;
		}
	}

}
