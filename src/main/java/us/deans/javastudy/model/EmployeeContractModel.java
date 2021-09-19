package us.deans.javastudy.model;

public class EmployeeContractModel {

    private int emplId;
    private String office;

    public EmployeeContractModel(int empId, String office) {
        this.emplId = empId;
        this.office = office;
    }

    public String getEmpId() {
        return Integer.toString(emplId);
    }

    public String getOffice() {
        return this.office;
    }

    public String toString() {
        String readOut = Integer.toBinaryString(this.emplId) + " : " + this.office + " ;;; ";
        return readOut;
    }

}
