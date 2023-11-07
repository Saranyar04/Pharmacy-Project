package users;

public class Pharmacist extends Employee {

    private String medicalLicenceNo;

    public Pharmacist(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String designation, float salary, String employeeId, String medicalLicenceNo) {
        super (legalName, gender, dateOfBirth, phoneNo, address, email, designation, salary, employeeId);
        this.medicalLicenceNo = medicalLicenceNo;
    }

    public String getMedicalLicenceNo() {
        return medicalLicenceNo;
    }
}
