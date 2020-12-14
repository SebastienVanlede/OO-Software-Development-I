package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Bar;

class BarTest {

	@Test
	public void magAlcoholDrinken_teJong_retourneertFalse() {
		// ARRANGE
		Bar b = new Bar();
		int leeftijd = 10;
		// ACT
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		// ASSERT
		Assertions.assertFalse(resultaat);
	}

	@Test
	public void magAlcoholDrinken_oudGenoeg_retourneertTrue() {
		// ARRANGE
		Bar b = new Bar();
		int leeftijd = 22;
		// ACT
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		// ASSERT
		Assertions.assertTrue(resultaat);
	}

	@Test
	public void magAlcoholDrinken_grensGeval16_retourneertTrue() {
		// ARRANGE
		Bar b = new Bar();
		int leeftijd = 16;
		// ACT
		boolean resultaat = b.magAlcoholDrinken(leeftijd);
		// ASSERT
		Assertions.assertTrue(resultaat);
	}

}
