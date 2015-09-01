package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.runner.Version;
import org.junit.Rule;


import net.noursicain.gizmojc.EFFRunner;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;



public class EFFRunnerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
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
		
		assertTrue("The console should display Usage: EFFRunner inputfile outputfile. ùActuel result is :  " + outContent.toString(), outContent.toString().contains("Usage: EFFRunner inputfile outputfile"));
	//	fail("Not yet implemented");
	}

}
