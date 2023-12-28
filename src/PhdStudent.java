public class PhdStudent extends Employee {
    public PhdStudent(String firstName, String lastName) {

        super(firstName, lastName);
        super.nbrVoucher = 15;
        super.title = "PhdStudent";
    }
}
