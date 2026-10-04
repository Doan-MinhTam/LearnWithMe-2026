public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        if (amount < 0) {
            System.out.println("So tien pahi lon hon 0");
        }
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println("Rut thanh cong");
        }
        if (amount > balance) {
            System.out.println("Rut tien that bai");
        }
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Loai tia khoan:");
        System.out.println("Lai suat: " + (interestRate * 100 ));
    }
}
