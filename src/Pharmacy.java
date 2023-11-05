//package

import pharmacy.OverTheCounter;
import pharmacy.PrescriptionDrug;
import pharmacy.Sales;
import users.Customer;
import users.Doctor;
import users.Pharmacist;
import users.SalesPerson;

import java.util.ArrayList;

public class Pharmacy {

    public ArrayList<Sales> saleList;

    public void addOtc(String mName, String mType, String mCompany, String mDescription, float mPrice, String otcId, String mUses) {
        OverTheCounter otc = new OverTheCounter ( );
        otc.medName = mName;
        otc.medType = mType;
        otc.medCompany = mCompany;
        otc.medDescription = mDescription;
        otc.medPrice = mPrice;
        otc.otcId = otcId;
        otc.uses = mUses;
    }

    public void addPrescriptiondrug(String mName, String mType, String mCompany, String mDescription, float mPrice, String mId, String mDosage, String sInstruction) {
        PrescriptionDrug p1 = new PrescriptionDrug ( );
        p1.medName = mName;
        p1.medType = mType;
        p1.medCompany = mCompany;
        p1.medDescription = mDescription;
        p1.medPrice = mPrice;
        p1.medId = mId;
        p1.dosage = mDosage;
        p1.specialInstruction = sInstruction;
    }

    public void addSales(String rNumber, String rDate, String[] lItem, String cName, String sName, float rTotal, float insurancePays, float cOwes) {
        Sales s1 = new Sales ( );
        s1.receiptNumber = rNumber;
        s1.receiptDate = rDate;
        s1.listOfItems = lItem;
        s1.customerName = cName;
        s1.salesPerson = sName;
        s1.receiptTotal = rTotal;
        s1.insurancePays = insurancePays;
        s1.customerOwes = cOwes;
        saleList.add(s1);
    }
}
