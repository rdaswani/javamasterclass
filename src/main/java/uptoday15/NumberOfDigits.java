package uptoday15;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        scanner.nextLine();

        countDigit(num);
        System.out.println("number of digits are "+num.toString().length());
        scanner.close();
    }

    public static Integer countDigit(Integer num){

        num = num.toString().length();
        return num;
    }
}
