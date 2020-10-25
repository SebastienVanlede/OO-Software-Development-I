package domein;
// NIET JUIST
public class Patroon {
	// attributen
	private char type, opvulteken;

	// getters en setters
	public char getType() {
		return type;
	}

	private void setType(char type) {
		switch (type) {
		case 'A':
			type = 'A';
			break;
		case 'B':
			type = 'B';
			break;
		case 'C':
			type = 'C';
			break;
		case 'D':
			type = 'D';
			break;
		default:
			type = 'A';
			break;
		}
		this.type = type;
	}

	private void setOpvulteken(char opvulteken) {
		switch (opvulteken) {
		case '*':
			opvulteken = '*';
			break;
		case '+':
			opvulteken = '+';
			break;
		case '-':
			opvulteken = '-';
			break;
		case '!':
			opvulteken = '!';
			break;
		case '?':
			opvulteken = '?';
			break;
		default:
			opvulteken = '*';
			break;
		}
		this.opvulteken = opvulteken;
	}

	public char getOpvulteken() {
		return opvulteken;
	}

	// constructoren
	public Patroon(char type) {
		setType(type);
	}

	public Patroon(char type, char opvulteken) {
		setType(type);
		setOpvulteken(opvulteken);
	}

	public String teken() {
		return tekenPatroonD();

	}

	private String tekenPatroonA() {
		for (int rij = 1; rij <= 10; rij++) { // zorgt voor 10 rijen
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(opvulteken);
			}
			System.out.println();

		} // tekent Patroon a
		return tekenPatroonA();
	}

	private String tekenPatroonB() {
		for (int rij = 1; rij <= 10; rij++) {
			for (int spatie = 1; spatie <= rij - 1; spatie++) {
				System.out.print(' ');
			}
			for (int ster = 10; ster >= rij; ster--) {
				System.out.print(opvulteken);
			}
			System.out.println();

		}
		return tekenPatroonB();
	}

	private String tekenPatroonC() {
		for (int rij = 1; rij <= 10; rij++) {
			for (int kol = 10; kol >= rij; kol--) {
				System.out.print(opvulteken);
			}
			System.out.println();

		}
		return tekenPatroonC();
	}

	private String tekenPatroonD() {
		for (int rij = 1; rij <= 10; rij++) {
			for (int spatie = 10; spatie >= rij; spatie--) {
				System.out.print(' ');
			}
			for (int i = 10; i >= rij; i--) {
				System.out.print(opvulteken);
			}
			System.out.println();

		}
		return tekenPatroonD();
	}

}
