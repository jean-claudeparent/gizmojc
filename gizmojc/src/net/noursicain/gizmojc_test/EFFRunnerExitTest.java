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



public class EFFRunnerExitTest {
	// test for checking exit
	// to my knowledge tgese test must be separated from ordinary test
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	public String DataFolder;
	
	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();
	
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
	public void NoArgs() {
		// run without args
		exit.expectSystemExitWithStatus(99);
		EFFRunner.main(new String[] {});
		fail("The test should have stopped.");
		
	} // end NoArgs()
	
	@Test
	public void NotEnoughArgs() {
		// run with 1 args. 2 are required.
		
		exit.expectSystemExitWithStatus(99);
		EFFRunner.main(new String[] {"inputfile"});
		fail("The test should have stopped.");
		
	} // end NotEnoughArgs()
	
	@Test
	public void InputFileNotFound() {
		// run with an input file that does not exists
		String InputFile = DataFolder  + "/filedonotexist.txt";
		String OutputFile = DataFolder  + "OutputFiles/filemustnotexist.txt";
		
		File myInputfile = new File(InputFile );
		assertFalse("The input file should not be there " + InputFile   , myInputfile.exists());
		
		exit.expectSystemExitWithStatus(99);
		EFFRunner.main(new String[] {InputFile, OutputFile });
		fail("The test should have stopped.");
		
	} // end InputFileNotFound()
	
	
	

}
