package uptoday20;
import java.util.Random;

public class Dice {
    private int value;

    // Step 1: Default Constructor to initialize dice
    public Dice() {
        // COMPLETE THIS PART
        value=0;
    }

    // Step 2: Method to roll the dice
    public void roll() {
        Random rand = new Random();
        value= rand.nextInt(1,7);
    }

    // Step 3: Method to get the current value of the dice
    public int getValue() {
        return value;
    }
}