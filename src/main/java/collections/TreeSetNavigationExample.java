package collections;

import java.util.TreeSet;

public class TreeSetNavigationExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // headSet example
        System.out.println("HeadSet (less than 4): " + numbers.headSet(4));

        // tailSet example
        System.out.println("TailSet (greater than or equal to 3): " + numbers.tailSet(3));

        // subSet example
        System.out.println("SubSet (from 2 to 5): " + numbers.subSet(2, 5));

        // descendingSet example
        System.out.println("Descending Set: " + numbers.descendingSet());
    }
}