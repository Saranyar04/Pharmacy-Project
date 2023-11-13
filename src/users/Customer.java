package users;

import java.util.Date;

public class Customer extends Person {

    private int insuranceType;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, int insuranceType, Doctor doctor) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.insuranceType = insuranceType;
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

    public int getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceName(int insurance) {
        this.insuranceType = insuranceType;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
