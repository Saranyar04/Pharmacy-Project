package pharmacy;

import users.Customer;
import users.Employee;
import java.util.List;

public interface ISale {

    void calculateSale(Employee employee, Customer customer, List<Medicine> medicines);

}