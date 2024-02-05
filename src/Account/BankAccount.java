package Account;

public class BankAccount {
    protected int accountNumber;
    protected int Balance;
    protected String customerName;
    protected String customerEmail;
    protected String customerPhoneNumber;


    // getter and setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


    // put money to account
    public void deposit(int im) {
        if (im > 0) {
            Balance += im;
            System.out.println("افزایش موجودی انجام شد.");
        }
        System.out.println(" :مانده حساب" + Balance);
    }

    // get money from account
    public void withdraw(int dm) {
        if (dm < Balance && dm > 0) {
            Balance -= dm;
            System.out.println("برداشت انجام شد.");
        }else {
            System.out.println("موجودی کافی نیست. برداشت انجام نشد");
        }
        System.out.println(":مانده حساب" + Balance);
    }
}
