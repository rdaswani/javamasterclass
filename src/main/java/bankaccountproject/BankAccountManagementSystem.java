package bankaccountproject;
import bankaccountproject.InputUtils;

public class BankAccountManagementSystem extends InputUtils{



    public static void main(String[] args) {
        InputUtils inputUtils = new InputUtils();
        BankService bankService = new BankService();
        boolean exit = true;
        while (exit) {

            System.out.println("*********************************************");
            System.out.println();
            System.out.println("Welcome to the bank account management system");
            System.out.println();
            System.out.println("*********************************************");

            System.out.println("Please select an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money to an existing account");
            System.out.println("3. Withdraw money from an existing account");
            System.out.println("4. Check account balance");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("*********************************************");
            System.out.print("Enter your choice: ");
            int choice = inputUtils.readInt();


            switch (choice) {
                case 1:
                    System.out.println("Creating a new account");
                    System.out.println("Select an account type:");
                    System.out.println("1. Current account");
                    System.out.println("2. Savings account");
                    System.out.println();
                    int accountType = inputUtils.readInt();
                    if (accountType == 1) {
                        System.out.println("Enter the initial deposit amount:");
                        int initialDeposit = inputUtils.readInt();
                        bankService.createCurrentAccount(initialDeposit);

                    }
                    if (accountType == 2) {

                        System.out.println("Enter the initial deposit amount:");
                        int initialDeposit = inputUtils.readInt();
                        bankService.createSavingAccount(initialDeposit);
                    }

                    break;
                case 2:
                    System.out.println("Depositing money to an existing account");
                    bankService.depositFunds();
                    break;
                case 3:
                    System.out.println("Withdrawing money from an existing account");
                    bankService.withdrawFunds();
                    break;
                case 4:
                    System.out.println("Checking account balance");
                    bankService.showBalance();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }


    }
}
