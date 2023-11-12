<<<<<<< HEAD
package users;

import java.util.Date;

public class Customer extends Person {

    private String insurance;
    private Doctor doctor;

    public Customer(String legalName, String gender, Date dateOfBirth, String phoneNo, String address, String email, String insurance, Doctor doctor) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.insurance = insurance;
        this.doctor = doctor;
=======
//package

package users;

public class Customer extends Person {

    String customerId;
    String insurance;
    String doctorName;

    public Customer(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String customerId, String insurance, String doctorName) {
        this.legalName = legalName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
        this.customerId = customerId;
        this.insurance = insurance;
        this.doctorName = doctorName;
>>>>>>> main
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Customer{" + "Person ID=" + super.getPersonId() +  " Legal Name='" + super.getLegalName()
                + " Gender='" + super.getGender()
                + " Date of Birth='" + super.getDateOfBirth()
                + " Phone No='" + super.getPhoneNo()
                + " Address=" + super.getAddress() +
                '}';
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
=======
        return "Doctor " +
                "Name : " + this.legalName +
                ", Gender : " + this.gender +
                ", Date of Birth : " + this.dateOfBirth +
                ", Phone No : " + this.phoneNo +
                ", Address : " + this.address +
                ", Email : " + this.email +
                ", Customer Id : " + this.customerId +
                ", Insurance : " + this.insurance +
                ", Doctor Name : " + this.doctorName;
>>>>>>> main
    }
}
