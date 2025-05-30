package uptoday20;

import java.sql.Array;
import java.util.Scanner;

public class StudentArrayExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Step 2: Ask the user for the number of students
        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();

        // Step 3: Create an array to store Student objects (COMPLETE THIS PART)
        // Student[] students = //Complete this part;
        Student[] students = new Student[numStudents];

        // Step 4: Loop to take input for each student
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline

            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height (in cm): ");
            double height = scanner.nextDouble();

            // Step 5: Store student details in the array (COMPLETE THIS PART)
            students[i] = new Student(name, rollNumber, age, height);// COMPLETE THIS PART
        }

        // Step 6: Compute and display statistics
        calculateAndDisplayStatistics(students);
        scanner.close();
    }

    // Step 7: Method to calculate and display student statistics
    public static void calculateAndDisplayStatistics(Student[] students) {
        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;
        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;

        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.age > oldestAge) { // COMPLETE THIS PART)
                oldestAge = student.age;
                oldestStudent = student.name;
            }

            if (student.height > tallestHeight) {
                tallestHeight = student.height;
                tallestStudent = student.name;
            }
        }
        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;
        System.out.println("\n--- Statistics ---");
        System.out.println("Average Age: " + averageAge + " years");
        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Oldest Student: " + oldestStudent + " (Age: " + oldestAge + " years)");
        System.out.println("Tallest Student: " + tallestStudent + " (Height: " + tallestHeight + " cm)");
    }
}
