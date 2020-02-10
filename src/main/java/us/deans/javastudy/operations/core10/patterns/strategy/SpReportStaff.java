package us.deans.javastudy.operations.core10.patterns.strategy;

import java.util.Iterator;
import java.util.List;

public class SpReportStaff extends SpProcessBase implements SpReportStrategy {

	public SpReportStaff() {
		super();
		lp.printMsg("!!! instantiating the Processor !!!");
	}

	@Override
	public List<SpDataRecord> getReport(List<SpDataRecord> data) {

		Iterator<SpDataRecord> itr = data.iterator();
		
		while (itr.hasNext()) {
			SpDataRecord record = itr.next();
			record.SALARY = 0;
			lp.printMsg(">> " + record.getString());
		}
		
		return data;
	}

}
