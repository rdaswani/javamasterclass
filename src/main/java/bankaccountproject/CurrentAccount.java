package bankaccountproject;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        System.out.println("Balance amount:"+balance);
        System.out.println("Withdrawal amount:"+amount);
        if(balance - amount >= -500) {
            //balance -= amount;
            //deposit(-amount);  // Reusing deposit method to subtract amount
            setBalance(balance-amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }

    }
}
