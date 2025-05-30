import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Attempting to add duplicate elements
        fruits.add("Apple"); // This will not be added

        // Adding a null element
        fruits.add(null);

        // Displaying the LinkedHashSet elements
        System.out.println("Fruits in LinkedHashSet: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the set.");
        }

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterating over the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}