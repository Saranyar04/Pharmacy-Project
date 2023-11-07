import pharmacy.*;
import users.*;
import java.util.ArrayList;

public class Pharmacy {

    final String name = "Faid Pharmacy";
    private  ArrayList<Sale> saleList;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Pharmacist> pharmacistList;
    private ArrayList<SalesPerson> salesPersonList;
    private ArrayList<OverTheCounter> otcList;
    private ArrayList<Prescription> prescriptionList;
    private ArrayList<Customer> customerList;
    private ArrayList<PrescriptionDrug> drugList;

    public Pharmacy() {
        saleList = new ArrayList<Sale>();
        doctorList = new ArrayList<Doctor>();
        pharmacistList = new ArrayList<Pharmacist>();
        salesPersonList = new ArrayList<SalesPerson>();
        otcList = new ArrayList<OverTheCounter>();
        prescriptionList = new ArrayList<Prescription>();
        customerList = new ArrayList<Customer>();
        drugList = new ArrayList<PrescriptionDrug>();
    }

    public void addOtc(OverTheCounter overTheCounter) {
        otcList.add(overTheCounter);
    }

    public void addSale(Sale sale) {
        saleList.add(sale);
    }

    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public void addPharmacist(Pharmacist pharmacist) {
        pharmacistList.add(pharmacist);
    }

    public void addSalesPerson(SalesPerson salesPerson) {
        salesPersonList.add(salesPerson);
    }

    public void addPrescription(Prescription prescription) {
        prescriptionList.add(prescription);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void addPrescriptionDrug(PrescriptionDrug prescriptionDrug) {
        drugList.add(prescriptionDrug);
    }

    public void setOtcList(ArrayList<OverTheCounter> otcList) {
        this.otcList = otcList;
    }
}
