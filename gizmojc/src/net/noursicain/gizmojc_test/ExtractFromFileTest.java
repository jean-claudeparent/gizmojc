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
	public void test1_Working() throws Exception  {
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
		
	} // end test1_Working
	
	
	@Test
	public void test2_IOException_input() throws Exception  {
		// IOException for input file
		
		myExtractFromFile.InputFile = DataFolder + "InputFiles/ExtractFromFileTest_filenothere.txt";
		myExtractFromFile.OutputFile = DataFolder + "OutputFiles/ExtractFromFileTest_test2.txt";
		File Inputfile = new File(myExtractFromFile.InputFile );
		assertFalse("The input file should not be there " + myExtractFromFile.InputFile , Inputfile.exists());
		
		try {
			myExtractFromFile.Go();
		} catch (IOException excep) {
			assertTrue("The IOException occured",true);
		} // end try
				
	}  // end test2_IOException_input()
	
	@Test
	public void test3_IOException_output() throws Exception  {
		// test for IOExceptions on the output file
		myExtractFromFile = new ExtractFromFile();
		TestTools myTT = new TestTools();
		DataFolder = myTT.Folder(ExtractFromFileTest.class.getResource("Ressources/Ressources.txt").toString());
		System.out.println("test3_IOException_output() DataFolder : " + DataFolder);
		
		// Initializations
		assertTrue("The DataFolder should contains noursicain/gizmojc_test/Ressources/ but it was  " + DataFolder,DataFolder.contains("noursicain/gizmojc_test/Ressources/"));
		myExtractFromFile.InputFile = DataFolder + "InputFiles/ExtractFromFileTest_test3.txt";
		myExtractFromFile.OutputFile = DataFolder + "//\\.......s";
		File Inputfile = new File(myExtractFromFile.InputFile );
		assertTrue("The input file should be there " + myExtractFromFile.InputFile , Inputfile.exists());
		
		try {
			myExtractFromFile.Go();
		} catch (IOException excep) {
			assertTrue("The IOException occured",true);
		} // end try
				
		
		
		
	}  // end test3_IOException_output
	
	
	
	
	

} // end class
