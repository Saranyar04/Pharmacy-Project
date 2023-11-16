import exceptions.*;
import interfaces.IInsuranceRate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.Medicine;
import pharmacy.Prescription;
import users.Customer;
import users.Doctor;
import users.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {

            Pharmacy pharmacy = new Pharmacy();
            System.out.println(pharmacy.getPharmacyName());
            Doctor doctor;
            Employee employee;
            Customer customer;

            try {
                doctor = new Doctor("Seegol", "Male", new Date("3/12/1989"), "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
                pharmacy.addDoctor(doctor);

                employee = new Employee("Kim", "Female", new Date("04/02/2000"), "2349887453", "23 Riverview Dr, New Jersey", "kim@gmail.com", "pharmacist", 3000);
                pharmacy.addEmployee(employee);

                customer = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", IInsuranceRate.PLAN_A, doctor);
                pharmacy.addCustomer(customer);

            Medicine medicine = new Medicine("M453456", "Paracetamol", "Generic", "PNC Pharmacy", "Pain reliever", 12.30);
            pharmacy.addMedicine(medicine);

            List<Medicine> medicines = new ArrayList<>();
            medicines.add(new Medicine("M34528", "Tylenol", "Generic", "MDC laboratories", "Generic for age 13+", 23));
            medicines.add(new Medicine("M34567", "Paracetamol", "Generic", "TI lab", "for ages 15+", 13));

            Prescription prescription = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, customer);
            pharmacy.addPrescription(prescription);

            pharmacy.calculateSale(employee, customer, medicines);
            LOGGER.info(pharmacy.getReceipts());
                LOGGER.info(prescription);
                LOGGER.info(prescription);
                LOGGER.info(doctor);
            } catch (InvalidPriceException | InvalidMedicineListException | InvalidInsuranceRateException | InvalidLegalNameException | InvalidPhoneNoException e) {
            LOGGER.error(e);
        }

    }
}


