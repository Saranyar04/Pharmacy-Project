package pharmacy;

import users.Customer;
import users.Doctor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prescription {

    private int number;
    private List<Medicine> medicineList = new ArrayList<Medicine>();
    private int quantity;
    private String prescriptionDosage;
    private Doctor doctor;
    private Customer customer;

    public Prescription(int number, List<Medicine> medicineList, int quantity, String prescriptionDosage, Doctor doctor, Customer customer) {
        this.number = number;
        this.medicineList = medicineList;
        this.quantity = quantity;
        this.prescriptionDosage = prescriptionDosage;
        this.doctor = doctor;
        this.customer = customer;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
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
        return number == that.number && quantity == that.quantity && Objects.equals(medicineList, that.medicineList) && Objects.equals(prescriptionDosage, that.prescriptionDosage) && Objects.equals (doctor, that.doctor) && Objects.equals (customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, medicineList, quantity, prescriptionDosage, doctor, customer);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "number=" + number +
                ", medicineList=" + medicineList +
                ", quantity=" + quantity +
                ", prescriptionDosage='" + prescriptionDosage + '\'' +
                ", doctor=" + doctor +
                ", customer=" + customer +
                '}';
    }
}
