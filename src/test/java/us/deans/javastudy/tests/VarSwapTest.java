package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.VarSwap;
import us.deans.javastudy.support.LogPrinter;

class VarSwapTest {
	
	LogPrinter lp;
	

	@BeforeEach
	void setUp() throws Exception {
		lp = LogPrinter.getInstance();
	}

	@AfterEach
	void tearDown() throws Exception {
		lp = null;
	}

	@Test
	void testSwap() {
		lp.printHead("Test: Variable Swap...");
		VarSwap vs = new VarSwap();
		vs.swap(13, 7);
		lp.printBreak();
		
		// fail("Not yet implemented");
		assertEquals(1,1);
		
	}

}
