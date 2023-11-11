
import users.Customer;
import users.Doctor;
import users.Pharmacist;
import users.SalesPerson;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {

        Scanner myobj = new Scanner(System.in);
        System.out.println("Select an option :");
        System.out.println("1.Add Over the counter med.");
        System.out.println("2.Add Prescription Drug.");
        System.out.println( "3.Add a Sale." );
        Pharmacy p1 = new Pharmacy();
        int i = myobj.nextInt();

        if (i==1) {
                System.out.println ("Enter Medicine Name : ");
                myobj.nextLine ();
                String medName = myobj.nextLine ();
                System.out.println("Enter Medicine Type : ");
                String medType = myobj.nextLine ( );
                System.out.println("Enter Company : ");
                String medCompany = myobj.nextLine ( );
                System.out.println("Enter Medicine Description : ");
                String medDescription = myobj.nextLine ( );
                System.out.println("Enter Medicine Price : ");
                float medPrice = myobj.nextFloat ( );
                myobj.nextLine ();
                System.out.println("Enter Medicine ID : ");
                String otcId = myobj.nextLine ( );
                System.out.println("Enter Medicine Uses : ");
                String uses = myobj.nextLine ( );
                p1.addOtc(medName, medType, medCompany, medDescription, medPrice, otcId, uses);
                System.out.println("Over the counter med Successfully added.");
            }
            else if(i==2){
                System.out.println("Enter Medicine Name : ");
                myobj.nextLine();
                String medName = myobj.nextLine( );
                System.out.println("Enter Medicine Type : ");
                String medType = myobj.nextLine( );
                System.out.println("Enter Company : ");
                String medCompany = myobj.nextLine( );
                System.out.println("Enter Medicine Description : ");
                String medDescription = myobj.nextLine ( );
                System.out.println("Enter Medicine Price : ");
                float medPrice =myobj.nextFloat ( );
                myobj.nextLine();
                System.out.println("Enter Medicine ID : ");
                String medId = myobj.nextLine ( );
                System.out.println("Enter Medicine dosage : ");
                String dosage = myobj.nextLine ( );
                System.out.println("Enter Special Instructions : ");
                String specialInstruction = myobj.nextLine ( );
                p1.addPrescriptiondrug(medName, medType, medCompany, medDescription, medPrice, medId, dosage, specialInstruction);
                System.out.println("Prescription Drug Successfully added.");
            }
            else if(i==3) {
            System.out.println("Enter Receipt Number : ");
            myobj.nextLine ();
            String receiptNumber = myobj.nextLine ( );
            System.out.println("Enter Receipt Date : ");
            String receiptDate = myobj.nextLine ( );
            System.out.println("Enter the number of medication");
            int t = Integer.parseInt (myobj.nextLine ());
            System.out.println( "Enter the list of medication :" );
            String[] temp = new String[10];
            for (int j = 1; j<=t ; j++) {
                temp = new String[]{myobj.nextLine ( )};
            }
            System.out.println("Enter Customer Name :");
            String cName = myobj.nextLine ();
            System.out.println( "Enter Sales Person Name :" );
            String sName = myobj.nextLine ();
            System.out.println("Enter Receipt Total : ");
            float receiptTotal = myobj.nextFloat();
            System.out.println("Enter Insurance Pays : ");
            myobj.nextLine();
            float insurancePays = myobj.nextFloat();
            System.out.println("Enter CustomerOwes : ");
            myobj.nextLine();
            float customerOwes = myobj.nextFloat();
            p1.addSales(receiptNumber, receiptDate, temp, cName, sName, receiptTotal, insurancePays, customerOwes);
            System.out.println("New Sales added successfully.");
            }
            else {
            System.out.println("Enter 1, 2 or 3.");
        }
        Customer shawn = new Customer("Shawn Sure","Male", "02/02/1999", "31290567466","54 Trainervil, New Jersey", "shawn@gmail.com", "TS23412", "Aetna", "John Seegol" );
        Doctor John = new Doctor("John Seegol", "Male", "12/3/1988", "41334587625", "350 Griffin Rd, NewJersey", "seegol@gmail.com", "Surgeon");
        SalesPerson Karla = new SalesPerson("Karla Campbell", "Female", "12/03/1999", "44387962345", "789 Park Streer, New Jersey", "Karla@gmail.com", "Senior Associate", 3500, "Karla04", "Password123!", "Emp23415", "Morning");
        Pharmacist Alex = new Pharmacist("Alex Jurado", "Male", "02/03/1995", "86078933456", "456 RiverRd, New Jersey", "Alex@gmail.com", "Senior Pharm", 5000,"Alex04", "Alexpass123!", "id234th57", "Ph234976");
        System.out.println(John);
        System.out.println(shawn);
    }
}


