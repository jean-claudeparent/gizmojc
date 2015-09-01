package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import net.noursicain.gizmojc.EFFRunner;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class EFFRunnerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	

	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(null);
	}

	@Test
	public void test() {
		// run without args
		EFFRunner.main(new String[] {});
		assertTrue("The console should display Usage: EFFRunner inputfile outputfile. ùActuel result is :  " + outContent.toString(), outContent.toString().contains("Usage: EFFRunner inputfile outputfile"));
	//	fail("Not yet implemented");
	}

}
