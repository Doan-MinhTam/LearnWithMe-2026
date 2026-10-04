import java.util.Locale;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Gui tien thanh cong vao tai khoan");
        } else {
            System.out.println("So tien phai lon hon 0");
        }
    }

    public abstract void withdraw(double amount);


    public void displayDetails() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolderName);
        System.out.println(String.format(Locale.US, "Số dư: %,.2f VND", balance));
    }
}
