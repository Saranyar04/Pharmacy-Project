import exceptions.InvalidInsuranceRateException;
import interfaces.IInsuranceRate;
import interfaces.IPerson;
import interfaces.IPharmacy;
import interfaces.ISale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.*;
import users.*;
import java.util.ArrayList;
import java.util.List;

final public class Pharmacy implements ISale, IPerson, IPharmacy {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static String pharmacyName;
    private final static double TAX = 7.5;
    private final List<Doctor> doctorList = new ArrayList<>();
    private final List<Employee> employeeList = new ArrayList<>();
    private final List<Medicine> medicineList = new ArrayList<>();
    private final List<Prescription> prescriptionList = new ArrayList<>();
    private final List<Customer> customerList = new ArrayList<>();
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
    public void calculateSale(Employee employee, Customer customer, List<Medicine> medicines) throws InvalidInsuranceRateException {
        float sellTotal = 0;
        for (Medicine i : medicines) {
            sellTotal = (float) (sellTotal + i.getPrice( ));
        }

        if (customer.getInsuranceRate() == IInsuranceRate.PLAN_A) {
            float paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_A / 100);
            float paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (7.5 / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.PLAN_B) {
            float paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_B / 100);
            float paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (7.5 / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.PLAN_C) {
            float paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_C / 100);
            float paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (7.5 / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.NO_INSURANCE) {
            float paidByCustomer = (float) ((sellTotal) + (sellTotal * (7.5 / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, sellTotal);
            receipts.add(insuranceSaleReceipt);
        }
        else {
            throw new InvalidInsuranceRateException("Invalid Insurance type");
        }
        LOGGER.info("Receipt Details=" + receipts);
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public static String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacy_Name) {
        pharmacyName = "FAid Pharmacy";
    }
}
