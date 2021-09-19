package us.deans.javastudy.operations.core10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.model.EmployeeContractModel;
import us.deans.javastudy.model.EmployeeModel;

public class StreamAPI_Combine extends BaseOperation {

    private List<EmployeeModel> plm = new ArrayList<EmployeeModel>();
    private List<EmployeeContractModel> ptc = new ArrayList<EmployeeContractModel>();

    // constructor builds automatic test data.
    public StreamAPI_Combine() {
        populateInputs();
    }

    public void populateInputs() {

        plm.add(new EmployeeModel(1, "Pete McConnell"));
        plm.add(new EmployeeModel(2, "Keith Tennyson"));
        plm.add(new EmployeeModel(3, "Rakheem Kumar"));

        ptc.add(new EmployeeContractModel(1, "Boston"));
        ptc.add(new EmployeeContractModel(2, "San Diego"));
        ptc.add(new EmployeeContractModel(3, "Houston"));

    }


    @Override
    public void start() {
        super.start();
        List<EmployeeModel> clm = (combine(plm, ptc));
        System.out.println(clm.toString());
    }

    public List<EmployeeModel> combine(List<EmployeeModel> plm, List<EmployeeContractModel> ptc) {

        List<EmployeeModel> updatedList = plm.stream()
                .filter(p -> ptc.stream()
                        .anyMatch(o ->
                                p.getEmpId().equals(o.getEmpId())))
                .collect(Collectors.toList());

        return (List<EmployeeModel>) updatedList;

    }

    public List<EmployeeModel> getPlm() {
        return plm;
    }

    public List<EmployeeContractModel> getPtc() {
        return ptc;
    }


}
