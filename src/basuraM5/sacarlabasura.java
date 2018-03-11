package basuraM5;

import static org.junit.Assert.*;

import org.junit.Test;

public class sacarlabasura {
	

	@Test
	public void test() {
		
		assertEquals(30,Program.calcul(1, 5, 100, 0, 5, 5));
		assertEquals(0,Program.calcul(2, 20, 200, 0, -5, 4));
		assertEquals(90,Program.calcul(3, -10, 100, 0, 20, 5));
		assertEquals(0,Program.calcul(2, 10, 1000, 0, -5, 20));
		assertEquals(1000,Program.calcul(1, 10, 1000, 0, 5, 500));
		assertEquals(200,Program.calcul(3, 2, 200, 0, 20, 10));
		assertEquals(40,Program.calcul(2, 50, 100, 0, -5, 2));
		assertEquals(500,Program.calcul(1, 0, 500, 0, 5, 25));
		assertEquals(375,Program.calcul(1, -50, 500, 0, 5, 25));
		assertEquals(10,Program.calcul(3, -999, 1000, 0, 20, 50));
		assertEquals(577,Program.calcul(2, 200, 1650, 0, -5, 33));

	}

}
