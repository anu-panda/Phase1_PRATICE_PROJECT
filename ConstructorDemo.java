package com.mphasis.work.project;
public class ConstructorDemo {

    // Default Constructor
    public ConstructorDemo() {
        System.out.println("Default Constructor called.");
    }

    // Parameterized Constructor
    public ConstructorDemo(int value) {
        System.out.println("Parameterized Constructor called with value: " + value);
    }

    // Constructor with multiple parameters
    public ConstructorDemo(String name, int age) {
        System.out.println("Constructor with multiple parameters called. Name: " + name + ", Age: " + age);
    }

    // Copy Constructor
    public ConstructorDemo(ConstructorDemo other) {
        System.out.println("Copy Constructor called. Copied from another instance.");
    }

    public static void main(String[] args) {
        // Create instances using different constructors
        ConstructorDemo defaultConstructor = new ConstructorDemo();
        ConstructorDemo parameterizedConstructor = new ConstructorDemo(42);
        ConstructorDemo multipleParametersConstructor = new ConstructorDemo("John", 25);

        // Create an instance using a copy constructor
        ConstructorDemo originalInstance = new ConstructorDemo();
        ConstructorDemo copyConstructor = new ConstructorDemo(originalInstance);
    }
}
