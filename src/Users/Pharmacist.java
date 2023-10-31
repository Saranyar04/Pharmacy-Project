package Users;

public class Pharmacist extends Employee{
    String pharm_id;
    String medical_licence_no;
    String field_of_study;
    public void addPharmacist(String legal_name, String gender, String date_of_birth, int phone_no, String address, String email, String designation, float Salary, String user_name, String password, String pharm_id, String medical_licence_no, String field_of_study) {
        this.legal_name = legal_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.phone_no = phone_no;
        this.address = address;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
        this.user_name = user_name;
        this.password = password;
        this.pharm_id = pharm_id;
        this.medical_licence_no = medical_licence_no;
        this.field_of_study = field_of_study;
    }
    public void editPharmacist() {}
    public void deletePharmacist() {}
}
