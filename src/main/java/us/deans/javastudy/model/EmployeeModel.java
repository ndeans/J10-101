package us.deans.javastudy.model;

/*
 * This is used for testing combo streaming technique
 *
 */
public class EmployeeModel {

    private int empId;
    private String name;
    private String office = null;

    public EmployeeModel(int empid, String name) {
        this.empId = empid;
        this.name = name;
    }

    public String getEmpId() {
        return Integer.toString(empId);
    }

    public String getName() {
        return this.name;
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }


}

