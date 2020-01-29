package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import us.deans.javastudy.operations.core10.DmJdbcTopTenLinkedList;
import us.deans.javastudy.support.LogPrinter;

public class DmJdbcTopTenArrayListTest {

	LogPrinter lp;
	
	@Test
	public void testConnection() {
		
		DmJdbcTopTenLinkedList oracle = new DmJdbcTopTenLinkedList();
		List<String> list = oracle.getListOfRecords();
		
		String test = list.toString();
		System.out.println(test);
		// lp.printMsg(test);
		assertTrue(list.size() > 0);	
		
	}
}