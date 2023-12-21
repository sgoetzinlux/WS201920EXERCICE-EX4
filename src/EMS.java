import java.util.ArrayList;
import java.util.Scanner;

public class EMS {
    private ArrayList<String> menuChoices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // **************** payForYourLunch method ******************
    public void payForYourLunch(Employee employee) {
        System.out.println("*********** EMS class Method payForLunch ***********");
        int amountToPay = 0;
        System.out.println("Enter menu choice: (hamburger, schnitzel,lasagne): ");
        String menuChoice = scanner.nextLine();

        if (menuChoices.contains(menuChoice)) {
            switch (menuChoice.toLowerCase()) {
                case "hamburger":
                    amountToPay = 8;
                case "schnitzel":
                    amountToPay = 12;
                case "lasagne":
                    amountToPay = 16;
            }
            // Set employee food instances variable to the menu chosen
            employee.takingFood(menuChoice);

            // Use and decrease the employers vouchers in order to pay the menu chosen
            employee.havingLunch(amountToPay);

        } else System.out.println("Menu choice entered does not exist ... ");
    }

    public static void main(String[] args) {

        // Create some test Employee classes
        Employee employee1 = new Employee("Serge", "Goetzinger", 10);
        PhdStudent student = new PhdStudent("Gilles", "Goetzinger", 15);
        PostDoc postDoc = new PostDoc("Marlon", "Brando", 20);
        Professor professor = new Professor("Francois", "Dubois", 25);

        // Create an EMS class
        EMS ems = new EMS();

        // Populate the menuChoices ArrayList for the menuChoices to make
        ems.menuChoices.add("hamburger");
        ems.menuChoices.add("schnitzel");
        ems.menuChoices.add("lasagne");

        // Test EMS for student
        System.out.println("Test EMS for employee " + student.getFirstName() + " " + student.getLastName() + " (" + student.title + ")");
        ems.payForYourLunch(student);

    }
}
