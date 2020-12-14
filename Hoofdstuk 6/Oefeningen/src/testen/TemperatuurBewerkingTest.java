package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef8_TemperatuurBewerking;

public class TemperatuurBewerkingTest
{

	Oef8_TemperatuurBewerking tempBew;

	@BeforeEach
	public void before()
	{
		tempBew = new Oef8_TemperatuurBewerking();
	}

	@Test
	public void berekenGemiddeldenPerMaand6Temperaturen()
	{
		int[] temp = {20,25,31,17,19,20};
		Assertions.assertEquals(22.0, tempBew.berekenGemiddeldenPerMaand(temp),0.01 );

	}

	@Test
	public void berekenGemiddeldenPerMaand3Temperaturen()
	{
		int[] temp = {17,19,21};
		Assertions.assertEquals(19.0, tempBew.berekenGemiddeldenPerMaand(temp),0.01 );

	}

	@Test
	public void berekenMaxPerMaand6Temperaturen()
	{
		int[] temp = {20,25,31,17,19,20};
		Assertions.assertEquals(31, tempBew.bepaalMaximumTemperatuur(temp) );

	}

	@Test
	public void berekenMaxPerMaand3Temperaturen()
	{
		int[] temp = {17,19,20};
		Assertions.assertEquals(20, tempBew.bepaalMaximumTemperatuur(temp) );

	}
}
