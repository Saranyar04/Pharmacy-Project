package users;

import java.util.Date;

public class Customer extends Person {

    private int insuranceName;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, int insuranceName, Doctor doctor) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.insuranceName = insuranceName;
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

    public int getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(int insurance) {
        this.insuranceName = insuranceName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
