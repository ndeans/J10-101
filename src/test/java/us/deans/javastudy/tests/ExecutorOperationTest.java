package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.core10.DmExecutorOperation;
import us.deans.javastudy.support.LogPrinter;

class ExecutorOperationTest {

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
	void test() {
		
		lp.printHead("Executor Operation...");
		
		DmExecutorOperation xo = new DmExecutorOperation();
		xo.start(1);
		
		fail("Not yet implemented");
	}

}
