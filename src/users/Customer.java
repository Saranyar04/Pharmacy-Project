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
    }

    @Override
    public String toString() {
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
    }
}
