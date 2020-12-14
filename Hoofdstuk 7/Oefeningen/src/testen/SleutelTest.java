package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Sleutel;

public class SleutelTest
{
	private Sleutel sleutel1, sleutel2, sleutel3;

	@BeforeEach
	public void before()
	{
		Sleutel.setAantalInOmloop(0);
		sleutel1 = new Sleutel("schuur", 1.5, 1, 3);
		sleutel2 = new Sleutel("geheime kamer", 0.9, 5, 10);
		sleutel3 = new Sleutel("tuinberging", 0.4, 7, 22);
	}

	@Test
	public void maakSleutel_normaleWaarden_objectWordtGemaakt()
	{
		Assertions.assertEquals("schuur", sleutel1.getNaam());
		Assertions.assertEquals(1, sleutel1.getNiveau());
		Assertions.assertEquals(1.5, sleutel1.getGewicht(), 0.01);
		Assertions.assertEquals(3, sleutel1.getDeur());
	}

	@Test
	public void maakSleutel_deurTeKlein_werptException()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Sleutel("schuur", 1.5, 1, -2));
	}

	@Test
	public void getAantalInOmloop_teltObjectenInGeheugen_geeft3Terug()
	{
		System.gc();
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException ex) {}
		Assertions.assertEquals(3, Sleutel.getAantalInOmloop());
	}

	@Test
	public void setDeur_negatieveWaarde_werptException()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> sleutel2.setDeur(-5));
	}

	@Test
	public void setDeur_toegelatenWaarde_wijzigtAttribuutNaar100()
	{
		sleutel2.setDeur(100);
		Assertions.assertEquals(100, sleutel2.getDeur());
	}

	@Test
	public void pastOp_correctNummer_geeftTrueTerug()
	{
		Assertions.assertTrue(sleutel1.pastOp(3));
	}

	@Test
	public void pastOp_foutNummer_geeftFalseTerug()
	{
		Assertions.assertFalse(sleutel1.pastOp(13));
	}

	@Test
	public void toString_normaal_geeftTekstWeergaveObject()
	{
		System.gc();
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		Assertions.assertEquals(String.format("%s%n%s", "Sleutel tuinberging met gewicht 0,400 kg uit niveau 7 past op deur 22.",
						"Er zijn 3 sleutel(s) in omloop."), sleutel3.toString());
	}
}
