package users;

import exceptions.LegalNameException;
import exceptions.PhoneNoException;

import java.util.Date;

public class Employee extends Person {

    private String designation;
    private float salary;

    public Employee(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String designation, float salary) throws LegalNameException, PhoneNoException {
        super (legalName, gender, dateOfBirth, phoneNo, address, email);
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    final void printEmployeeDetails() {
        System.out.println("Employee Information : " + "Legal Name : " + super.getLegalName() + "Phone No : "  + super.getPhoneNo() + "Address : " + super.getAddress());
    }
}
