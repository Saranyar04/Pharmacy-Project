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

        Medicine medicine = new Medicine("M453456", "Paracetamol", "Generic", "PNC Pharmacy", "Pain reliever", 12.30);
        pharmacy.addMedicine(medicine);

        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("M34528", "Tylenol", "Generic", "MDC laboratories", "Generic for age 13+", 23));
        medicines.add(new Medicine("M34567", "Paracetamol", "Generic", "TI lab", "for ages 15+", 13));
        Customer customer = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246731", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", "PLAN_A" , doctor);
        pharmacy.addCustomer(customer);

        Prescription prescription = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, customer);
        pharmacy.addPrescription(prescription);

        pharmacy.calculateSale(employee, customer, medicines);
        System.out.println(prescription);
        System.out.println(doctor);
        System.out.println(pharmacy.getReceipts());
    }
}


