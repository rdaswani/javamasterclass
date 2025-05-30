package uptoday15;

import java.util.Scanner;

public class NumberGuessingGame {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
        System.out.println("The objective of the game is to have the computer guess a number that the user is thinking of, " +
                "between 1 and 100, using user feedback to narrow down the possible numbers.");

        System.out.println();
        System.out.println();
        System.out.println("Please enter a number between 1 and 100 ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int result = numberGuessAlgorithm(number);
        System.out.println("I guessed your number! It is "+result);
    }

    public static int numberGuessAlgorithm(int n){

        Scanner scanner = new Scanner(System.in);

        int low=0;
        int high=100;
        while (low <= high){

            int mid = (low+high)/2;

            System.out.println("Is my guess " + mid + " lower or higher or correct?");

            System.out.println("Please press L if your number is lower than mine ");
            System.out.println("Please press H if your number is greater than mine ");
            System.out.println("Please press C if my guess is correct ");

            String guess = scanner.next();
            scanner.nextLine();

            if(guess.equalsIgnoreCase("L")){
                high=mid-1;
                //System.out.println("IN L");
            }
            if(guess.equalsIgnoreCase("H")){
                low=mid+1;
                System.out.println("IN H");
            }
            if(guess.equalsIgnoreCase("C")){
                //System.out.println("IN C");
                return mid;
            }
        }
return 0;
    }
}
