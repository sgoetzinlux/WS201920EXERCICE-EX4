public class Employee {
    private String firstName;
    private String lastName;

    private int nbrVoucher;

    String food;

    public Employee(String firstName, String lastName, int nbrVoucher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nbrVoucher = nbrVoucher;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNbrVoucher() {
        return nbrVoucher;
    }

    public void setNbrVoucher(int nbrVoucher) {
        this.nbrVoucher = nbrVoucher;
    }

    public void takingFood(String menuChoice) {
        menuChoice = menuChoice.toLowerCase();
        switch (menuChoice) {
            case "hamburger":
                food = "hamburger";
            case "schnitzel":
                food = "schnitzel";
            case "lasagna":
                food = "lasagna";
        }
        System.out.println("******* Employee Class Method takingFood ********");
        System.out.println("Instance variable <food> set to : " + menuChoice);

    }

    public void havingLunch(int lunchBill) {
        int nbrOfVoucherNeeded = lunchBill/4;
        System.out.println("*********** Employee class Method having Lunch ***********");
        System.out.println("Amount to pay : " +  lunchBill);
        System.out.println("Number of voucher needed : " + nbrOfVoucherNeeded);
        System.out.println("Old voucher counter : " + getNbrVoucher());

        if (nbrOfVoucherNeeded > 0) {
            setNbrVoucher(getNbrVoucher() - nbrOfVoucherNeeded);
            System.out.println("New voucher counter : " + getNbrVoucher());
        }
        else System.out.println("Not enough vouchers to pay bill ! ");
    }
}
