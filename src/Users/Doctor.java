//package

package users;

public class Doctor extends Person {

    String doctorType;
    public Doctor(String legalName, String gender, String dateOfBirth, String phoneNo, String address, String email, String doctorType) {
        this.legalName = legalName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
        this.doctorType = doctorType;
    }

    public String getLegalName(){
        return legalName;
    }

    public String getGender(){
        return gender;
    }

    public String getdateOfBirth(){
        return dateOfBirth;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public String getaddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getDoctorType(){
            return doctorType;
        }

        @Override
        public String toString() {
            return "Doctor " +
                    "Name : " + getLegalName ( ) + '\'' +
                    ", Gender : " + getGender ( ) + '\'' +
                    ", Date of Birth : " + getdateOfBirth ( ) + '\'' +
                    ", Phone No : " + getPhoneNo ( ) +
                    ", Address : " + getaddress ( ) + '\'' +
                    ", Email : " + getEmail ( ) +
                    ", Type : " + getDoctorType ( );
        }
}