package interfaces;

import users.Customer;
import users.Doctor;
import users.Employee;

public interface IPerson {

    void addEmployee(Employee employee);
    void addDoctor(Doctor doctor);
    void addCustomer(Customer customer);

}
