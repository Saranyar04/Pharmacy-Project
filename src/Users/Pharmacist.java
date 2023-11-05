package users;

public class Pharmacist extends Employee {

    public String pharmaId;
    public String medicalLicenceNo;

    public Pharmacist(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String userName, String password, String medicalLicenceNumber, String PharmaId) {
        this.legalName = legalName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
        this.userName = userName;
        this.password = password;
        this.pharmaId = pharmaId;
        this.medicalLicenceNo = medicalLicenceNumber;
    }
}
