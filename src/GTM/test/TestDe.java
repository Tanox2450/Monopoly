package GTM.test;

import static org.junit.Assert.*;

import org.junit.Test;

import GTM.monop.De;

public class TestDe {

	@Test
	public void testLancer() {
		De de = new De();
		for (int i = 0; i < 10000; i++) {
			int valTest = de.lancer();
			assertEquals(valTest, de.getValeur());
			assertTrue(1 <= valTest && valTest <= 6);
		}
	}
}
