package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.noursicain.gizmojc.extractURL;
import net.noursicain.gizmojc.ExtractFromFile;

public class extractURLTest {
	
	extractURL MyExtractURL;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MyExtractURL = new extractURL();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		// test for new extractURL
		assertNull("The URL of an extractURL must be null by default.",MyExtractURL.URL);
		assertNull("The TextToParse of an extractURL must be null by default.",MyExtractURL.TextToParse);
		assertFalse("the method must return false for an empty object.", MyExtractURL.NextURLFound());
	} // end test1
	
	@Test
	public void test2() {
		// test extractURL with contents but no url
		
		MyExtractURL.TextToParse = "There is no URL.";
		assertFalse(MyExtractURL.NextURLFound());
		assertNull("When no URL are found the TextToParse should be null",MyExtractURL.TextToParse);
		assertNull(MyExtractURL.URL);
				
	} // end test2
	
	@Test
	public void test3() {
		// test extractURL with contents and one url
		
		MyExtractURL.TextToParse = "There is this URL:http://www.google.com to check.";
		assertTrue("The URL should be found.",MyExtractURL.NextURLFound());
		assertEquals("The remainig of the text should be in TextToParse "," to check.",MyExtractURL.TextToParse);
		assertEquals("The url should have been exytacted. ","http://www.google.com",MyExtractURL.URL);
		assertFalse("No more url should have been found. ",MyExtractURL.NextURLFound());
		assertNull("When no URL are found the TextToParse should be null",MyExtractURL.TextToParse);
		assertNull("The url should be null.",MyExtractURL.URL);
						
	} // end test3
	
	@Test
	public void test4() throws Exception {
		// This test just check that the class ExtractFromFile still exist in the project
		// the test case of ExtractFromFile are important for this class (ExtractURL)
		
		ExtractFromFile myEFF = new ExtractFromFile();
		
	}
	
	

}
