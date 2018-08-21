package com.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class threeway {

	
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void wayone() {
		//fail("Not yet implemented");
		assertEquals(System.currentTimeMillis(), System.currentTimeMillis());
	}

	@Test
	public void waytwo() {
		//fail("Not yet implemented");
		assertEquals("3", String.valueOf("3"));
	}

	@Test
	public void waythree() {
		//fail("Not yet implemented");
		assertEquals("happy", "unhappy".substring(2));
	}

}
