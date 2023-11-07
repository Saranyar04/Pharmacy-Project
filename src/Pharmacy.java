import pharmacy.*;
import users.*;
import java.util.ArrayList;
import java.util.List;

public class Pharmacy {

    protected String name = "Faid Pharmacy";
    private List<Sale> saleList =  new ArrayList<>();
    private List<Doctor> doctorList =  new ArrayList<>();
    private List<Pharmacist> pharmacistList =  new ArrayList<>();
    private List<SalesPerson> salesPersonList =  new ArrayList<>();
    private List<OverTheCounter> otcList =  new ArrayList<>();
    private List<Prescription> prescriptionList =  new ArrayList<>();
    private List<Customer> customerList =  new ArrayList<>();
    private List<PrescriptionDrug> drugList =  new ArrayList<>();

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
