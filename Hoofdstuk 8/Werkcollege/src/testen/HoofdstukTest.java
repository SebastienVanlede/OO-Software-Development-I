package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Hoofdstuk;

class HoofdstukTest {
	private Hoofdstuk hoofdstuk;

	@BeforeEach
	public void setUp() throws Exception {
		hoofdstuk = new Hoofdstuk();

	}

	@Test
	public void maakHoofdstuk_steltTitelInOpOnbekend() {
		// ARRANGE

		// ACT

		// ASSERT
		Assertions.assertEquals("onbekend", hoofdstuk.getTitel());
	}

	// null of lege string
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { "     ", "A", "a" })
	public void setTitel_ongeldigeWaarden_gooitException(String titel) {
		// ACT & ASSERT
		Assertions.assertThrows(IllegalArgumentException.class, () -> hoofdstuk.setTitel(titel));
	}

}
