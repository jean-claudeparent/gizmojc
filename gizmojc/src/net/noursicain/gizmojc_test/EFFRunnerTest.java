package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.runner.Version;

import org.junit.Rule;

import net.noursicain.gizmojc.EFFRunner;

import java.io.File;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;



public class EFFRunnerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	public String DataFolder;
	
	
	// public final ExpectedSystemExit exit = ExpectedSystemExit.none();
	
	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
		TestTools myTT = new TestTools();
		DataFolder = myTT.Folder(ExtractFromFileTest.class.getResource("Ressources/Ressources.txt").toString());
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(null);
	}

	
	
	
	@Test
	public void AllWorks() {
		// run with data to process
		String InputFileName = DataFolder  + "InputFiles/EFFRunnerTest.AllWorks_Input.txt";
		String OutputFileName = DataFolder  + "OutputFiles/EFFRunnerTest.AllWorks_Output.txt";
		String SavedFileName = DataFolder  + "SavedFiles/EFFRunnerTest.AllWorks_Saved.txt";
		
		// Check if the test is setup
		
		File myInputfile = new File(InputFileName );
		assertTrue("The input file should  be there " + InputFileName   , myInputfile.exists());
		File myOutputfile = new File(OutputFileName );
		assertFalse("The output file should not  be there " + OutputFileName   , myOutputfile.exists());
		File mySavedfile = new File(SavedFileName );
		assertTrue("The result saved file should  be there " + SavedFileName   , mySavedfile.exists());
		
		// Call method to test
		EFFRunner.main(new String[] {InputFileName, OutputFileName });
		
		// Check result
		assertTrue("The output file should  be there " + OutputFileName   , myOutputfile.exists());
		
		
		fail("Not yet implemented");
	} // end AllWorks()
	
	

}
