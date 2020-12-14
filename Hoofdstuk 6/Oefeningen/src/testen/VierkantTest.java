package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef12_Vierkant;

public class VierkantTest {
	private Oef12_Vierkant vierkant;

	@BeforeEach
	public void before() {
		vierkant = new Oef12_Vierkant(10, 15, 30);
	}

	@Test
	public void vierkantWelZijdeBijCreatie() {
		Assertions.assertEquals(30, vierkant.getZijde());
	}

	@Test
	public void vierkantWelPuntBijCreatie() {
		Assertions.assertEquals(10, vierkant.getLinkerBovenHoek().getXCoord());
		Assertions.assertEquals(15, vierkant.getLinkerBovenHoek().getYCoord());
	}

	@Test
	public void vierkantZijdeToekennen() {
		vierkant.setZijde(5);
		Assertions.assertEquals(5, vierkant.getZijde());
	}

	@Test
	public void oppervlakteNaConstructie() {
		Assertions.assertEquals(900, vierkant.geefOpp());
	}

	@Test
	public void omtrekNaConstructie() {
		Assertions.assertEquals(120, vierkant.geefOmtrek());
	}

	@Test
	public void zijdeNaGroei() {
		vierkant.groei();
		Assertions.assertEquals(35, vierkant.getZijde());
	}

	@Test
	public void zijdeNaKrimp() {
		vierkant.krimp();
		Assertions.assertEquals(25, vierkant.getZijde());
	}

	@Test
	public void zijdeOngewijzigdNaGroei() {
		vierkant.setZijde(500);
		vierkant.groei();
		Assertions.assertEquals(500, vierkant.getZijde());
	}

	@Test
	public void zijdeOngewijzigdNaKrimp() {
		vierkant.setZijde(1);
		vierkant.krimp();
		Assertions.assertEquals(1, vierkant.getZijde());
	}

}
