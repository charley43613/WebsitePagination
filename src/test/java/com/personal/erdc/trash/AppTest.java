package com.personal.erdc.trash;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 

{   
	public StringHandling sh = new StringHandling();



@BeforeClass //Runs once before any tests(setup, connections, etc)
public static void setUpBeforeClass() throws Exception {
}

@AfterClass  //Runs once after all tests finish(cleanup, 
public static void tearDownAfterClass() throws Exception {
}

@Before  //Runs once before each test
public void setUp() throws Exception {
	

	
}

@After  //Runs once after each test
public void tearDown() throws Exception {
}


@Test
public void addPositiveDoublesTest() {
    assertEquals("as", StringHandling.longestAlpabeticalSubstring("asd"));//overloaded value for assertEquals when dealing with doubles or floats, for checking precision
    assertEquals("ab", StringHandling.longestAlpabeticalSubstring("nab"));
    assertEquals("abcde", StringHandling.longestAlpabeticalSubstring("abcdeapbcdef"));
    assertEquals("aaaabbbbctt", StringHandling.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
    assertEquals("fgikl", StringHandling.longestAlpabeticalSubstring("asdfbyfgiklag"));

}



}
