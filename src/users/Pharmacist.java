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
        this.pharmaId = PharmaId;
        this.medicalLicenceNo = medicalLicenceNumber;
    }

    public boolean equals(Pharmacist object) {
        if(this.medicalLicenceNo.equals (object.medicalLicenceNo))
            return true;
        else
            return false;
    }

    public int hashCode(String medicalLicenceNo) {
        int i = Integer.parseInt(this.medicalLicenceNo);
        return i;
    }
}
