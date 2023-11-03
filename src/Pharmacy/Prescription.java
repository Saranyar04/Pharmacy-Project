//package

package pharmacy;
import java.util.ArrayList;
import java.util.List;

public class Prescription {

    public int prescriptionNo;
    public List<String> medList  = new ArrayList<> ();
    public int quantity;
    public String prescriptionDosage;
    public String doctorName;
    public String customerId;

    public Prescription(int prescriptionNo, List<String> medList, int quantity, String prescriptionDosage, String doctorName, String customerId) {
        this.prescriptionNo = prescriptionNo;
        this.medList = medList;
        this.quantity = quantity;
        this.prescriptionDosage = prescriptionDosage;
        this.doctorName = doctorName;
        this.customerId = customerId;
    }

}
