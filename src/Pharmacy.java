import pharmacy.*;
import users.*;
import java.util.ArrayList;
import java.util.List;

public class Pharmacy {

    protected String name = "Faid Pharmacy";
    private List<Sale> saleList =  new ArrayList<>();
    private List<Doctor> doctorList =  new ArrayList<>();
    private List<Employee> EmployeeList =  new ArrayList<>();
    private List<Medicine> medicineList =  new ArrayList<>();
    private List<Prescription> prescriptionList =  new ArrayList<>();
    private List<Customer> customerList =  new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        medicineList.add(medicine);
    }

    public void addSale(Sale sale) {
        saleList.add(sale);
    }

    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public void addEmployee(Employee employee) {
        EmployeeList.add(employee);
    }

    public void addPrescription(Prescription prescription) {
        prescriptionList.add(prescription);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
}
