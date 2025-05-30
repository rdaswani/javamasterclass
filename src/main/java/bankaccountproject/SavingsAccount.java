package bankaccountproject;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        System.out.println("Balance amount:"+balance);
        System.out.println("Withdrawal amount:"+amount);
        if (balance-amount >= 100){
            //balance-=amount;
            //deposit(-amount);
            setBalance(balance-amount);
        } else {
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
        }
    }
}
