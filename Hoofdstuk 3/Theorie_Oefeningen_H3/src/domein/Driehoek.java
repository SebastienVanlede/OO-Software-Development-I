package domein;

public class Driehoek {

	// attributen
	private int a, b, c;

	// getters
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	// setters
	private void setA(int a) {
		this.a = a;
	}

	private void setB(int b) {
		this.b = b; 
	}

	private void setC(int c) {
		this.c = c; 
	}

	// constructors

	public Driehoek(int a, int b, int c) {
		setA(a > 0 ? a : 1);
		setB(b > 0 ? b : 1);
		setC(c > 0 ? c : 1);
	}

	public boolean isRechthoekigeDriehoek() {
		/*if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
			return true;
		} else {
			return false;
		}*/
		
		return a * a == b * b + c * c || 
				b * b == a * a + c * c || 
				c * c == b * b + a * a; 
	}

}
