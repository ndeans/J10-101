package us.deans.javastudy.operations.core10.patterns.strategy;

public class SpDataRecord {

	public String FIRST_NAME;
	public String LAST_NAME;
	public long SALARY;
	public String DEPARTMENT_NAME;
	public String CITY;	

	public String getString() {
		return "{" + FIRST_NAME + ", " + LAST_NAME + ", " + SALARY + ", " + DEPARTMENT_NAME + ", " + CITY + "}";
	}

}
