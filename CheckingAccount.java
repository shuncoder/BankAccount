public class CheckingAccount extends BankAccount {
    // 3. It should contain a static constant FEE that represents the cost of
    // clearing one check
    private static final double FEE = 0.15;

    // 4.write constructor
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() + " -10");
    }

    // 5.override withdraw method in the super class
    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + FEE;
        return super.withdraw(totalAmount);
    }
}
