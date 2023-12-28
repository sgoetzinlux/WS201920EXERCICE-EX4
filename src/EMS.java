import java.util.ArrayList;
import java.util.Scanner;

public class EMS {
    private ArrayList<String> menuChoices = new ArrayList<>();
    final int priceHamburger = 8;
    final int priceSchnitzel = 12;
    final int priceLasagne = 16;


    // **************** payForYourLunch method ******************
    public void payForYourLunch(Employee employee) {

        // Create scanner object for input data
        Scanner scanner = new Scanner(System.in);

        // Create variables
        int amountToPay = 0;

        // Display Menu
        System.out.println("*********** EMS class Method payForLunch ***********");
        System.out.println("--- M E N U   C H O I C E ----");
        System.out.println("Choose <1> for <lasagne> ");
        System.out.println("Choose <2> for <schnitzel> ");
        System.out.println("Choose <3> for <lasagne> ");
        System.out.print("Enter your choice : ");
        int menuChoice = scanner.nextInt();

        if (menuChoice > 0 && menuChoice < 4) {
            switch (menuChoice) {
                case 1:
                    amountToPay = priceHamburger;
                    employee.takingFood("hamburger");
                    break;
                case 2:
                    amountToPay = priceSchnitzel;
                    employee.takingFood("schnitzel");
                    break;
                case 3:
                    amountToPay = priceLasagne;
                    employee.takingFood("lasagne");
                    break;
            }

            // Decrease the employers vouchers in order to pay the menu chosen
            employee.havingLunch(amountToPay);

        } else System.out.println("Menu choice <" + menuChoice + "> does not exist  !!! ");
    }
    public static void main(String[] args) {

        // Create scanner object for input data
        Scanner scanner = new Scanner(System.in);

        // Create some test Employee classes
        Employee employee1 = new Employee("Serge", "Goetzinger");
        PhdStudent student = new PhdStudent("Gilles", "Goetzinger");
        PostDoc postDoc = new PostDoc("Marlon", "Brando");
        Professor professor = new Professor("Francois", "Dubois");

        // Create an EMS class
        EMS ems = new EMS();

        // Populate the menuChoices ArrayList for the menuChoices to make
        ems.menuChoices.add("hamburger");
        ems.menuChoices.add("schnitzel");
        ems.menuChoices.add("lasagne");
        while (true) {
            System.out.println("********************************* ");
            System.out.println("Choose Employee to test: ");
            System.out.println("Choose <1> for Student ");
            System.out.println("Choose <2> for PostDoc ");
            System.out.println("Choose <3> for Professor ");
            System.out.println("Choose <4> to exit EMS system ... ");
            System.out.print("Enter your choice : ");

            int titleChoice = scanner.nextInt();

            if (titleChoice > 0 && titleChoice < 6) {
                switch (titleChoice) {
                    case 1:
                        // Test EMS for student
                        System.out.println("Test EMS for employee " + employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.title + ")");
                        ems.payForYourLunch(employee1);
                    case 2:
                        // Test EMS for student
                        System.out.println("Test EMS for employee " + student.getFirstName() + " " + student.getLastName() + " (" + student.title + ")");
                        ems.payForYourLunch(student);
                        break;
                    case 3:
                        // Test for PostDoc
                        System.out.println("Test EMS for employee " + postDoc.getFirstName() + " " + postDoc.getLastName() + " (" + postDoc.title + ")");
                        ems.payForYourLunch(postDoc);
                        break;
                    case 4:
                        // Test for PostDoc
                        System.out.println("Test EMS for employee " + professor.getFirstName() + " " + professor.getLastName() + " (" + professor.title + ")");
                        ems.payForYourLunch(professor);
                        break;
                    case 5:
                        System.out.println("Exiting Employee Management System. Goodbye!");
                        System.exit(0);
                }

            } else System.out.println("Option  <" + titleChoice + "> does not exist ... ");
        }
    }
}
