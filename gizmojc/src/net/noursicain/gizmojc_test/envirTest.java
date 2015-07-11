package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;
import net.noursicain.gizmojc.envir;

import org.junit.Test;

public class envirTest {
    public envir myEnvir = new envir();
    
	@Test
	public void test1() {
		
		assertFalse("envirTest1 The default value of TestMode must be false.", myEnvir.TestMode);
		assertEquals(myEnvir.FolderSeoaratir ,"/");
	} // end test1

}
