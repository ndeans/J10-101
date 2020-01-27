package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import us.deans.javastudy.operations.core10.patterns.OpHelloDI;

/**
 * Unit test for the Dependency Injection Operation
 * 
 * @author ndeans
 *
 */

public class OpHelloDITest {

	OpHelloDI op = new OpHelloDI();
	String test = "How are you doing today?";
	String msg = null;
	
	@Test
	public void testOpHelloDI_noinjection() {
		op.start(0);
		msg = op.getGreeting();
		assertTrue(msg == test);
	}
	
	@Test
	public void testOpHelloDI_constructor() {
		op.start(1);
		assertTrue(op.getGreeting() == test);
	}
	
	@Test
	public void testOpHelloDI_setter() {
		op.start(2);
		assertTrue(op.getGreeting() == test);
	}
	
	@Test
	public void testOpHelloDI_interface() {
		op.start(3);
		assertTrue(op.getGreeting() == test);
	}
	
}
