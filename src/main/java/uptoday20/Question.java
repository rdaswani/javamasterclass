package uptoday20;
import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;

    // Constructor to generate a random arithmetic question
    public Question() {
        Random rand = new Random();
        this.operand1 = rand.nextInt(100) + 1;
        this.operand2 = rand.nextInt(100) + 1;
        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(4)];
        calculateAnswer();
    }

    // Step 2: Implement method to calculate the correct answer
    private void calculateAnswer() {
        switch (operator) {
            case '+':
                correctAnswer = operand1+operand2;// COMPLETE THIS PART;
                break;
            case '-':
                correctAnswer = operand1-operand2;// COMPLETE THIS PART;
                break;
            case '*':
                correctAnswer = operand1*operand2;// COMPLETE THIS PART;
                break;
            case '/':
                correctAnswer = (double) operand1 /operand2;// COMPLETE THIS PART;
                break;
        }
    }

    // Step 3: Method to display the generated question
    public void generateQuestion() {
        System.out.println("What is " + operand1 + " " + operator + " " + operand2 + "?");
    }

    // Step 4: Method to check if the user's answer is correct
    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001; // Allowing a small tolerance for floating-point answers
    }
}