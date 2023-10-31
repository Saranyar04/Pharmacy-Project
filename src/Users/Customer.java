package Users;

public class Customer extends Person{
    String customer_id;
    String insurance;
    String doctor_name;
    public void addCustomer(String legal_name, String gender, String date_of_birth, int phone_no, String address, String email_id, String customer_id, String insurance, String doctor_name) {
        this.legal_name = legal_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.phone_no = phone_no;
        this.address = address;
        this.email = email;
        this.customer_id = customer_id;
        this.insurance = insurance;
        this.doctor_name = doctor_name;
    }
    public void editPerson(){}
    public void deletePerson(){}
}
