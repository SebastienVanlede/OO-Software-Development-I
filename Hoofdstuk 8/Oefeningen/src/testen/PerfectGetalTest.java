package testen;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.PerfectGetal;

class PerfectGetalTest {

	private PerfectGetal perfect;

	@BeforeEach
	void setUp() throws Exception {
		perfect = new PerfectGetal();
	}

	@Test
	void test_getalKleinerDan0() {
		int getal = -3;
		try {
			assertTrue(perfect.isPerfect(getal));
			fail("fout" + getal);
		} catch (IllegalArgumentException iae) {
			assertEquals("Getal mag niet negatief zijn", iae.getMessage());

		} catch (Exception e) {
			fail("other exception");
		}

	}

	@Test
	void test_getalIs0() {
		int getal = 0;
		try {
			assertFalse(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}

	@Test
	void test_getalIs1() {
		int getal = 1;
		try {
			assertFalse(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}

	@Test
	void test_getalIsPerfect6() {
		int getal = 6;
		try {
			assertTrue(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}

	@Test
	void test_getalIsPerfect28() {
		int getal = 28;
		try {
			assertTrue(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}

	@Test
	void test_getalIsPerfect496() {
		int getal = 496;
		try {
			assertTrue(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}
	
	@Test
	void test_getalIsNotPerfect() {
		int getal = 88;
		try {
			assertFalse(perfect.isPerfect(getal));
		} catch (Exception e) {
			fail("fout" + getal);
		}
	}

}
