import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(7);
        numbers.add(3);
        //numbers.add(7); //won't add duplicate elements

        // Displaying the TreeSet (sorted order)
        System.out.println("TreeSet: " + numbers);

        // Trying to add a duplicate element
        boolean isAdded = numbers.add(7);
        System.out.println("Was 7 added again? " + isAdded);

        // First (smallest) element
        System.out.println("First element: " + numbers.first());

        // Last (largest) element
        System.out.println("Last element: " + numbers.last());

        // Removing an element
        numbers.remove(5);
        System.out.println("After removing 5: " + numbers);
    }
}