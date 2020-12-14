package domein;

import java.math.BigDecimal;

public class Zichtrekening {
	private BigDecimal saldo = BigDecimal.ZERO; // null is defaultwaarde, BigDecimal = object

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void storten(BigDecimal bedrag) {
		if (bedrag == null) {
			throw new IllegalArgumentException("Ongeldig bedrag!");
		}
		if (bedrag.compareTo(BigDecimal.ZERO) < 0) { // bedrag negatief
			throw new IllegalArgumentException("Negatief bedrag!");
		}

		saldo = saldo.add(bedrag);
	}

}
