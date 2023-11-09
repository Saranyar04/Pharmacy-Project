package users;

import static java.lang.Math.random;
import java.util.Date;

public class Employee extends Person {

    private String designation;
    private float salary;

    public Employee(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String designation, float salary) {
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

}
