package enums;

public enum EmployeeType {

    PHARMACIST("Pharmacist"),
    CASHIER("Cashier");

    private final String employeeType;

    EmployeeType(String employeetype) {
        this.employeeType = employeetype;
    }

    public String getEmployeeType() {
        return employeeType;
    }
}
