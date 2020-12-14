package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef5_Stappenteller;

public class StappentellerTest {
	private Oef5_Stappenteller s1, s2, s3;

	@BeforeEach
	public void before() {
		s1 = new Oef5_Stappenteller("Wandelingetje", 200, 1);
		s2 = new Oef5_Stappenteller("Bergbeklimming", 120, 2);
		s3 = new Oef5_Stappenteller("Foute activiteit", 200, 3);
	}

	@Test
	public void getActiviteit_geefWandelingetjeTerug() {
		Assertions.assertEquals("Wandelingetje", s1.getActiviteit());
	}

	@Test
	public void getHoeveelheid_geeft200Terug() {
		Assertions.assertEquals(200, s1.getHoeveelheid());
	}

	@Test
	public void getSoort_geeft1Terug() {
		Assertions.assertEquals(1, s1.getSoort());
	}

	@Test
	public void maakStappenteller_fouteHoeveelheid_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Oef5_Stappenteller("Wandelingetje", 2000, 1));
	}

	@Test
	public void maakStappenteller_fouteSoort_werptException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Oef5_Stappenteller("Foute activiteit", 200, 5));
	}

	@Test
	public void geefAantalStappen_plat_geeft200Terug() {
		Assertions.assertEquals(200, s1.geefAantalStappen());
	}

	@Test
	public void geefAantalStappen_berg_geeft240Terug() {
		Assertions.assertEquals(240, s2.geefAantalStappen());
	}
}