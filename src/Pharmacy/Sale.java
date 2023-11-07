//Package

package pharmacy;

import users.Customer;
import users.SalesPerson;

public class Sale {

    private String number;
    private String date;
    public List<Medicine> listOfItems;
    private Customer customer;
    private SalesPerson salesPerson;
    private float receiptTotal;
    private float insurancePays;
    private float customerOwes;


    public Sale (String number, String date, List<Medicine> listOfItems, Customer customer, SalesPerson salesPerson, float receiptTotal, float insurancePays, float customerOwes) {
        this.number = number;
        this.date = date;
        this.listOfItems = listOfItems;
        this.customer = customer;
        this.salesPerson = salesPerson;
        this.receiptTotal = receiptTotal;
        this.insurancePays = insurancePays;
        this.customerOwes = customerOwes;
    }
}

