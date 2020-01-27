package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import us.deans.javastudy.operations.core10.OpJdbcOracle;

public class OpJdbcOracleTest {

	@Test
	public void testConnection() {
		
		OpJdbcOracle oracle = new OpJdbcOracle();
		List<String> list = oracle.getListOfRecords();
		assertTrue(list.size() > 0);	
		
	}
	
	
	
}
