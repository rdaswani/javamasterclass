import java.util.Scanner;

public class Test {

    public static void main (String [] args){
        double principalAmount;
        double interest;
        double time;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the principal amount ");
        principalAmount=scanner.nextDouble();

        System.out.println("Please enter the interest ");
        interest=scanner.nextDouble();

        System.out.println("Please enter the time in years ");
        time=scanner.nextDouble();

        double simpleInterest = (principalAmount*interest*time)/100;

        System.out.printf("The simple interest is $%.3f",simpleInterest);







        scanner.close();

    }
}
