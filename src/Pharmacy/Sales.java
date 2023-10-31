//Package

package Pharmacy;

public class Sales {
    int receipt_number;
    String receipt_date;
    float receipt_total;
    float insurance_pays;
    float customer_owes;

    public void addSales(int receipt_number, String receipt_date, float receipt_total, float insurance_pays, float customer_owes){
        this.receipt_number = receipt_number;
        this.receipt_date = receipt_date;
        this.receipt_total = receipt_total;
        this.insurance_pays = insurance_pays;
        this.customer_owes = customer_owes;
    }
}
