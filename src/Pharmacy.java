import pharmacy.*;
import users.*;
import java.util.ArrayList;
import java.util.List;

public class Pharmacy implements Sale {

    final String pharmacyName = "Faid Pharmacy";
    private List<Doctor> doctorList = new ArrayList<>();
    private List<Employee> EmployeeList = new ArrayList<>();
    private List<Medicine> medicineList = new ArrayList<>();
    private List<Prescription> prescriptionList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();

    private List<Receipt> receipts = new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        medicineList.add(medicine);
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

    @Override
    public void calculateSale(Employee employee, Customer customer, List<Medicine> medicines) {
        float sellTotal = 0;
        for (Medicine i : medicines) {
            sellTotal = (float) (sellTotal + i.getPrice( ));
        }

        if (customer.getInsurance( ).equals("YES")) {
            float paidByInsurance = (float) (sellTotal * 0.30);
            float paidByCustomer = sellTotal - paidByInsurance;
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else {
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, sellTotal);
            receipts.add(insuranceSaleReceipt);
        }
        System.out.println("Receipt Details=" + receipts);
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }
}
