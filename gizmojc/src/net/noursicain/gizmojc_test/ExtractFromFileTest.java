package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.noursicain.gizmojc.ExtractFromFile;

import java.net.URL;


public class ExtractFromFileTest {
	
	public ExtractFromFile myExtractFromFile;
	

	@Before
	public void setUp() throws Exception {
		myExtractFromFile = new ExtractFromFile();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		// URL myInputFile;
		URL myURL;
		
		
		// myExtractFromFile.InputFile = ExtractFromFileTest.class.getResource("/Ressources/InputFiles/ExtractFromFileTest_test1.txt").getPath();
		myURL = ExtractFromFileTest.class.getResource("Ressources/Ressources.txt");
		System.out.println(myURL);
		if (myURL == null) fail ("The path to the ressource file seem wrong");
		fail("Not yet implemented");
		// if (ExtractFromFileTest.class.getResource("/Ressources/InputFiles/ExtractFromFileTest_test1.txt").getPath() == null) fail ("The path to the ressource file seem wrong");
		
	} // end test1

} // end class
