package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import us.deans.javastudy.operations.core10.patterns.DmJdbcTopTenLinkedList;
import us.deans.javastudy.support.LogPrinter;

public class DmJdbcTopTenArrayListTest {

	LogPrinter lp;
	
	@Test
	public void testConnection() {
		
		DmJdbcTopTenLinkedList top10 = new DmJdbcTopTenLinkedList();
		List<String> list = top10.getListOfRecords();
		
		String test = list.toString();
		lp.printMsg(test);
		assertTrue(list.size() > 0);	
		
	}
	
	
	
}
