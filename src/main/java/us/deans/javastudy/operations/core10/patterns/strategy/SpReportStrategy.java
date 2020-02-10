package us.deans.javastudy.operations.core10.patterns.strategy;

import java.util.List;

public interface SpReportStrategy {

	public List<SpDataRecord> getReport(List<SpDataRecord> data);

}
