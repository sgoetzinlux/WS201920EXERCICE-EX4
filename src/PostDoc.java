public class PostDoc extends Employee {

    String title = "PostDoc";
    public PostDoc(String firstName, String lastName) {
        super(firstName, lastName);
        super.nbrVoucher = 20;
    }
}
