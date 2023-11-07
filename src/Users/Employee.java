package users;

public abstract class Employee extends Person {

    private String designation;
    private float salary;
    private String employeeId;

    public Employee(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String employeeId) {
        super (legalName, gender, dateOfBirth, phoneNo, address, email);
        this.designation = designation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public String getDesignation() {

        return designation;
    }

    public float getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
