public class PhdStudent extends Employee {
    String title = "PhdStudent";
    int nbrVoucher;
    public PhdStudent(String firstName, String lastName) {

        super(firstName, lastName);
        super.nbrVoucher = 15;
    }
}
