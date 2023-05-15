public class SavingsAccount extends BankAccount {
    // 2. rate that represents the annual interest rate
    private double rate = 0.025;
    // 3.variable called savingsNumber, initialized to 0
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        savingsNumber++;
        // Each individual savings account is identified by the number following a
        accountNumber = getAccountNumber() + " - " + savingsNumber;
    }

    // 6. write a method no parameter and return no value
    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    // 7. Write a method that overrides the getAccountNumber method in the
    // superclass.
    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    // 8.
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber = oldAccount.savingsNumber + 1;
        accountNumber = oldAccount.getAccountNumber() + "-" + savingsNumber;
    }
}
