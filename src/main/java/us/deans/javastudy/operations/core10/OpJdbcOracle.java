package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;
import java.sql.*;

public class OpJdbcOracle extends BaseOperation {

	Connection conn;
	
	public OpJdbcOracle() {	
	
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@XEPDB1", "system", "!code");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String getMessage() {
		return "Hello World";
	}
	
	
}
