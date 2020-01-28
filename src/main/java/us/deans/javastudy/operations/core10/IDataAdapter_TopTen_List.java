package us.deans.javastudy.operations.core10;

import java.util.List;

public interface IDataAdapter_TopTen_List {

	public String getMessage();
	public List<String> getListOfRecords();
	
	class DataRecord {
		public String FIRST_NAME;
		public String LAST_NAME;
		public long SALARY;
		public String DEPARTMENT_NAME;
		public String CITY;	
	
		protected String getString() {
			return FIRST_NAME + ", " + LAST_NAME + ", " + SALARY + ", " + DEPARTMENT_NAME + ", " + CITY + "\r";
		}
	}
}
