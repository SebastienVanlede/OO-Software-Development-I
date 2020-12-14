package domein;

public class Oef12_Punt {

	private int xCoord, yCoord;

	public Oef12_Punt() {
		this(1, 1);
	}

	public Oef12_Punt(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", xCoord, yCoord);
	}

	private void controleerCoord(char xOfy, int coord) {
		if (coord <= 0) {
			throw new IllegalArgumentException(xOfy + "moet groter zijn dan 0");
		}
	}

	public int getXCoord() {
		return xCoord;
	}

	public void setXCoord(int xCoord) {
		this.xCoord = xCoord;
		controleerCoord('x', xCoord);
	}

	public int getYCoord() {
		return yCoord;
	}

	public void setYCoord(int yCoord) {
		this.yCoord = yCoord;
		controleerCoord('y', yCoord);
	}

}
