package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

public class RechthoekTest {
	@Test
	public void maakRechthoek_GeldigeLengteGeldigeBreedte_maaktRechthoek() {
		// arrange
		double lengte = 20.5;
		double breedte = 15.0;

		// act
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// assert
		Assertions.assertEquals(20.5, rechthoek.getLengte());
		Assertions.assertEquals(15.0, rechthoek.getBreedte());

	}

	@Test
	public void maakRechthoek_OngeldigeLengteGeldigeBreedte_werptException() {
		// arrange
		double lengte = -1.3;
		double breedte = 15.0;

		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));

	}

	@Test
	public void maakRechthoek_GeldigeLengteOngeldigeBreedte_werptException() {
		// arrange
		double lengte = 25.0;
		double breedte = -15.0;

		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));

	}

	@Test
	public void maakRechthoek_GrenswaardeLengteGeldigeBreedte_werptException() {
		// arrange
		double lengte = 0;
		double breedte = 15.0;

		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));

	}

	@Test
	public void maakRechthoek_GeldigeLengteGrenswaardeBreedte_werptException() {
		// arrange
		double lengte = 15.0;
		double breedte = 0;

		// act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Rechthoek(lengte, breedte));

	}

	@Test
	public void geefOmtrek_retourneertOmtrekVanRechthoek() {
		// arrange
		double lengte = 10;
		double breedte = 20;

		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// act
		double omtrek = rechthoek.geefOmtrek();

		// assert
		Assertions.assertEquals(60, omtrek, 0);

	}

	@Test
	public void geefOppervlakte_retourneertOppervlakteVanRechthoek() {
		// arrange
		double lengte = 10;
		double breedte = 20;

		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// act
		double oppervlakte = rechthoek.geefOppervlakte();

		// assert
		Assertions.assertEquals(200, oppervlakte, 0);

	}

	@Test
	public void schaal_GeldigSchalingsPercentage_SchaaltDeRechthoek() {
		// arrange
		double lengte = 10;
		double breedte = 20;
		int percentage = 50;
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// act
		rechthoek.schaal(percentage);

		// assert
		Assertions.assertEquals(5, rechthoek.getLengte());
		Assertions.assertEquals(10, rechthoek.getBreedte());

	}

	@Test
	public void schaal_SchalingsPercentageOndergrens_SchaaltDeRechthoek() {
		// arrange
		double lengte = 10;
		double breedte = 20;
		int percentage = 1;
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// act
		rechthoek.schaal(percentage);

		// assert
		Assertions.assertEquals(0.1, rechthoek.getLengte());
		Assertions.assertEquals(0.2, rechthoek.getBreedte());

	}

	@Test
	public void schaal_SchalingsPercentageBovenrens_SchaaltDeRechthoek() {
		// arrange
		double lengte = 10;
		double breedte = 20;
		int percentage = 200;
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);

		// act
		rechthoek.schaal(percentage);

		// assert
		Assertions.assertEquals(20, rechthoek.getLengte());
		Assertions.assertEquals(40, rechthoek.getBreedte());

	}

	@Test
	public void schaal_SchalingsPercentageTeKlein_werptException() {
		// arrange
		Rechthoek rechthoek = new Rechthoek(10, 20);
		// act & aassert
		Assertions.assertThrows(IllegalArgumentException.class, () -> rechthoek.schaal(-30));
	}

	@Test
	public void schaal_SchalingsPercentageTeGroot_werptException() {
		// arrange
		Rechthoek rechthoek = new Rechthoek(10, 20);
		// act & aassert
		Assertions.assertThrows(IllegalArgumentException.class, () -> rechthoek.schaal(220));
	}

	@ParameterizedTest
	@ValueSource(ints = { -30, 220, 0, 201 })
	public void schaal_OngeldigSchalingspercentage_werptException(int percentage) {
		Rechthoek rechthoek = new Rechthoek(10, 20);

		Assertions.assertThrows(IllegalArgumentException.class, () -> rechthoek.schaal(percentage));
	}

}
