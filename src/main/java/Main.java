import customlinkedlist.CustomLinkedList;
import enums.CompanyName;
import enums.EmployeeType;
import enums.MedicineType;
import exceptions.InvalidLegalNameException;
import exceptions.InvalidMedicineListException;
import exceptions.InvalidPhoneNoException;
import exceptions.InvalidPriceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pharmacy.Medicine;
import pharmacy.Prescription;
import uniquewords.UniqueWordReader;
import users.Customer;
import users.Doctor;
import users.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
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
            Class<?> pharmacy1 = Class.forName("Pharmacy");
            Constructor<?>[] constructors = pharmacy1.getConstructors();
            LOGGER.info("Constructors : " + Arrays.toString(constructors));

            Method[] methods = pharmacy1.getMethods();
            LOGGER.info("Methods : " + Arrays.toString(methods));

            Field[] declaredFields = pharmacy1.getDeclaredFields();
            LOGGER.info("Fields : " + Arrays.toString(declaredFields));

            try {
                Doctor doctor = new Doctor("Seegol", "Male", new Date("3/12/1989"), "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
                Method adddoctor = pharmacy1.getDeclaredMethod("addDoctor", Doctor.class);
                adddoctor.setAccessible(true);
                adddoctor.invoke(new Pharmacy(), doctor);

                Employee employee = new Employee("Kim", "Female", new Date("04/02/2000"), "2349887453", "23 Riverview Dr, New Jersey", "kim@gmail.com", "pharmacist", EmployeeType.PHARMACIST, 3000);
                Method addemployee = pharmacy1.getDeclaredMethod("addEmployee", Employee.class);
                addemployee.setAccessible(true);
                addemployee.invoke(new Pharmacy(), employee);

                Customer lilly = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", NO_INSURANCE, doctor);
                Method addcustomer = pharmacy1.getDeclaredMethod("addCustomer", Customer.class);
                addcustomer.setAccessible(true);
                addcustomer.invoke(new Pharmacy(), lilly);
                Customer lilyana = new Customer("Lilyana", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", PLAN_A, doctor);
                addcustomer.invoke(new Pharmacy(), lilyana);

                Medicine medicine = new Medicine("M453456", "Paracetamol", MedicineType.OVER_THE_COUNTER, CompanyName.PNCPHARMACY, "Pain reliever", 12.30);
                Method addmedicine = pharmacy1.getDeclaredMethod("addMedicine", Medicine.class);
                addmedicine.setAccessible(true);
                addmedicine.invoke(new Pharmacy(), medicine);
                CustomLinkedList<Medicine> customLinkedList = new CustomLinkedList<>( );
                customLinkedList.add(medicine);
                customLinkedList.print( );

                List<Medicine> medicines = new ArrayList<>( );
                medicines.add(new Medicine("M34528", "Tylenol", MedicineType.PRESCRIPTION, CompanyName.MDCLABORATORIES, "Generic for age 13+", 23));
                medicines.add(new Medicine("M34567", "Paracetamol", MedicineType.OVER_THE_COUNTER, CompanyName.TILAB, "for ages 15+", 13));

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
                pharmacy.getCompanyMedicineList();
                pharmacy.getMedicineNames();
            } catch (InvalidPriceException | InvalidMedicineListException |
                     InvalidLegalNameException | InvalidPhoneNoException |
                     NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                LOGGER.error(e);

                UniqueWordReader uniqueWordReader = new UniqueWordReader();
                uniqueWordReader.countUniqueWords("pharmacy.txt");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


