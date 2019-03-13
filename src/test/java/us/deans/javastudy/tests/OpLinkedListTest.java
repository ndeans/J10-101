package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.deans.javastudy.operations.core10.OpLinkedList;
import us.deans.javastudy.support.LogPrinter;

class OpLinkedListTest {

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
	
		lp.printHead("Create and populate a LinkedList...");
		OpLinkedList llist = new OpLinkedList();
		llist.getStatus();
		llist = null;
		lp.printBreak();

	}

}
