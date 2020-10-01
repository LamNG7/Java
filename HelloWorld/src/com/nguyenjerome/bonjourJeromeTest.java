package com.nguyenjerome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class bonjourJeromeTest {

	@Test
	public void testMultiplication() {
		bonjourJerome testMult1 = new bonjourJerome();
		int testMult = testMult1.multiplication(4, 24);
		assertEquals(96, testMult);
	}

}
