package us.deans.javastudy.operations.core10.patterns.strategy;

import java.util.Iterator;
import java.util.List;
import us.deans.javastudy.base.BaseOperation;

public class SpController extends BaseOperation {

	private List<SpDataRecord> data;
	private List<SpDataRecord> report;
	private SpDataSource dataSource;
	
	public SpController() {
		lp.printMsg("!!! instantiating the Controller !!!");
	}

	public void start(int option) {
		
		dataSource = new SpDataSource();
		data = dataSource.getListOfRecords();
		lp.printMsg("DataSource is populated.");
		
		if (option == 1) {
			report = filter(data, new SpReportExecutive(option));
		}
		if (option == 5) {
			report = filter(data, new SpReportStaff());
		}
		printReport();
	}
	
	
	public static final List<SpDataRecord> filter(List<SpDataRecord> data, SpReportStrategy strategy) {
		return strategy.getReport(data);
	}
	
	
	public void printReport() {
		Iterator<SpDataRecord> itr = report.iterator();
		while (itr.hasNext()) {
			SpDataRecord record = itr.next();
			lp.printMsg(">> " + record.getString());
		}
	}

}
