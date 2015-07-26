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
	public void test1() throws Exception  {
		// a test that work fpr processing a fo;e
		myExtractFromFile.Log = true;
		
		
		
		// Initializations
		assertTrue("The DataFolder should contains noursicain/gizmojc_test/Ressources/ but it was  " + DataFolder,DataFolder.contains("noursicain/gizmojc_test/Ressources/"));
		myExtractFromFile.InputFile = DataFolder + "InputFiles/ExtractFromFileTest_test1.txt";
		myExtractFromFile.OutputFile = DataFolder + "OutputFiles/ExtractFromFileTest_test1.txt";
		String SavedResultFile = DataFolder + "SavedFiles/ExtractFromFileTest_test1.txt";
		
		// define test files
		File Outputfile = new File(myExtractFromFile.OutputFile );
		File Inputfile = new File(myExtractFromFile.InputFile );
		File Savedfile = new File(SavedResultFile);
		
		// delete the output file if needed
		
		if (Outputfile.exists())  {
			Outputfile.delete();
		} // end if
			
		// check if the file system is ok for the test
		assertFalse("The output file should not be there " + myExtractFromFile.OutputFile , Outputfile.exists());
		assertTrue("The input file should be there " + myExtractFromFile.InputFile , Inputfile.exists());
		assertTrue("The saved result  file should be there " + SavedResultFile , Savedfile.exists());
		
		// do the test
		myExtractFromFile.Go();
		
		// compare the result of the new result and the saved files
		assertTrue("The output file should be there " + myExtractFromFile.OutputFile , Outputfile.exists());
		assertTrue("The new result file is not the same as the saved result file. ",FileUtils.contentEquals(Outputfile,Savedfile ));
		
	} // end test1
	
	
	@Test
	public void test2() throws Exception  {
		// insert test for exceptions
		fail("Not yet implemented");
		
	}  // end test2
	
	
	
	

} // end class
