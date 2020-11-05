package cui;

import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int studenten;

		System.out.println("Hoeveel student(en) zijn er");
		studenten = input.nextInt();

		System.out.print(studenten == 1 ? "Student" : "Studenten");
	}

}
