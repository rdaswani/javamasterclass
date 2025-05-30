import java.util.TreeSet;
import java.util.Comparator;

public class CustomTreeSetExample {
    public static void main(String[] args) {
        // Custom Comparator to sort elements in descending order
        Comparator<Integer> descendingOrder = (a, b) -> b - a;

        // Create a TreeSet with the custom comparator
        TreeSet<Integer> numbers = new TreeSet<>(descendingOrder);

        // Adding elements to the TreeSet
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(7);
        numbers.add(3);

        // Displaying the TreeSet (sorted in descending order)
        System.out.println("TreeSet in Descending Order: " + numbers);

        // Checking if an element exists
        boolean containsTen = numbers.contains(10);
        System.out.println("Does the TreeSet contain 10? " + containsTen);

        // Polling (removing and returning) the first element
        int firstElement = numbers.pollFirst();
        System.out.println("First element removed: " + firstElement);
        System.out.println("TreeSet after polling: " + numbers);
    }
}