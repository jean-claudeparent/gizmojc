package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.noursicain.gizmojc.ExtractFromFile;
import net.noursicain.gizmojc_test.TestTools;


import java.net.URL;


public class ExtractFromFileTest {
	
	public ExtractFromFile myExtractFromFile;
	public String DataFolder;
	
	

	@Before
	public void setUp() throws Exception {
		myExtractFromFile = new ExtractFromFile();
		TestTools myTT = new TestTools();
		DataFolder = myTT.Folder(ExtractFromFileTest.class.getResource("Ressources/Ressources.txt").toString());
		System.out.println(DataFolder);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		// URL myInputFile;
		
		assertTrue("The DataFolder should contains noursicain/gizmojc_test/Ressources/ but it was  " + DataFolder,DataFolder.contains("noursicain/gizmojc_test/Ressources/"));
		
		fail("Not yet implemented");
		
		// if (ExtractFromFileTest.class.getResource("/Ressources/InputFiles/ExtractFromFileTest_test1.txt").getPath() == null) fail ("The path to the ressource file seem wrong");
		
	} // end test1

} // end class
