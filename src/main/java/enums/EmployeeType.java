package enums;

public enum EmployeeType {

    PHARMACIST("Pharmacist"),
    CASHIER("Cashier");

    private final String employeetype;

    EmployeeType(String employeetype) {
        this.employeetype = employeetype;
    }

    public String getEmployeetype() {
        return employeetype;
    }
}
