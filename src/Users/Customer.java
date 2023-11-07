package users;

public class Customer extends Person {

    private String customerId;
    private String insurance;
    private String doctorName;
    public Customer(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String customerId, String insurance, String doctorName) {
        super(legalName, gender, dateOfBirth, phoneNo, address, email);
        this.customerId = customerId;
        this.insurance = insurance;
        this.doctorName = doctorName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString () {
        return "Customer{" + "Legal Name='" + super.getLegalName()
                + "Gender='" + super.getGender()
                + "Date of Birth='" + super.getDateOfBirth()
                + "Phone No='" + super.getPhoneNo()
                + "Address=" + super.getAddress() +
                "customerId='" + customerId + '\'' +
                ", insurance='" + insurance + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
