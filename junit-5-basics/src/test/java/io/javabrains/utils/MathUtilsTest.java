package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils utils = new MathUtils();
		int expected = 2;
		int actual = utils.add(1, 1);

		assertEquals(expected, actual, "Should add two values");
	}

	@Test
	void testComputeCircleRadius() {
		MathUtils utils = new MathUtils();
		assertEquals(Math.PI * Math.pow(10, 2), utils.computCircleArea(10), "Shour return circle area");
	}

}
