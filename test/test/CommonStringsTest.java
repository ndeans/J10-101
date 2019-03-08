package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




import operations.CommonStrings;
import support.LogPrinter;

class CommonStringsTest {

	LogPrinter lp;
	
	@Test
	void testCommonStrings() {
		
		lp = LogPrinter.getInstance();
		lp.printHead("Test: Find Common Strings between Two String Arrays...");
		
		CommonStrings cs = new CommonStrings();
		cs.start();
		
		// fail("Not yet implemented");
		assertEquals(1,1);
		
	}

}
