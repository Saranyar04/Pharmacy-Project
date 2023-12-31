import enums.PharmacyDetails;
import enums.TaxRate;
import interfaces.IGetCustomerTotal;
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
import java.util.stream.Collectors;

import static enums.CompanyName.PNC_PHARMACY;
import static enums.MedicineType.OVER_THE_COUNTER;
import static util.Printer.print;

final public class Pharmacy implements ISale, IPerson, IPharmacy {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static Map<String, List<Person>> personMap = new HashMap<>();
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
        print(receipts);
        LOGGER.info("Max Total " + receipts.stream().map(r -> r.getTotal()).max(Comparator.comparing(Float :: valueOf)).get());
    }

    public void printPrescriptionQueue() {
        prescriptionQueue.forEach( (n) -> LOGGER.info("Prescription List : " + n));
        LOGGER.info("Total number of prescription : " + prescriptionQueue.stream().count());
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public void printPersonMap() {
        personMap.forEach((k,v) -> LOGGER.info(k + v));
    }

    public void printInfo() {
        LOGGER.info("Pharmacy Name : " + PharmacyDetails.NAME.getPharmacyDetails());
        LOGGER.info("Pharmacy Address : " + PharmacyDetails.ADDRESS.getPharmacyDetails());
        LOGGER.info(PharmacyDetails.STATE.getPharmacyDetails());
    }

    public void getCustomerReceipts(String name) {
        List<Receipt> customerReceipt = receipts.stream().filter(receipt -> receipt.getSaleCustomer().getLegalName() == name).collect(Collectors.toList());
        print(customerReceipt);
    }

    public void printSaleEmployeeList() {
        //To store all employees who made a sale in ana array toArray().
        String[] salesEmployees = receipts.stream().map(r -> r.getSaleEmployee().getLegalName()).toArray(String[] :: new);
        Arrays.stream(salesEmployees).forEach(s -> LOGGER.info(s));
    }

    public void viewCompanyMedicineList() {
        medicineList.stream().filter(med -> med.getCompany() == PNC_PHARMACY).filter(med -> med.getType() == OVER_THE_COUNTER).forEach(med -> LOGGER.info(med));
    }

    public void viewMedicineNames() {
        List<String> medName = medicineList.stream().map(r -> r.getName()).collect(Collectors.toList());
        medName.forEach(n -> LOGGER.info(n));
    }

    public void printSortedReceiptTotal() {
        //Uses sorted()
        receipts.stream().map(r -> r.getTotal()).sorted().forEach(s -> LOGGER.info("Sorted Receipts : " + s));
    }
}
