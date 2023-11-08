package users;

import java.util.Date;

public class Customer extends Person {

    private double customerId;
    private String insurance;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String insurance, Doctor doctor) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.customerId = Math.random();
        this.insurance = insurance;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Customer{" + " Legal Name='" + super.getLegalName()
                + " Gender='" + super.getGender()
                + " Date of Birth='" + super.getDateOfBirth()
                + " Phone No='" + super.getPhoneNo()
                + " Address=" + super.getAddress() +
                '}';
    }

    public double getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
