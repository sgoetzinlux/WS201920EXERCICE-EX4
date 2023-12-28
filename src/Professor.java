public class Professor extends Employee {

   String title = "Professor";
    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
        super.nbrVoucher = 25;
    }
}
