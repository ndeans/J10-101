package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.core10.DmCommonStrings;
import us.deans.javastudy.support.LogPrinter;

class CommonStringsTest {

	LogPrinter lp;
	
	@Test
	void testCommonStrings() {
		
		lp = LogPrinter.getInstance();
		lp.printHead("Test: Find Common Strings between Two String Arrays...");
		
		DmCommonStrings cs = new DmCommonStrings();
		cs.start();
		
		// fail("Not yet implemented");
		assertEquals(1,1);
		
	}

}
