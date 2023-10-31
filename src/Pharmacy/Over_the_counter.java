//Package

package Pharmacy;

public class Over_the_counter extends Medecine{
    String otc_id;
    String uses;
    public void add_otc(String mname, String mtype, String mcompany, String mdescription, float mprice, String otcid, String muses) {
        med_name = mname;
        med_type = mtype;
        med_company = mcompany;
        med_description = mdescription;
        med_price = mprice;
        otc_id = otcid;
        uses = muses;
    }
    public void edit_ots() {}
    public void delete_otc() {}

}
