package GTM.test;

import static org.junit.Assert.*;

import org.junit.Test;
import GTM.monop.Gobelet;

public class TestGobelet {

	@Test
	public void testIsDouble() {
		Gobelet gobelet = new Gobelet();

		for (int i = 0; i < 15000; i++) {
			int val1 = gobelet.getDe1().getValeur();
			int val2 = gobelet.getDe2().getValeur();
			assertEquals((val1 == val2), gobelet.isDouble());
			gobelet.lancer();
		}
	}

	@Test
	public void testLancer() {
		Gobelet gobelet = new Gobelet();
		for (int i = 0; i < 10000; i++) {
			int valTest = gobelet.lancer();
			assertTrue(2 <= valTest && valTest <= 12);
		}
	}
}