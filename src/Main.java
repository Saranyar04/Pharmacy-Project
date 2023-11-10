import pharmacy.*;
import users.Customer;
import users.Doctor;
import users.Employee;
import java.util.*;
import java.util.Date;

public class Main {

    public static void main (String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println(pharmacy.getPharmacyName());

        Doctor doctor = new Doctor("Seegol", "Male", new Date("3/12/1989"), "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
        pharmacy.addDoctor(doctor);

        Employee employee = new Employee("Kim", "Female", new Date("04/02/2000"), "23498764537", "23 Riverview Dr, New Jersey","kim@gmail.com","pharmacist", 3000);
        pharmacy.addEmployee(employee);
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("M34528", "Tylenol", "Generic", "MDC laboratories", "Generic for age 13+", 23));
        medicines.add(new Medicine("M34567", "Paracetamol", "Generic", "TI lab", "for ages 15+", 13));
        Customer firstCustomer = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246731", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", "YES", doctor);
        pharmacy.addCustomer(firstCustomer);

        Prescription prescription = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, firstCustomer);
        pharmacy.addPrescription(prescription);

        Customer  secondCustomer = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132458798","23 River Dr, New Jersey", "Lilly@gmail.com", "NO", doctor);

        pharmacy.calculateSale(employee, firstCustomer, medicines);
        pharmacy.calculateSale(employee, secondCustomer, medicines);
        System.out.println(prescription);
        System.out.println(firstCustomer);
        System.out.println(doctor);
        System.out.println(pharmacy.getReceipts());
    }
}


