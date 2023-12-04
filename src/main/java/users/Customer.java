package users;

import exceptions.InvalidLegalNameException;
import exceptions.InvalidPhoneNoException;
import enums.InsuranceRate;

import java.util.Date;

public class Customer extends Person {

    private InsuranceRate rate;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, InsuranceRate rate, Doctor doctor) throws InvalidLegalNameException, InvalidPhoneNoException {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.rate = rate;
        this.doctor = doctor;
    }

    public InsuranceRate getInsuranceRate() {
        return rate;
    }

    public void setInsuranceRate(InsuranceRate rate) {
        this.rate = rate;
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
