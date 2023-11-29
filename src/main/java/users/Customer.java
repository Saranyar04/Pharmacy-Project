package users;

import exceptions.InvalidLegalNameException;
import exceptions.InvalidPhoneNoException;

import java.util.Date;

public class Customer extends Person {

    private int insuranceRate;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, int insuranceRate, Doctor doctor) throws InvalidLegalNameException, InvalidPhoneNoException {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.insuranceRate = insuranceRate;
        this.doctor = doctor;
    }

    public int getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(int insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Customer{" + "Person ID=" + super.getPersonId() +  " Legal Name='" + super.getLegalName()
                + " Gender='" + super.getGender()
                + " Date of Birth='" + super.getDateOfBirth()
                + " Phone No='" + super.getPhoneNo()
                + " Address=" + super.getAddress() +
                '}';
    }
}
