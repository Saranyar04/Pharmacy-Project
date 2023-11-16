package users;

import exceptions.InvalidLegalNameException;
import exceptions.InvalidPhoneNoException;

import java.util.Date;

public class Doctor extends Person {

    private String doctorType;

    public Doctor(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String doctorType) throws InvalidLegalNameException, InvalidPhoneNoException {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.doctorType = doctorType;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    @Override
    public String toString() {
        return "Doctor{" + "Legal Name='" + super.getLegalName()
                + "Gender='" + super.getGender()
                + "Date of Birth='" + super.getDateOfBirth()
                + "Phone No='" + super.getPhoneNo()
                + "Address=" + super.getAddress() +
                "doctorType='" + doctorType +
                '}';
    }
}