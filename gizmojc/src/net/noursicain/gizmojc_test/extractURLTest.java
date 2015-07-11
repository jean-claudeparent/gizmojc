package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import net.noursicain.gizmojc.extractURL;;

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
	}

}
