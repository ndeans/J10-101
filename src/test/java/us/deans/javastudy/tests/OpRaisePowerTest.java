package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import us.deans.javastudy.operations.core10.OpRaisePower;
import us.deans.javastudy.support.LogPrinter;

public class OpRaisePowerTest {

	static LogPrinter LP = LogPrinter.getInstance();
	
	@Test
	public void testRaisePower_01 () {
		
		OpRaisePower p = new OpRaisePower();
		// assertTrue(p.raisePower(2, 3) == 8);
		assertTrue(p.raisePower(2, 4) == 16);
		
	}


}
