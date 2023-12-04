package pharmacy;

import interfaces.IPrint;
import interfaces.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import users.Customer;
import users.Employee;

import java.time.LocalDateTime;
import java.util.List;

public class Receipt implements IPrint {

    private static final Logger LOGGER = LogManager.getLogger(Receipt.class);
    private Customer saleCustomer;
    private Employee saleEmployee;
    LocalDateTime saleDate;
    private List<Medicine> medicines;
    private float total;

    public Receipt(Customer saleCustomer, Employee saleEmployee, List<Medicine> medicines, float total) {
        this.medicines = medicines;
        this.saleCustomer = saleCustomer;
        this.saleEmployee = saleEmployee;
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        this.saleDate = supplier.get();
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
    public void printReceipt(Receipt receipt) {
        LOGGER.info("Receipt Details");
        LOGGER.info(toString());
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "saleCustomer=" + saleCustomer +
                ", saleEmployee=" + saleEmployee +
                ", saleDate=" + saleDate +
                ", medicines=" + medicines +
                ", total=" + total +
                '}';
    }
}
