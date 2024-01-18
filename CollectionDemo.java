// Piper Howell
// ITEC 300

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize collections for Stack, Queue, and List
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // Variables to track time and number of operations
        long startTime, endTime;
        int numOperations;

        // Infinite loop for menu-driven user interface
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display collections");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer: ");
                    int element = scanner.nextInt();

                    // Add element to the Stack
                    startTime = System.nanoTime();
                    stack.push(element);
                    endTime = System.nanoTime();
                    numOperations = 1;
                    System.out.println("Stack: Add operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");

                    // Add element to the Queue
                    startTime = System.nanoTime();
                    queue.offer(element);
                    endTime = System.nanoTime();
                    numOperations = 1;
                    System.out.println("Queue: Add operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");

                    // Add element to the List
                    startTime = System.nanoTime();
                    list.add(element);
                    endTime = System.nanoTime();
                    numOperations = 1;
                    System.out.println("List: Add operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");
                    break;

                case 2:
                    // Remove element from the Stack
                    startTime = System.nanoTime();
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    endTime = System.nanoTime();
                    numOperations = 1;
                    System.out.println("Stack: Remove operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");

                    // Remove element from the Queue
                    startTime = System.nanoTime();
                    if (!queue.isEmpty()) {
                        queue.poll();
                    }
                    endTime = System.nanoTime();
                    numOperations = 1;
                    System.out.println("Queue: Remove operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");

                    // Remove element from the List
                    startTime = System.nanoTime();
                    if (!list.isEmpty()) {
                        list.remove(0);
                    }
                    endTime = System.nanoTime();
                    numOperations = list.size();
                    System.out.println("List: Remove operation took " + (endTime - startTime) + " nanoseconds and " + numOperations + " operation(s).");
                    break;

                case 3:
                    // Display the contents of all collections
                    System.out.println("Stack: " + stack);
                    System.out.println("Queue: " + queue);
                    System.out.println("List: " + list);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
