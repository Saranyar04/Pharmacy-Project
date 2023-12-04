import customlinkedlist.CustomLinkedList;
import exceptions.InvalidLegalNameException;
import exceptions.InvalidMedicineListException;
import exceptions.InvalidPhoneNoException;
import exceptions.InvalidPriceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.Medicine;
import enums.MedicineType;
import pharmacy.Prescription;
import uniquewords.UniqueWordReader;
import users.Customer;
import users.Doctor;
import users.Employee;
import enums.EmployeeType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static enums.InsuranceRate.NO_INSURANCE;
import static enums.InsuranceRate.PLAN_A;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.printInfo();

        try {
            Doctor doctor = new Doctor("Seegol", "Male", new Date("3/12/1989"), "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
            pharmacy.addDoctor(doctor);

            Employee employee = new Employee("Kim", "Female", new Date("04/02/2000"), "2349887453", "23 Riverview Dr, New Jersey", "kim@gmail.com", "pharmacist", EmployeeType.PHARMACIST, 3000);
            pharmacy.addEmployee(employee);

            Customer lilly = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", NO_INSURANCE, doctor);
            pharmacy.addCustomer(lilly);
            Customer lilyana = new Customer("Lilyana", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", PLAN_A, doctor);
            pharmacy.addCustomer(lilyana);

            Medicine medicine = new Medicine("M453456", "Paracetamol", MedicineType.OVER_THE_COUNTER, "PNC Pharmacy", "Pain reliever", 12.30);
            CustomLinkedList<Medicine> customLinkedList = new CustomLinkedList<>();
            customLinkedList.add(medicine);
            customLinkedList.print();

            List<Medicine> medicines = new ArrayList<>();
            medicines.add(new Medicine("M34528", "Tylenol", MedicineType.PRESCRIPTION, "MDC laboratories", "Generic for age 13+", 23));
            medicines.add(new Medicine("M34567", "Paracetamol", MedicineType.OVER_THE_COUNTER, "TI lab", "for ages 15+", 13));

            Prescription lillyreceipt = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, lilly);
            pharmacy.addPrescription(lillyreceipt);
            Prescription lilyanareceipt = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, lilyana);
            pharmacy.addPrescription(lilyanareceipt);

            pharmacy.calculateSale(employee, lilly, medicines);
            pharmacy.calculateSale(employee, lilyana, medicines);
            pharmacy.printPersonMap();
            pharmacy.printPrescriptionQueue();
            LOGGER.info(doctor);
            pharmacy.printReceipts();
            pharmacy.getCustomerReceipts("Lilly");
        } catch (InvalidPriceException | InvalidMedicineListException |
                 InvalidLegalNameException | InvalidPhoneNoException e) {
            LOGGER.error(e);
        }
        UniqueWordReader uniqueWordReader = new UniqueWordReader();
        uniqueWordReader.countUniqueWords("pharmacy.txt");
    }
}


