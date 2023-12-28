public class Professor extends Employee {

   public Professor(String firstName, String lastName) {
        super(firstName, lastName);
        super.nbrVoucher = 25;
        super.title = "Professor";
    }
}
