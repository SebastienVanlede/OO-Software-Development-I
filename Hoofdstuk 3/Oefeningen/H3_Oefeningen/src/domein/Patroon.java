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
		this(type, ' ');
	}

	public Patroon(char type, char opvulteken) {
		setType(type);
		setOpvulteken(opvulteken);
	}

	public String teken() {
		switch (type) {
		case 'A':
			return tekenPatroonA();
		case 'B':
			return tekenPatroonB();
		case 'C':
			return tekenPatroonC();
		case 'D':
			return tekenPatroonD();
		}
		return null;

	}

	private String tekenPatroonA() {
		String string = "Patroon A";
		for (int rij = 0; rij <= 10; rij++) { // zorgt voor 10 rijen
			for (int kol = 1; kol <= rij; kol++) {
				System.out.print(opvulteken);
				string += opvulteken;

			}
			System.out.println();
			string += "\n";

		}
		return string;
	}

	private String tekenPatroonB() {
		StringBuilder sBuilder = new StringBuilder("Patroon B\n");
		String string = "Patroon B\n";
		for (int rij = 1; rij <= 10; rij++) {
			for (int spatie = 1; spatie <= rij - 1; spatie++) {
				System.out.print(' ');
				sBuilder.append(" ");

			}
			for (int ster = 10; ster >= rij; ster--) {
				System.out.print(opvulteken);
				sBuilder.append(opvulteken);

			}
			System.out.println();
			sBuilder.append("\n");

		}
		return sBuilder.toString();
	}

	private String tekenPatroonC() {
		String string = "Patroon C\n";
		for (int rij = 1; rij <= 10; rij++) {
			for (int kol = 10; kol >= rij; kol--) {
				System.out.print(opvulteken);
				string += opvulteken;

			}
			System.out.println();
			string += "\n";

		}
		return string;
	}

	private String tekenPatroonD() {
		String string = "Patroon D\n";
		for (int i = 1; i <= 10; i++) {
			for (int s = 0; s < 10 - i; s++) {
				System.out.print(' ');
				string += " ";

			}
			for (int c = 0; c < i; c++) {
				System.out.print(opvulteken);
				string += opvulteken;

			}
			System.out.println();
			string += "\n";
		}

		return string;
	}

	/*
	// Other way (uncommenting can cause interference):
	
	    // ------------------- attribute -------------------
	    private char type, opvulteken;

	    // ------------------- constructor -------------------
	    public Patroon(char type) {
		this(type, ' ');
	    }

	    public Patroon(char type, char opvulteken) {
		setType(type);
		setOpvulteken(opvulteken);
	    }

	    public String teken() {
		switch (type) {
		    case 'A':
			return tekenPatroonA();
		    case 'B':
			return tekenPatroonB();
		    case 'C':
			return tekenPatroonC();
		    case 'D':
			return tekenPatroonD();
		}
		return null;
	    }

	    private String tekenPatroonA() {
		String string = "Patroon A";
		for (int rij = 0; rij <= 10; rij++) { // zorgt voor 10 rijen
		    for (int kol = 1; kol <= rij; kol++) {
			string += opvulteken;
		    }
		    string += "\n";
		}
		return string;
	    }

	    private String tekenPatroonB() {
		StringBuilder sBuilder = new StringBuilder("Patroon B\n");
		for (int rij = 1; rij <= 10; rij++) {
		    for (int spatie = 1; spatie <= rij - 1; spatie++) {
			sBuilder.append(" ");
		    }
		    for (int ster = 10; ster >= rij; ster--) {
			sBuilder.append(opvulteken);
		    }
		    sBuilder.append("\n");
		}
		return sBuilder.toString();
	    }

	    private String tekenPatroonC() {
		String string = "Patroon C\n";
		for (int rij = 1; rij <= 10; rij++) {
		    for (int kol = 10; kol >= rij; kol--) {

			string += opvulteken;

		    }

		    string += "\n";

		}
		return string;
	    }

	    private String tekenPatroonD() {
		String string = "Patroon D\n";
		for (int i = 1; i <= 10; i++) {
		    for (int s = 0; s < 10 - i; s++) {
			string += " ";
		    }
		    for (int c = 0; c < i; c++) {
			string += opvulteken;
		    }
		    string += "\n";
		}

		return string;
	    }

	    // ------------------- getters and setters -------------------
	    public char getOpvulteken() {
		return this.opvulteken;
	    }

	    private void setOpvulteken(char opvulteken) {
		switch (opvulteken) {
		    case '*':
		    case '+':
		    case '-':
		    case '!':
		    case '?':
			break;
		    default:
			opvulteken = '*';
			break;
		}
		this.opvulteken = opvulteken;
	    }

	    public char getType() {
		return this.type;
	    }

	    private void setType(char type) {
		switch (type) {
		    case 'A':
		    case 'B':
		    case 'C':
		    case 'D':
			break;
		    default:
			type = 'A';
			break;
		}
		this.type = type;
	    }

	*/
}
