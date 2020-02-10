package us.deans.javastudy.operations.core10.patterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import us.deans.javastudy.base.BaseOperation;


public class DmJdbcTopTenArrayList extends BaseOperation implements IDataAdapter_TopTen_List {

	Connection conn;
	
	public DmJdbcTopTenArrayList() {	
	
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "system", "!code"); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getMessage() {
		return "Hello World";
	}
	
	@Override
	public List<String> getListOfRecords() {
		
	//  LinkedList<String> list = new LinkedList<String>();
		ArrayList<String> list = new ArrayList<String>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from hr.top_ten_list");
			
			while (rs.next()) {
				
				DataRecord data = new DataRecord();
				data.FIRST_NAME = rs.getString(1);
				data.LAST_NAME = rs.getString(2);
				data.SALARY = rs.getLong(3);
				data.DEPARTMENT_NAME = rs.getString(4);
				data.CITY = rs.getString(5);
				
				String record = data.getString();
				lp.printMsg(record);
				list.add(record);
				
				data = null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
