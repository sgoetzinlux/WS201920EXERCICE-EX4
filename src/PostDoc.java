public class PostDoc extends Employee {


    public PostDoc(String firstName, String lastName) {
        super(firstName, lastName);
        super.nbrVoucher = 20;
        super.title = "PostDoc";
    }
}
