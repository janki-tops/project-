package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithematicTest {
	public String message ="Janki";
	JUnitMessage junitMessage = new JUnitMessage(message);	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() {
		System.out.println("Junit Message is Printing");
		junitMessage.printHiMessage();
	}
	@Test
	public void testJunitHiMessage() {
		message = "Hi" + message;
		System.out.println("Junit Message is Printing");
		assertEquals(message,junitMessage.printHiMessage());
	}
	


}
