package pharmacy;

import users.Customer;
import users.Doctor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prescription {

    private int number;
    private List<Medicine> Medicine_List  = new ArrayList<Medicine>();
    private int quantity;
    private String prescriptionDosage;
    private Doctor doctor;
    private Customer customer;

    public Prescription(int number, List<Medicine> medList, int Quantity, String prescriptionDosage, Doctor doctor, Customer customer) {
        this.number = number;
        this.Medicine_List = medList;
        this.quantity = Quantity;
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
        return number == that.number && quantity == that.quantity && Objects.equals(Medicine_List, that.Medicine_List) && Objects.equals(prescriptionDosage, that.prescriptionDosage) && Objects.equals (doctor, that.doctor) && Objects.equals (customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, Medicine_List, quantity, prescriptionDosage, doctor, customer);
    }
}
