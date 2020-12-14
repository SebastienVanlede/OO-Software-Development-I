package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef7_ArrayBewerking;

public class ArrayBewerkingTest {

	private Oef7_ArrayBewerking arrayBew;
	int[] rij1 = {2,4,6,8,10};
	int[] rij2 = {2,2,2,2,2};
	int[] rij3 = {1,2,3,16,40};

	@BeforeEach
	public void before()
	{
	}

	@Test
	public void delen()
	{
		double[] rij3 = Oef7_ArrayBewerking.deel(rij1, rij2);
		Assertions.assertEquals(1.0, rij3[0],0.01);
		Assertions.assertEquals(2.0, rij3[1],0.01);
		Assertions.assertEquals(3.0, rij3[2],0.01);
		Assertions.assertEquals(4.0, rij3[3],0.01);
		Assertions.assertEquals(5.0, rij3[4],0.01);
	}

	@Test
	public void delen2()
	{
		double[] rij4 = Oef7_ArrayBewerking.deel(rij1, rij3);
		Assertions.assertEquals(2.0, rij4[0],0.01);
		Assertions.assertEquals(2.0, rij4[1],0.01);
		Assertions.assertEquals(2.0, rij4[2],0.01);
		Assertions.assertEquals(0.5, rij4[3],0.01);
		Assertions.assertEquals(0.25, rij4[4],0.01);
	}

	@Test
	public void schuifOpPositie1(){
		double[] rij = {1.0,2.0,3.0,4.0,5.0};
		int aantalPlaatsen = 1;
		Oef7_ArrayBewerking.schuifOp(rij, aantalPlaatsen);
		Assertions.assertEquals(5.0, rij[0],0.01);
		Assertions.assertEquals(1.0, rij[1],0.01);
		Assertions.assertEquals(2.0, rij[2],0.01);
		Assertions.assertEquals(3.0, rij[3],0.01);
		Assertions.assertEquals(4.0, rij[4],0.01);
	}

	@Test
	public void schuifOpPositie4(){
		double[] rij = {1.0,2.0,3.0,4.0,5.0};
		int aantalPlaatsen = 4;
		Oef7_ArrayBewerking.schuifOp(rij, aantalPlaatsen);
		Assertions.assertEquals(2.0, rij[0],0.01);
		Assertions.assertEquals(3.0, rij[1],0.01);
		Assertions.assertEquals(4.0, rij[2],0.01);
		Assertions.assertEquals(5.0, rij[3],0.01);
		Assertions.assertEquals(1.0, rij[4],0.01);
	}

	@Test
	public void toonIntegers(){
		int rij[] = {2,7,1,9,4};
		String resultaat = Oef7_ArrayBewerking.toon(rij);
		Assertions.assertEquals("         2         7         1         9         4", resultaat);
	}

	@Test
	public void toonDoubles(){
		double rij[] = {1.0,2.0,3.0,4.0,5.0};
		String resultaat = Oef7_ArrayBewerking.toon(rij);
		Assertions.assertEquals("      1,00      2,00      3,00      4,00      5,00", resultaat);
	}

}
