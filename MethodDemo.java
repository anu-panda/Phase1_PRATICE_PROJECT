package com.mphasis.work.project;
public class MethodDemo {

    // Method to add two numbers and return the result
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to multiply two numbers and return the result
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Method to print a message
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the class
        MethodDemo demo = new MethodDemo();

        // Call the addNumbers method
        int sum = demo.addNumbers(5, 3);
        System.out.println("Sum of numbers: " + sum);

        // Call the multiplyNumbers method
        int product = demo.multiplyNumbers(4, 7);
        System.out.println("Product of numbers: " + product);

        // Call the printMessage method
        demo.printMessage("Hello, this is a method demo!");

        // Call a static method (no instance needed)
        staticMethodDemo();
    }

    // Static method outside of the main method
    public static void staticMethodDemo() {
        System.out.println("This is a static method demo!");
    }
}
