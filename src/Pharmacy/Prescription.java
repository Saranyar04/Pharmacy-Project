//Package

package Pharmacy;
import java.util.ArrayList;
import java.util.List;

public class Prescription {
    int prescription_no;
    List<String> med_list  = new ArrayList<> ();
    int quantity;
    String prescription_dosage;
    String doctor_name;
    String customer_id;
    public void addPrescription(int prescription_no, List<String> med_list, int quantity, String prescription_dosage, String doctor_name, String customer_id) {
        this.prescription_no = prescription_no;
        this.med_list = med_list;
        this.quantity = quantity;
        this.prescription_dosage = prescription_dosage;
        this.doctor_name = doctor_name;
        this.customer_id = customer_id;
    }

}
