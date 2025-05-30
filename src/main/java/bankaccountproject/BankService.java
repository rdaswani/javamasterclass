package bankaccountproject;

import java.util.ArrayList;
import java.util.Random;

public class BankService {

    /**
     * This is the class responsible for the core business logic of your system.
     *
     * Responsibilities:
     * Create accounts (SavingsAccount or CurrentAccount)
     *
     * Store accounts in a list (ArrayList<BankAccount>)
     *
     * Find accounts by account number
     *
     * Perform deposits
     *
     * Perform withdrawals
     *
     * Show account balances
     *
     * Optional: Record and display transaction history for each account
     */
    Random random = new Random();
    InputUtils inputUtils = new InputUtils();
    ArrayList<BankAccount> accountArrayList = new ArrayList<BankAccount>();
    //ArrayList<CurrentAccount> currentAccountArrayList = new ArrayList<CurrentAccount>();

    int savingCounter = 0;
    int currentCounter = 0;

        public void createSavingAccount(double initialDeposit){

            //one way to generate accountNumber
            /*
            int number = random.nextInt(100, 1000);
            String accountNumber = "Your Saving account number is SB"+number;
            return accountNumber;
            */
            //second way
            savingCounter+=1;
            String formattedNumber = String.format("SB%03d", savingCounter); // SB001, SB002...
            SavingsAccount savingAccount = new SavingsAccount(formattedNumber, initialDeposit);
            accountArrayList.add(savingAccount);
            String temp = accountArrayList.toString();
            System.out.println(temp);
            System.out.println("Account created successfully");
            System.out.println("Your Current account number is " + formattedNumber + " and your balance is $" + initialDeposit);

        }

    public void createCurrentAccount(double initialDeposit){

        //one way to generate accountNumber
            /*
            int number = random.nextInt(100, 1000);
            String accountNumber = "Your Current account number is CA"+number;
            return accountNumber;
            */
        //second way
        currentCounter+=1;
        String formattedNumber = String.format("CA%03d", currentCounter); // CA001, CA002...
        CurrentAccount currentAccount = new CurrentAccount(formattedNumber, initialDeposit);
        accountArrayList.add(currentAccount);
        String temp = accountArrayList.toString();
        System.out.println(temp);
        System.out.println("Account created successfully");
        System.out.println("Your Current account number is " + formattedNumber + " and your balance is $" + initialDeposit);

    }

    public void depositFunds(){

        BankAccount account = accountLookup();
        System.out.print("Enter amount to deposit: $");
        double amount = inputUtils.readDouble();
        account.deposit(amount);

    }

    public void withdrawFunds(){
            BankAccount account = accountLookup();
            System.out.print("Enter amount to withdraw: $");
            double amount = inputUtils.readDouble();
            account.withdraw(amount);
        System.out.println("Current balance after withdrawl is : " + account.getBalance());

    }
    public BankAccount accountLookup(){
        System.out.println("Enter account number:");
        String accountNumber = inputUtils.readString();
        for (BankAccount account : accountArrayList){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
            else{
                System.out.println("Account number not found. Try again:");
            }
        }
        return null;
    }
    public void showBalance(){
        BankAccount account = accountLookup();
        if (account != null){
            System.out.println("Current balance: " + account.getBalance());
        }
        }
        //return account.getBalance();

    }

