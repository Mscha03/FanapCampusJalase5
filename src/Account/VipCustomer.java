package Account;

public class VipCustomer{

    private String name;
    private int validity;
    private String email;
    public VipCustomer() {

        name = "no name";
        validity = 0;
        email = "no email";
    }

    public VipCustomer(String name, int validity, BankAccount account) {
        this.name = name;
        this.validity = validity;
        email = "no email";
    }

    public VipCustomer(String name, int validity, String email, BankAccount account) {
        this.name = name;
        this.validity = validity;
        this.email = email;
    }
}
