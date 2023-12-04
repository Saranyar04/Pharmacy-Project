package users;

import enums.EmployeeType;
import exceptions.InvalidLegalNameException;
import exceptions.InvalidPhoneNoException;

import java.util.Date;

public class Employee extends Person {

    private String designation;
    private EmployeeType employeeType;
    private float salary;

    public Employee(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String designation, EmployeeType employeeType, int salary) throws InvalidLegalNameException, InvalidPhoneNoException {
        super (legalName, gender, dateOfBirth, phoneNo, address, email);
        this.designation = designation;
        this.employeeType = employeeType;
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

    @Override
    public String toString() {
        return "Employee{" + "Legal Name= " + super.getLegalName()
                + "Gender='" + super.getGender()
                + "Date of Birth='" + super.getDateOfBirth()
                + "Phone No='" + super.getPhoneNo()
                + "Address=" + super.getAddress() +
                "designation='" + designation + '\'' +
                "employee type=" + employeeType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
