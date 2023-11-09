package pharmacy;

import users.Customer;
import users.Employee;
import java.util.List;

public interface Sale {

    public void calculateSale(Employee employee, Customer customer, List<Medicine> medicines);
}