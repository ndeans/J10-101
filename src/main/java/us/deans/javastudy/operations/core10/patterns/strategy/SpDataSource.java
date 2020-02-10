package us.deans.javastudy.operations.core10.patterns.strategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import us.deans.javastudy.support.LogPrinter;

public class SpDataSource {

	Connection conn;
	LinkedList<SpDataRecord> list = new LinkedList<SpDataRecord>();
	LogPrinter lp = LogPrinter.getInstance();
	
	public SpDataSource() {
		
		lp.printMsg("!!! instantiating the DataSource !!!");
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "system", "!code"); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<SpDataRecord> getListOfRecords() {
		
		list = new LinkedList<SpDataRecord>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from hr.top_ten_list");
			
			while (rs.next()) {
				SpDataRecord data = new SpDataRecord();
				data.FIRST_NAME = rs.getString(1);
				data.LAST_NAME = rs.getString(2);
				data.SALARY = rs.getLong(3);
				data.DEPARTMENT_NAME = rs.getString(4);
				data.CITY = rs.getString(5);
			//	lp.printMsg(">> " + data.getString());
				list.add(data);
				data = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public void printListOfRecords() {
		
		Iterator<SpDataRecord> itr = list.iterator();
		
		while (itr.hasNext()) {
			SpDataRecord record = itr.next();
			lp.printMsg(">> " + record.getString());
		}
		
		
	}
	
}
