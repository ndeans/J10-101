package us.deans.javastudy.tests;

import org.junit.Test;

import us.deans.javastudy.operations.core10.patterns.strategy.SpController;
import us.deans.javastudy.support.LogPrinter;

import static org.junit.Assert.assertTrue;

public class SpControllerTest {

	static LogPrinter lp = LogPrinter.getInstance();
	SpController c = new SpController();
	
	@Test
	public void testExecutiveStrategy() {
		
		lp.printHead("'Executive' Strategy Pattern ");
		c.start(1);
		lp.countServed();
		assertTrue(true);
		
	}
	
	@Test
	public void testStaffStrategy() {
		
		lp.printHead("'Staff' Strategy Pattern ");
		c.start(5);
		lp.countServed();
		assertTrue(true);
		
	}
	
}
