import enums.PharmacyDetails;
import enums.TaxRate;
import interfaces.*;
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
import java.util.stream.Collectors;

final public class Pharmacy implements ISale, IPerson, IPharmacy {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static Map<String, List<Person>> personMap = new HashMap<>();
    private static String pharmacyName;
    private static TaxRate taxRate;
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
    public void calculateSale(Employee employee, Customer customer, List<Medicine> medicines) {
        float sellTotal = 0;
        for (Medicine i : medicines) {
            sellTotal = (float) (sellTotal + i.getPrice());
        }
        float paidByCustomer;
            paidByCustomer = (float) (sellTotal - (sellTotal * customer.getInsuranceRate().getRate() / 100) + (sellTotal * (TaxRate.TAX.getTaxRate() / 100)));
        Receipt insuranceSaleReceipt = new Receipt(customer, employee, medicines, paidByCustomer);
        receipts.add(insuranceSaleReceipt);
        IGetCustomerTotal igetCustomerTotal = () -> LOGGER.info("Customer Total = " + paidByCustomer);
        igetCustomerTotal.getCustomerTotal();
    }

    public void printReceipts() {
        ListPrinter printer = new ListPrinter(receipts);
    }

    public void printPrescriptionQueue() {
        prescriptionQueue.forEach( (n) -> LOGGER.info("Prescription List : " + n));
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

    public void printPersonMap() {
        for (Map.Entry<String, List<Person>> entry : personMap.entrySet()) {
            LOGGER.info(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void printInfo() {
        LOGGER.info("Pharmacy Name : " + PharmacyDetails.NAME.getPharmacyDetails());
        LOGGER.info("Pharmacy Address : " + PharmacyDetails.ADDRESS.getPharmacyDetails());
        LOGGER.info(PharmacyDetails.STATE.getPharmacyDetails());
    }

    public void getCustomerReceipts(String name) {
        //To print the receipts of the given customer name using Predicates
        List<Receipt> customerReceipt = receipts.stream().filter(receipt -> receipt.getSaleCustomer().getLegalName() == name).collect(Collectors.toList());
        ListPrinter printer = new ListPrinter(customerReceipt);
    }
}
