package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Oef11_Dagjaar;

public class DagjaarTest {
	private Oef11_Dagjaar dj1, dj2;

	@BeforeEach
	public void before() {
		dj1 = new Oef11_Dagjaar(2, 2);
		dj2 = new Oef11_Dagjaar(3, "januari");
	}

	@Test
	public void creatieMetIntParams() {
		Assertions.assertEquals(33, dj1.getDagen());
	}

	@Test
	public void creatieMetStringParams() {
		Assertions.assertEquals(3, dj2.getDagen());
	}

	@Test
	public void addDagen() {
		dj1.addDagen(10);
		Assertions.assertEquals(43, dj1.getDagen());

		dj2.addDagen(650);
		Assertions.assertEquals(288, dj2.getDagen());
	}
}
