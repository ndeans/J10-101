package us.deans.javastudy.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import us.deans.javastudy.operations.core10.OpJdbcOracle;

public class OpJdbcOracleTest {

	@Test
	public void testConnection() {
		
		OpJdbcOracle oracle = new OpJdbcOracle();
		System.out.println(oracle.getMessage());
		assertTrue(oracle.getMessage().length() > 0);	
		
	}
	
	
	
}
