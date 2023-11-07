package pharmacy;

import users.Customer;
import users.Doctor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prescription {

    private final int number;
    private List<Medicine> medList  = new ArrayList<Medicine>();
    private final int quantity;
    private final String prescriptionDosage;
    private Doctor doctor;
    private final Customer customer;

    public Prescription(int number, List<Medicine> medList, int quantity, String prescriptionDosage, Doctor doctor, Customer customer) {
        this.number = number;
        this.medList = medList;
        this.quantity = quantity;
        this.prescriptionDosage = prescriptionDosage;
        this.doctor = doctor;
        this.customer = customer;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass( ) != o.getClass( ))
            return false;
        Prescription that = (Prescription) o;
        return number == that.number && quantity == that.quantity && Objects.equals(medList, that.medList) && Objects.equals(prescriptionDosage, that.prescriptionDosage) && Objects.equals (doctor, that.doctor) && Objects.equals (customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, medList, quantity, prescriptionDosage, doctor, customer);
    }
}
