package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import us.deans.javastudy.operations.core10.OpRaisePower;

public class OpRaisePowerTest {

	
	@Test
	public void testRaisePower_01 () {
		
		OpRaisePower p = new OpRaisePower();
		assertTrue(p.raisePower(2, 3) == 8);
		assertTrue(p.raisePower(2, 4) == 16);
		
	}


}
