package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import us.deans.javastudy.operations.core10.patterns.DmJdbcTopTenMap;
import us.deans.javastudy.support.LogPrinter;

public class DmJdbcTopTenMapTest {

	LogPrinter lp;
	
	@Test
	public void testConnection() {
		
		DmJdbcTopTenMap oracle = new DmJdbcTopTenMap();
		Map<Integer, String> map = oracle.getMapOfRecords();
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while (itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key.toString() + ", " + value);
			// lp.printMsg(key.toString() + ", " + value);
		}
		assertTrue(map.size() > 0);	
		
	}
}
