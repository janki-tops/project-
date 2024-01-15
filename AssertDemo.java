package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertDemo {
	@Test
	public void testAssert() {
		String string1="Junit";
		String string2="Junit";
		String string3="test";
		String string4="test";
		String string5="null";
		int variable1=1;
		int variable2=2;
		int[] airethematicArray1= {1, 2, 3};
		int[] airethematicArray2= {1, 2, 3};
		assertEquals(string1, string2);
		assertSame(string3, string4);
		assertNotNull(string1);
		assertNull(string5);
		assertTrue(variable1<variable2);
		assertArrayEquals(airethematicArray1,airethematicArray2);
	}

}
