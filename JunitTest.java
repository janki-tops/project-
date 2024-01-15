package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class Test");
	}
	@Before
	public void before() {
		System.out.println("Before est");
	}
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	@Test
	public void test2() {
		System.out.println("This is Test2");
	}	
	@After
	public void after() {
		System.out.println(" Test");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class Test");
	}

}
