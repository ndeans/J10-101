package us.deans.javastudy.operations.core10.patterns.strategy;

import java.util.List;

public class SpReportExecutive extends SpProcessBase implements SpReportStrategy {

    public SpReportExecutive(int option) {
        super();
        lp.printMsg("!!! instantiating the Processor !!!");
    }

    @Override
    public List<SpDataRecord> getReport(List<SpDataRecord> data) {
        return data;
    }

}
