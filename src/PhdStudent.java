public class PhdStudent extends Employee {
    String title = "PhdStudent";

    public PhdStudent(String firstName, String lastName) {

        super(firstName, lastName);
        super.nbrVoucher = 15;
    }
}
