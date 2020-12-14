package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cui.Oef9_StudentenApp;

public class StudentAppTest {

	@BeforeEach
	public void before() {

	}

	@Test
	public void berekenPercentage3StudentenVerschillendAantalExamens() {
		int[][] examen = { { 15, 10, 12 }, { 10, 10 }, { 12, 9, 7, 11 } };
		int[] percentages = new int[3];
		Oef9_StudentenApp.berekenPercentage(examen, percentages);
		Assertions.assertEquals(61, percentages[0]);
		Assertions.assertEquals(50, percentages[1]);
		Assertions.assertEquals(48, percentages[2]);

	}

	@Test
	public void berekenPercentage1Student() {
		int[][] examen = { { 15, 10, 12 } };
		int[] percentages = new int[1];
		Oef9_StudentenApp.berekenPercentage(examen, percentages);
		Assertions.assertEquals(61, percentages[0]);

	}

	@Test
	public void berekenPercentage3StudentenGelijkAantalExamens() {
		int[][] examen = { { 15, 10, 12 }, { 10, 10, 15 }, { 8, 9, 7 } };
		int[] percentages = new int[3];
		Oef9_StudentenApp.berekenPercentage(examen, percentages);
		Assertions.assertEquals(61, percentages[0]);
		Assertions.assertEquals(58, percentages[1]);
		Assertions.assertEquals(40, percentages[2]);

	}

}
