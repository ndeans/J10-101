package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.deans.javastudy.support.LogPrinter;
import us.deans.javastudy.operations.LambdaVsMethod;

class LambdaVsMethodTest {

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
	
		lp.printHead("Lambda Expression...");
		LambdaVsMethod lx = new LambdaVsMethod();
				
		int x1 = lx.strComparator.compare("hello", "world");
		lp.printMsg("method comparison: " + x1);
		assertEquals(x1, -15);
		
		int x2 = lx.strComparatorLambda.compare("hello", "world");
		lp.printMsg("lambda comparison: " + x2);
		assertEquals(x2, -15);

		lp.printBreak();
	}

}
