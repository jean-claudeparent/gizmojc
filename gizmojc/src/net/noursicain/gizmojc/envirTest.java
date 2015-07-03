package net.noursicain.gizmojc;

import static org.junit.Assert.*;

import org.junit.Test;

public class envirTest {
    public envir myEnvir = new envir();
    
	@Test
	public void test1() {
		
		assertFalse("envirTest1 The default value of TestMode must be false.", myEnvir.TestMode);
		fail("Not yet implemented");
	} // end test1

}
