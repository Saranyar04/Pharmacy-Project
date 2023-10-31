//Package

package Pharmacy;

public class Prescription_drug extends Medecine{
    String med_id;
    String dosage;
    String special_instruction;
    public void add_Prescription_Drug(String mname, String mtype, String mcompany, String mdescription, float mprice, String mid, String mdosage, String sinstruction) {
        med_name = mname;
        med_type = mtype;
        med_company = mcompany;
        med_description = mdescription;
        med_price = mprice;
        med_id = mid;
        dosage = mdosage;
        special_instruction = sinstruction;
    }
}
