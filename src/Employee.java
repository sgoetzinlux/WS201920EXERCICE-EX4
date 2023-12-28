public class Employee {
    private String firstName;
    private String lastName;

    String title = "Employee";

     int nbrVoucher = 10;

    private String food;

    final int voucherValue = 4;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public void setFood(String food) {
        this.food = food;
    }

    public void takingFood(String menuChoice) {
        menuChoice = menuChoice.toLowerCase();
        switch (menuChoice) {
            case "hamburger":
                setFood("hamburger");
            case "schnitzel":
                setFood("schnitzel");
            case "lasagna":
                setFood("lasagna");
        }
        System.out.println("******* Employee Class Method takingFood ********");
        System.out.println("Instance variable <food> set to : " + menuChoice);

    }

    public void havingLunch(int lunchBill) {
        int nbrOfVoucherNeeded = lunchBill / voucherValue;
        System.out.println("*********** Employee class Method having Lunch ***********");
        System.out.println("Amount to pay : " + lunchBill);
        System.out.println("Number of voucher needed : " + nbrOfVoucherNeeded);
        System.out.println("Old voucher counter : " + getNbrVoucher());

        if (getNbrVoucher() >= nbrOfVoucherNeeded) {
            setNbrVoucher(getNbrVoucher() - nbrOfVoucherNeeded);
            System.out.println("New voucher counter : " + getNbrVoucher());
        } else {
            System.out.println("Not enough vouchers to pay bill ! ");
            setNbrVoucher(0);
        }
    }
}

