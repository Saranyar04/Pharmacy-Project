package pharmacy;

import users.Customer;
import users.Doctor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prescription {

    private final int Number;
    private List<Medicine> Medicine_List  = new ArrayList<Medicine>();
    private final int Quantity;
    private final String Prescription_Dosage;
    private Doctor doctor;
    private Customer customer;

    public Prescription(int number, List<Medicine> medList, int Quantity, String Prescription_Dosage, Doctor doctor, Customer customer) {
        this.Number = number;
        this.Medicine_List = medList;
        this.Quantity = Quantity;
        this.Prescription_Dosage = Prescription_Dosage;
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
        return Number == that.Number && Quantity == that.Quantity && Objects.equals(Medicine_List, that.Medicine_List) && Objects.equals(Prescription_Dosage, that.Prescription_Dosage) && Objects.equals (doctor, that.doctor) && Objects.equals (customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number, Medicine_List, Quantity, Prescription_Dosage, doctor, customer);
    }
}
