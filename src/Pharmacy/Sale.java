package pharmacy;

import users.Customer;
import users.Employee;
import java.time.LocalDate;
import java.util.List;

public class Sale {

    private String number;
    private LocalDate todayDate;
    private List<Medicine> listOfItems;
    private Customer customer;
    private Employee employee;
    private float receiptTotal;
    private float insurancePays;
    private float customerOwes;
    private void calculate(List<Medicine> listOfItems){
        for (Medicine i : listOfItems) {
            receiptTotal = (float) (receiptTotal + i.getPrice());
        }
        insurancePays = (float) (receiptTotal*0.30);
        customerOwes = receiptTotal - insurancePays;
    }

    public Sale(String number, List<Medicine> listOfItems, Customer customer, Employee employee) {
        this.number = number;
        this.todayDate = java.time.LocalDate.now();
        this.listOfItems = listOfItems;
        this.customer = customer;
        this.employee = employee;
        calculate(listOfItems);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(LocalDate todayDate) {
        this.todayDate = todayDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "number='" + number + '\'' +
                ", todayDate=" + todayDate +
                ", receiptTotal=" + receiptTotal +
                ", insurancePays=" + insurancePays +
                ", customerOwes=" + customerOwes +
                '}';
    }
}

