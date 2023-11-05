//package

package users;

public class SalesPerson extends Employee {

    public String empId;
    public String shift;
    public SalesPerson(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String userName, String password, String empId, String shift){
        this.legalName = legalName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
        this.userName = userName;
        this.password = password;
        this.empId = empId;
        this.shift = shift;
    }
}
