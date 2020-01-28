package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import us.deans.javastudy.operations.core10.DmJdbcTopTenList;
import us.deans.javastudy.support.LogPrinter;

public class DmJdbcTopTenListTest {

	LogPrinter lp;
	
	@Test
	public void testConnection() {
		
		DmJdbcTopTenList oracle = new DmJdbcTopTenList();
		List<String> list = oracle.getListOfRecords();
		
		String test = list.toString();
		System.out.println(test);
		// lp.printMsg(test);
		assertTrue(list.size() > 0);	
		
	}
}
