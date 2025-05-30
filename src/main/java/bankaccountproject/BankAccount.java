package bankaccountproject;

abstract class BankAccount {

    //Acts as a template for SavingsAccount and CurrentAccount
    //Defines common properties and methods shared by all bank accounts

    //declaring variables as private to implement encapsulation
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", Balance: $" + balance;
    }


    //abstract methods
    public abstract void withdraw(double amount);

    //concrete methods
    public void deposit(double amount){
        balance+=amount;

    }

}
