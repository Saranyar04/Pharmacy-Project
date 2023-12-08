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
import threads.CustomThread;
import threads.RunnableThread;
import threads.SumCallable;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import static enums.InsuranceRate.NO_INSURANCE;
import static enums.InsuranceRate.PLAN_A;
import static util.Printer.print;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy( );
        pharmacy.printInfo( );
        ReentrantLock firstLock = new ReentrantLock();
        ReentrantLock secondLock = new ReentrantLock();
        ReentrantLock thirdLock = new ReentrantLock();

        synchronized (firstLock) {
            ExecutorService executer = Executors.newFixedThreadPool(5);
            for (int i = 1; i <= 7; i++) {
                Runnable runnable = new RunnableThread("Worker Thread : " + i);
                executer.execute(runnable);
            }
            executer.shutdown( );
            while (!executer.isTerminated()) {
            }
        }
        LOGGER.info("Finished all threads");

        synchronized (secondLock) {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (int i = 1; i <= 7; i++) {
                RunnableThread runnableThread = new RunnableThread("Worker Thread : " + i);
                executorService.execute(runnableThread);
            }
            executorService.shutdown( );
            while (!executorService.isTerminated( )) {
            }
        }
        System.out.println("All requests completed successfully.");

        synchronized (thirdLock) {
            ExecutorService executorService1 = Executors.newFixedThreadPool(5);
            List<Future<Integer>> list = new ArrayList<>( );
            for (int i = 0; i < 7; i++) {
                Future<Integer> future = executorService1.submit(new SumCallable(i));
                list.add(future);
            }
            for (Future i : list) {
                try {
                    LOGGER.info(i.get( ));
                } catch (InterruptedException | ExecutionException e) {
                    LOGGER.info(e);
                }
                executorService1.shutdown( );
                while (!executorService1.isTerminated( )) {
                }
            }
        }
            System.out.println("All requests completed successfully.");

            for (int j = 1; j <= 3; j++) {
                CustomThread customThread = new CustomThread();
                customThread.start( );
            }

            try {
                Class<?> pharmacy1 = Class.forName("Pharmacy");
                Constructor<?>[] constructors = pharmacy1.getConstructors( );
                LOGGER.info("Constructors : " + Arrays.toString(constructors));

                Method[] methods = pharmacy1.getMethods( );
                LOGGER.info("Methods : " + Arrays.toString(methods));

                Field[] declaredFields = pharmacy1.getDeclaredFields( );
                LOGGER.info("Fields : " + Arrays.toString(declaredFields));

                try {
                    Doctor doctor = new Doctor("Seegol", "Male", new Date("3/12/1989"), "4132458796", "61 Riverview Ave, New Jersey", "seegol@yahoo.com,", "Surgeon");
                    Method adddoctor = pharmacy1.getDeclaredMethod("addDoctor", Doctor.class);
                    adddoctor.setAccessible(true);
                    adddoctor.invoke(new Pharmacy( ), doctor);

                    Employee employee = new Employee("Kim", "Female", new Date("04/02/2000"), "2349887453", "23 Riverview Dr, New Jersey", "kim@gmail.com", "pharmacist", EmployeeType.PHARMACIST, 3000);
                    Method addemployee = pharmacy1.getDeclaredMethod("addEmployee", Employee.class);
                    addemployee.setAccessible(true);
                    addemployee.invoke(new Pharmacy( ), employee);
                    Employee employeeDelaina = new Employee("Delaina", "Female", new Date("04/05/1990"), "2349887768", "83 Riverview Dr, New Jersey", "delaina@gmail.com", "pharmacist", EmployeeType.PHARMACIST, 3000);
                    addemployee.invoke(new Pharmacy( ), employee);

                    Customer lilly = new Customer("Lilly", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", NO_INSURANCE, doctor);
                    Method addcustomer = pharmacy1.getDeclaredMethod("addCustomer", Customer.class);
                    addcustomer.setAccessible(true);
                    addcustomer.invoke(new Pharmacy( ), lilly);
                    Customer lilyana = new Customer("Lilyana", "Female", new Date("04/11/2020"), "4132246155", "23 Riviera Dr, Main St, NewJersey", "lilly@gmail.com", PLAN_A, doctor);
                    addcustomer.invoke(new Pharmacy( ), lilyana);

                    Medicine medicine = new Medicine("M453456", "Paracetamol", MedicineType.OVER_THE_COUNTER, CompanyName.PNC_PHARMACY, "Pain reliever", 12.30);
                    Method addmedicine = pharmacy1.getDeclaredMethod("addMedicine", Medicine.class);
                    addmedicine.setAccessible(true);
                    addmedicine.invoke(new Pharmacy( ), medicine);
                    CustomLinkedList<Medicine> customLinkedList = new CustomLinkedList<>( );
                    customLinkedList.add(medicine);
                    customLinkedList.print( );

                    List<Medicine> medicines = new ArrayList<>( );
                    medicines.add(new Medicine("M34528", "Tylenol", MedicineType.PRESCRIPTION, CompanyName.MDC_LABORATORIES, "Generic for age 13+", 23));
                    medicines.add(new Medicine("M34567", "Paracetamol", MedicineType.OVER_THE_COUNTER, CompanyName.TI_LAB, "for ages 15+", 13));

                    Prescription lillyreceipt = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, lilly);
                    pharmacy.addPrescription(lillyreceipt);
                    Prescription lilyanareceipt = new Prescription(34512, medicines, 2, "Morning and Night after food", doctor, lilyana);
                    pharmacy.addPrescription(lilyanareceipt);

                    pharmacy.calculateSale(employee, lilly, medicines);
                    pharmacy.calculateSale(employeeDelaina, lilyana, medicines);
                    pharmacy.printPersonMap( );
                    pharmacy.printPrescriptionQueue( );
                    print(doctor);
                    pharmacy.printReceipts( );
                    pharmacy.getCustomerReceipts("Lilly");
                    pharmacy.viewCompanyMedicineList( );
                    pharmacy.viewMedicineNames( );
                    pharmacy.printSaleEmployeeList( );
                    pharmacy.printSortedReceiptTotal( );
                } catch (InvalidPriceException | InvalidMedicineListException |
                         InvalidLegalNameException | InvalidPhoneNoException |
                         NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    LOGGER.error(e);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            UniqueWordReader uniqueWordReader = new UniqueWordReader( );
            uniqueWordReader.countUniqueWords("pharmacy.txt");
        }
    }





