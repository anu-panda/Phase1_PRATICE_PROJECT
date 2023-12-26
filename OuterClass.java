package com.mphasis.work.project;
public class OuterClass {
    
    private int outerValue = 10;

    // Inner class
    class InnerClass {
        void displayInner() {
            System.out.println("Inner class method called. Outer value: " + outerValue);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Create an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Call the method of the inner class
        innerObj.displayInner();
    }
}

