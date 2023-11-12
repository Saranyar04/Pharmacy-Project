import pharmacy.*;
import users.*;
import java.util.ArrayList;
import java.util.List;

final public class Pharmacy implements ISale, IPerson {

    private String pharmacyName;
    private final static double TAX = 7.5;
    private List<Doctor> doctorList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
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
        employeeList.add(employee);
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
            sellTotal = (float) (sellTotal + i.getPrice());
        }

        if (customer.getInsurance().equals("PLAN_A")) {
            float paidByInsurance = (float) (sellTotal * IInsuranceRate.PLAN_A);
            float paidByCustomer = sellTotal - paidByInsurance;
            float tax = sellTotal * 
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        }else if (customer.getInsurance().equals("PLAN_B")) {
            float paidByInsurance = (float) (sellTotal * IInsuranceRate.PLAN_B);
            float paidByCustomer = sellTotal - paidByInsurance;
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsurance().equals("PLAN_C")) {
                float paidByInsurance = (float) (sellTotal * IInsuranceRate.PLAN_C);
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

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacy_Name) {
        pharmacyName = "FAid Pharmacy";
    }

}
