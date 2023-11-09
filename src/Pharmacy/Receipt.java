package pharmacy;

import users.Customer;
import users.Employee;
import java.util.List;

public class Receipt {

    Customer saleCustomer;
    Employee saleEmployee;
    List<Medicine> medicines;
    private float total;

    public Receipt(Customer saleCustomer, Employee saleEmployee, List<Medicine> medicines,float total) {
        this.medicines = medicines;
        this.saleCustomer = saleCustomer;
        this.saleEmployee = saleEmployee;
        this.total = total;
    }

    public Customer getSaleCustomer() {
        return saleCustomer;
    }

    public void setSaleCustomer(Customer saleCustomer) {
        this.saleCustomer = saleCustomer;
    }

    public Employee getSaleEmployee() {
        return saleEmployee;
    }

    public void setSaleEmployee(Employee saleEmployee) {
        this.saleEmployee = saleEmployee;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "saleCustomer=" + saleCustomer +
                ", saleEmployee=" + saleEmployee +
                ", Medicine= " + medicines +
                ", total=" + total +
                '}';
    }
}
