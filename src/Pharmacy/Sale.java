package pharmacy;

import users.Customer;
import users.SalesPerson;
import java.util.List;

public class Sale {

    private String number;
    private String date;
    public List<Medicine> listOfItems;
    private Customer customer;
    private SalesPerson salesPerson;
    private float receiptTotal;
    private float insurancePays;
    private float customerOwes;

    public Sale(String number, String date, List<Medicine> listOfItems, Customer customer, SalesPerson salesPerson, float receiptTotal, float insurancePays, float customerOwes) {
        this.number = number;
        this.date = date;
        this.listOfItems = listOfItems;
        this.customer = customer;
        this.salesPerson = salesPerson;
        this.receiptTotal = receiptTotal;
        this.insurancePays = insurancePays;
        this.customerOwes = customerOwes;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Medicine> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Medicine> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public float getReceiptTotal() {
        return receiptTotal;
    }

    public void setReceiptTotal(float receiptTotal) {
        this.receiptTotal = receiptTotal;
    }

    public float getInsurancePays() {
        return insurancePays;
    }

    public void setInsurancePays(float insurancePays) {
        this.insurancePays = insurancePays;
    }

    public float getCustomerOwes() {
        return customerOwes;
    }

    public void setCustomerOwes(float customerOwes) {
        this.customerOwes = customerOwes;
    }
}

