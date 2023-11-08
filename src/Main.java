import pharmacy.*;
import users.Customer;
import users.Doctor;
import users.Employee;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println(pharmacy.name);

        Doctor doctor = new Doctor("Seegol", "Male", "3/12/1989", "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
        pharmacy.addDoctor(doctor);

        Employee employee = new Employee("Kim", "Female", "04/02/2000", "23498764537", "23 Riverview Dr, New Jersey","kim@gmail.com","pharmacist", 3000, "E784657");
        pharmacy.addEmployee(employee);
        List<Medicine> medicines = new ArrayList<>();
        medicines.add(new Medicine("M34528", "Tylenol", "Generic", "MDC laboratories", "Generic for age 13+", 23));
        medicines.add(new Medicine("M34567", "Paracetamol", "Generic", "TI lab", "for ages 15+", 13));
        Customer customer = new Customer("Lilly", "Female", "04/11/2020", "4132246731", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", "Aetna", doctor);
        pharmacy.addCustomer(customer);

        Prescription prescription = new Prescription(34512, medicines, 2,"Morning and Night after food", doctor, customer);
        pharmacy.addPrescription(prescription);

        Customer scustomer = new Customer("Lilly", "Female", "04/11/2020", "4132458798","23 River Dr, New Jersey", "Lilly@gmail.com", "UHC", doctor);
        Sale sale = new Sale("2346455", medicines, scustomer, employee);
        pharmacy.addSale(sale);
        System.out.println(prescription);
        System.out.println(customer);
        System.out.println(doctor);
        System.out.println(sale);
    }
}


