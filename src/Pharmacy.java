import exceptions.InvalidInsuranceRateException;
import interfaces.IInsuranceRate;
import interfaces.IPerson;
import interfaces.IPharmacy;
import interfaces.ISale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.Medicine;
import pharmacy.Prescription;
import pharmacy.Receipt;
import users.Customer;
import users.Doctor;
import users.Employee;
import users.Person;

import java.util.*;

final public class Pharmacy implements ISale, IPerson, IPharmacy {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static Map<String, List<Person>> personMap = new HashMap<>();
    private static String pharmacyName;
    private final static double TAX = 7.5;
    private final List<Medicine> medicineList = new ArrayList<>();
    private List<Receipt> receipts = new ArrayList<>();
    private Queue<Prescription> prescriptionQueue = new LinkedList<>();

    public void addMedicine(Medicine medicine) {
        medicineList.add(medicine);
    }

    public void addDoctor(Doctor doctor) {
        if (!personMap.containsKey("Doctor"))
            personMap.put("Doctor", new ArrayList<>());
        personMap.get("Doctor").add(doctor);
    }

    public void addEmployee(Employee employee) {
        if (!personMap.containsKey("Employee"))
            personMap.put("Employee", new ArrayList<>());
        personMap.get("Employee").add(employee);
    }

    public void addPrescription(Prescription prescription) {
        prescriptionQueue.add(prescription);
    }

    public void addCustomer(Customer customer) {
        if (!personMap.containsKey("Customer"))
            personMap.put("Customer", new ArrayList<>());
        personMap.get("Customer").add(customer);
    }

    @Override
    public void calculateSale(Employee employee, Customer customer, List<Medicine> medicines) throws InvalidInsuranceRateException {
        float sellTotal = 0;
        for (Medicine i : medicines) {
            sellTotal = (float) (sellTotal + i.getPrice());
        }
        float paidByInsurance, paidByCustomer;
        if (customer.getInsuranceRate() == IInsuranceRate.PLAN_A) {
            paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_A / 100);
            paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (TAX / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.PLAN_B) {
            paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_B / 100);
            paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (TAX / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.PLAN_C) {
            paidByInsurance = sellTotal * ((float) IInsuranceRate.PLAN_C / 100);
            paidByCustomer = (float) ((sellTotal - paidByInsurance) + (sellTotal * (TAX / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
            receipts.add(insuranceSaleReceipt);
        } else if (customer.getInsuranceRate() == IInsuranceRate.NO_INSURANCE) {
            paidByCustomer = (float) ((sellTotal) + (sellTotal * (TAX / 100)));
            Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
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

    public void setPharmacyName(String pharmacyName) {
        Pharmacy.pharmacyName = "FAid Pharmacy";
    }

    public void printPersonMap() {
        for (Map.Entry<String, List<Person>> entry : personMap.entrySet( )) {
            LOGGER.info(entry.getKey( ) + ":" + entry.getValue( ));
        }
    }
}
