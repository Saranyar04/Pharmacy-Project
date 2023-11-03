//package

package users;

public class Users {

    public void addCustomer(String legalName, String gender, String dateOfBirth, int phoneNo, String address, String email, String customerId, String insurance, String doctorName) {
        Customer c1= new Customer ();
        c1.legalName = legalName;
        c1.gender = gender;
        c1.dateOfBirth = dateOfBirth;
        c1.phoneNo = phoneNo;
        c1.address = address;
        c1.email = email;
        c1.customerId = customerId;
        c1.insurance = insurance;
        c1.doctorName = doctorName;
    }

    public void addDoctor(String legalName, String gender, String dateOfBirth, int phoneNo, String address, String email, String doctorType) {

        Doctor d1 = new Doctor ();
        d1.legalName = legalName;
        d1.gender = gender;
        d1.dateOfBirth = dateOfBirth;
        d1.phoneNo = phoneNo;
        d1.address = address;
        d1.email = email;
        d1.doctorType = doctorType;
    }

    public void addPharmacist(String legalName, String gender, String dateOfBirth, int phoneNo, String address, String email, String designation, float salary, String userName, String password, String pharmId, String medicalLicenceNo, String fieldOfStudy) {
        Pharmacist p1 = new Pharmacist ();
        p1.legalName = legalName;
        p1.gender = gender;
        p1.dateOfBirth = dateOfBirth;
        p1.phoneNo = phoneNo;
        p1.address = address;
        p1.email = email;
        p1.designation = designation;
        p1.salary = salary;
        p1.userName = userName;
        p1.password = password;
        p1.pharmId = pharmId;
        p1.medicalLicenceNo = medicalLicenceNo;
        p1.fieldOfStudy = fieldOfStudy;
    }

    public void addSalesPerson(String legalName, String gender, String dateOfBirth, int phoneNo, String address, String email, String designation, float salary, String userName, String password, String empId, String shift) {
        SalesPerson s1 = new SalesPerson ();
        s1.legalName = legalName;
        s1.gender = gender;
        s1.dateOfBirth = dateOfBirth;
        s1.phoneNo = phoneNo;
        s1.address = address;
        s1.email = email;
        s1.designation = designation;
        s1.salary = salary;
        s1.userName = userName;
        s1.password = password;
        s1.empId = empId;
        s1.shift = shift;
    }
}
