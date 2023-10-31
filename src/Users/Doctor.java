package Users;

public class Doctor extends Person{
    String doctor_type;
    public void addDoctor(String legal_name, String gender, String date_of_birth, int phone_no, String address, String email, String doctor_type) {
        this.legal_name = legal_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.phone_no = phone_no;
        this.address = address;
        this.email = email;
        this.doctor_type = doctor_type;
    }
    public void editDoctor(){}
    public void deleteDoctor(){}
}
