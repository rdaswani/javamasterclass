package uptoday15;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {

    /*
    Problem Statement
Create a simple To-Do list application that allows the user to:

Add a task
View all tasks
Mark a task as completed
Remove a task
Exit the application

The program should repeatedly show a menu to the user until they choose to exit.
 Implement the program using conditional statements, loops, and methods
     */


    static ArrayList <String> taskList = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);
    static boolean continueTrueOrFalse = true ;
    public static void main(String[] args) {
        int selection;


        System.out.println("Welcome to the ToDo app");
        System.out.println();



        while (continueTrueOrFalse) {
            System.out.println("Please select an option from the below, by entering the number");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Remove a task");
            System.out.println("5. Exit the application");
            System.out.println();
            System.out.println();
            System.out.println("Please enter your selection");
            selection = scanner.nextInt();
            scanner.nextLine();


            if (selection == 1) {
                addTask();
                //System.out.println("Coming into 1");
                //String task = scanner.next();
                //taskList.add(task);
                //System.out.println("Size of task list " + taskList.size());

            }
            if (selection == 2) {
                viewTask();
                //System.out.println("Coming into 2");
                //System.out.println("Size of task list " + taskList.size());
                //for(String task : taskList){
                 //   System.out.println(task);
               // }
            }
            if (selection == 3) {
                completeTask();

                //code in complete task method task

            }
            if (selection == 4) {
                removeTask();
                //code in remove task method
            }
            if (selection == 5) {
                exitApp();
                //continueTrueOrFalse = exitApp();

            }

        }
    }

    public static void addTask(){
        System.out.println("Enter the task: ");
        String task = scanner.nextLine();
        taskList.add(task);
        //System.out.println("Size of task list " + taskList.size());
        System.out.println("Task added");
    }
    public static void viewTask(){
        //System.out.println("Size of task list " + taskList.size());
        System.out.println("To-Do List: ");
        for(String task : taskList){
            System.out.println(task);
        }
    }
    public static void completeTask(){
        System.out.println("Select the task to complete ");
        for (int i = 0; i < taskList.size() ; i++) {
            System.out.println(i + "." + taskList.get(i));
        }
        int taskToComplete = scanner.nextInt();
        scanner.nextLine();
        String temp = taskList.get(taskToComplete);
        taskList.set(taskToComplete,temp+" is now Complete");
    }
    public static void removeTask(){
        System.out.println("Select the task to remove ");
        for (int i = 0; i < taskList.size() ; i++) {
            System.out.println(i + "." + taskList.get(i));
        }
        int taskToRemove = scanner.nextInt();
        scanner.nextLine();
        taskList.remove(taskToRemove);
    }
    public static void exitApp(){
        continueTrueOrFalse = false;

    }

}
