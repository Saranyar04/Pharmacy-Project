//package

package users;

public class SalesPerson extends Employee {

    private String shift;

    public SalesPerson(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String employeeId, String shift) {
        super (legalName, gender, dateOfBirth, phoneNo, address, email, designation, salary, employeeId);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
