package users;

import java.util.Date;

public class Customer extends Person {

    private int insurance;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, int insurance, Doctor doctor) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.insurance = insurance;
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

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
