package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Driehoek;

public class DriehoekTest
{
	private Driehoek driehoek1,driehoek2,driehoek3,driehoek4;

	@BeforeEach
	public void before()
	{
		driehoek1 = new Driehoek(0,2,3);
		driehoek2 = new Driehoek(2,0,3);
		driehoek3= new Driehoek(2,3,0);
		driehoek4= new Driehoek(3,4,5);
	}

	@Test
	public void maakDriehoek_3normaleZijden_creatieObject() {
		Assertions.assertEquals(3, driehoek4.getA());
		Assertions.assertEquals(4, driehoek4.getB());
		Assertions.assertEquals(5, driehoek4.getC());
	}
	@Test
	public void maakDriehoek_zijdeAgrenswaardeNul_creatieObjectDefaultVoorA()
	{
		Assertions.assertEquals(1, driehoek1.getA());
	}

	@Test
	public void maakDriehoek_zijdeBgrenswaardeNul_creatieObjectDefaultVoorB()
	{
		Assertions.assertEquals(1, driehoek2.getB());
	}

	@Test
	public void maakDriehoek_zijdeCgrenswaardeNul_creatieObjectDefaultVoorC()
	{
		Assertions.assertEquals(1, driehoek3.getC());
	}
	
	@Test
	public void maakDriehoek_zijdeATeKlein_creatieObjectDefaultVoorA()
	{
		
		Assertions.assertEquals(1, (new Driehoek(-10,5,7)).getA());
	}	

	@Test
	public void maakDriehoek_zijdeBTeKlein_creatieObjectDefaultVoorB()
	{
		
		Assertions.assertEquals(1, (new Driehoek(10,-5,7)).getB());
	}	
	
	@Test
	public void maakDriehoek_zijdeCTeKlein_creatieObjectDefaultVoorC()
	{
		
		Assertions.assertEquals(1, (new Driehoek(10,5,-7)).getC());
	}
	
	@Test
	public void isRechthoekigeDriehoek_retourneertTrue()
	{
		Assertions.assertEquals(true, driehoek4.isRechthoekigeDriehoek());
	}

	@Test
	public void isRechthoekigeDriehoek_retourneertFalse()
	{
		Assertions.assertEquals(false, driehoek2.isRechthoekigeDriehoek());
	}
}