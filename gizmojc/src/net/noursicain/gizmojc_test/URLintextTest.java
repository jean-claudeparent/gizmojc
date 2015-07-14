package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import net.noursicain.gizmojc.URLintext;



public class URLintextTest {
	
	public URLintext myURLInText;
	

	@Before
	public void setUp() throws Exception {
		myURLInText = new URLintext();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test1() {
		// URLintext with no URL to find
		
		myURLInText.Split("Nourl to find.");
		assertNull(myURLInText.TextBeforeURL);
		assertNull(myURLInText.URL);
		assertNull(myURLInText.TextAfterURL);
				
	} // end test1
	
	@Test
	public void test2() {
		// URLintext with no URL to find  but must cleanup properties
		myURLInText.TextAfterURL ="Clean this up, assign null as values";
		myURLInText.TextBeforeURL ="Clean this up, assign null as values";
		myURLInText.URL ="Clean this up, assign null as values";
		
		
		myURLInText.Split("Nourl to find.");
		assertNull(myURLInText.TextBeforeURL);
		assertNull(myURLInText.URL);
		assertNull(myURLInText.TextAfterURL);
				
	} // end test2

}
