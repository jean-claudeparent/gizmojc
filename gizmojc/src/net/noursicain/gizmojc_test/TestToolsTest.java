package net.noursicain.gizmojc_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestToolsTest {
	TestTools myTT = new TestTools();
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("/GizmoJC/github/gizmojc/gizmojc/bin/net/noursicain/gizmojc_test/Ressources/",myTT.Folder("file:/GizmoJC/github/gizmojc/gizmojc/bin/net/noursicain/gizmojc_test/Ressources/Ressources.txt"));
		
	}

}
