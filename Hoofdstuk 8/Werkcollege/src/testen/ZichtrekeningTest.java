package testen;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Zichtrekening;

class ZichtrekeningTest {
	private Zichtrekening zichtrekening;

	@BeforeEach
	public void setUp() {
		zichtrekening = new Zichtrekening();
	}

	@Test
	public void maakZichtrekening_geefSaldoNul() {

		// ASSERT
		Assertions.assertEquals(BigDecimal.ZERO, zichtrekening.getSaldo());
	}

	@Test
	public void storten_bedragIs200_moetSaldoAanpassen() {
		// ARRANGE
		BigDecimal bedrag = new BigDecimal(200);
		// ACT
		zichtrekening.storten(bedrag);
		// ASSERT

		Assertions.assertEquals(new BigDecimal(200), zichtrekening.getSaldo());
	}

	@Test
	public void storten_metNegatiefBedrag_gooitException() {
		// ARRA?GE
		BigDecimal bedrag = new BigDecimal(-100);

		// ACT & ASSERT
		Assertions.assertThrows(IllegalArgumentException.class, () -> zichtrekening.storten(null));
	}

}
