package uptoday20;
import java.util.Scanner;

public class MathQuiz {
    private int score;

    // Constructor to initialize the score
    public MathQuiz() {
        this.score = 0;
    }

    // Step 6: Implement method to start the quiz
    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) { // 5 questions per quiz
            askQuestion(scanner);
        }
        System.out.println("Your final score is: " + score + "/5");
        scanner.close();
    }

    // Step 7: Implement method to generate a question, get user input, and check the answer
    private void askQuestion(Scanner scanner) {
        Question question = new Question();
        question.generateQuestion();
        System.out.print("Your answer: ");
        double userAnswer = scanner.nextDouble();
        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
    }
}