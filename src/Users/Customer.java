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
}
