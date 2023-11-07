import pharmacy.*;
import users.Customer;
import users.Doctor;
import users.Pharmacist;
import users.SalesPerson;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        Pharmacy p1 = new Pharmacy();
        OverTheCounter overTheCounter = new OverTheCounter("Tylenol", "generic", "MCD laboratories", "Generic for age 13+", 23.33, "TY0123", "For common cold");
        p1.addOtc(overTheCounter);

        List<Medicine> medicines = new ArrayList<Medicine>();
        medicines.add(new Medicine("Tylenol", "Generic", "MDC laboratories", "Generic foe age 13+", 23));
        medicines.add(new Medicine("Paracetamol", "Generic", "TI lab", "for ages 15+", 13));
        Customer c1 = new Customer ("Lilly","Female", "04/11/2020", "4132246731", "23 Rivera Dr, Main St, NewJersey", "lilly@gmail.com", "C56738", "Aetna", "Seegol");
        Doctor d1 = new Doctor("Seegol", "Male", "3/12/1989", "4132458798", "61 Riverview Ave, New Jersy", "Seegol@yahoo.com", "Surgeon");
        Prescription prescription = new Prescription(34512, medicines, 2,"Morning and Night after food", d1, c1);
        p1.addPrescription(prescription);

        List<Medicine> med = new ArrayList<Medicine>();
        med.add(new Medicine("Pantoprazole", "Prescription", "MDC laboratories", "Fixes digestive issues", 33));
        med.add(new Medicine("Mortrin", "Generic", "MDC laboratories", "Anti-inflammatory drug", 20));
        Customer cust = new Customer("Lilly", "Female", "04/11/2020", "4132458798","23 River Dr, New Jersey", "Lilly@gmail.com", "C56738", "Aetna", "Seegol");
        SalesPerson sPerson = new SalesPerson("Johnny","Female","11/07/2023", "4132456789", "45 Trients Rd, New Jersey", "Johny@gmail.com", "Associate", 3000, "Emp54637", "Morning");
        Sale sale = new Sale("23464", "11/04/2023", med, cust, sPerson, 53,23, 30);
        PrescriptionDrug prescriptionDrug = new PrescriptionDrug ("Oxycodine", "Pain Relever", "TB Technologies", "Sevier pain relief", 33.3, "MD2234", "Morning and Night after food", "Should not be had without food");
        p1.addPrescriptionDrug (prescriptionDrug);

        Customer customer = new Customer("Lilly", "Female", "04/11/2020", "4132246731", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", "C56738", "Aetna", "Seegol");
        p1.addCustomer(customer);

        Doctor doctor = new Doctor("Seegol", "Male", "3/12/1989", "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
        p1.addDoctor(doctor);

        Pharmacist pharmacist = new Pharmacist("Karla", "Female", "03/21/2000", "3127658798","31 Riverview Dr, New Jersey", "karla@yahoo.com", "Senior Pharmacist", 4000, "P2234","23453");
        p1.addPharmacist(pharmacist);

        SalesPerson salesPerson = new SalesPerson("Dominique", "Female", "04/12/2000", "3123457689", "55 Portofino Dr, New Jersey", "dom@yahoo.com", "Associate", 3000, "E3456", "Morning");
        p1.addSalesPerson(salesPerson);
        System.out.println(customer);
        System.out.println(doctor);
    }
}


