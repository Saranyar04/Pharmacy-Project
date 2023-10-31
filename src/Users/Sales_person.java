package Users;

public class Sales_person extends Employee {
    String emp_id;
    String shift;
    public void addSales_Person(String legal_name, String gender, String date_of_birth, int phone_no, String address, String email, String designation, float Salary, String user_name, String password, String emp_id, String shift) {
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
        this.emp_id = emp_id;
        this.shift = shift;
    }
    public void editSales_Person() {}
    public void deleteSales_Person() {}
}
