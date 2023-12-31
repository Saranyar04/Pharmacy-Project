package users;

import exceptions.InvalidLegalNameException;
import exceptions.InvalidPhoneNoException;

import java.util.Date;
import java.util.UUID;

abstract public class Person {

    private String personId;
    private String legalName;
    private String gender;
    private Date dateOfBirth;
    private String phoneNo;
    private String address;
    private String email;

    public Person(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email) throws InvalidLegalNameException, InvalidPhoneNoException {
        if (legalName.length() > 50) {
            throw new InvalidLegalNameException("Legal Name should be less than 50 characters.");
        }
        if (phoneNo.length() != 10) {
            throw new InvalidPhoneNoException("Phone number should be of ten numbers.");
        }
        this.personId = UUID.randomUUID().toString();
        this.legalName = legalName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
