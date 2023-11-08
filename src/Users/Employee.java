package users;

import static java.lang.Math.random;

public class Employee extends Person {

    private String designation;
    private float salary;
    private double employeeId;

    public Employee(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String employeeId) {
        super (legalName, gender, dateOfBirth, phoneNo, address, email);
        this.designation = designation;
        this.salary = salary;
        this.employeeId =  random();
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

    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }
}
