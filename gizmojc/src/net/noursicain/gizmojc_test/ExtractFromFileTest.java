package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.File;

import org.apache.commons.io.FileUtils;



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
		// a test that work fpr processing a fo;e
		
		
		
		assertTrue("The DataFolder should contains noursicain/gizmojc_test/Ressources/ but it was  " + DataFolder,DataFolder.contains("noursicain/gizmojc_test/Ressources/"));
		myExtractFromFile.InputFile = DataFolder + "InputFiles/ExtractFromFileTest_test1.txt";
		myExtractFromFile.OutputFile = DataFolder + "OutputFiles/ExtractFromFileTest_test1.txt";
		String SavedResultFile = DataFolder + "SavedFiles/ExtractFromFileTest_test1.txt";
		
		// delete the output file if needed
		File Outputfile = new File(myExtractFromFile.OutputFile );
		
		if (Outputfile.exists())  {
			Outputfile.delete();
		} // end if
			
		// check if the file system is ok for the test
		assertFalse("The output file should not be there " + myExtractFromFile.OutputFile , Outputfile.exists());
		
		
		fail("Not yet implemented");
		
		// if (ExtractFromFileTest.class.getResource("/Ressources/InputFiles/ExtractFromFileTest_test1.txt").getPath() == null) fail ("The path to the ressource file seem wrong");
		
	} // end test1

} // end class
