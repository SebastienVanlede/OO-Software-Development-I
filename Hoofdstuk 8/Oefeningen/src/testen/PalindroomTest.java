package testen;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Palindroom;

class PalindroomTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test_tekstHeeftMeerDan1Karakter() {
		String string = "aa";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}

	@Test
	void test_tekstHeeft1Karakter() {
		String string = "a";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
			fail("unexpected exception for text " + string);
		} catch (Exception e) {
			assertEquals("Tekst moet meer dan een karakter bevatten", e.getMessage());
			assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
		}
	}

	@Test
	void test_tekstHeeftMinderDan1Karakter() {
		String string = "";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
			fail("unexpected exception for text " + string);
		} catch (Exception e) {
			assertEquals("Ongeldige tekst", e.getMessage());
			assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
		}
	}
	
	@Test
	void test_tekstIsNull() {
		String string = null;
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
			fail("unexpected exception for text " + string);
		} catch (Exception e) {
			assertEquals("Ongeldige tekst", e.getMessage());
			assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
		}
	}
	
	@Test
	void test_happy() {
		String string = "lepel";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}
	
	@Test
	void test_happyUppercase() {
		String string = "LEPEL";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}
	
	@Test
	void test_happy_Camelcase() {
		String string = "lEpeL";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}
	
	@Test
	void test_stringCijfers() {
		String string = "1234554321";
		try {
			assertTrue("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}
	
	@Test
	void test_stringCijfersNoPalindrome() {
		String string = "123455421";
		try {
			assertFalse("String moet meer dan één karakter bevatten", Palindroom.isPalindroom(string));
		} catch (Exception e) {
			fail("unexpected exception for text " + string);

		}
	}

}
