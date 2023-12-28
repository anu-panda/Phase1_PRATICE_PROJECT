package com.mphasis.work.project;
//Define a custom exception class
class MyException extends Exception {
 String str1;

 MyException(String str2) {
     str1 = str2;
 }

 // Override toString() to provide a custom exception message
 public String toString() {
     return "MyException Occurred: " + str1;
 }
}

//Main class to demonstrate exception handling
public class ExceptionHandlingDemo {
 public static void main(String args[]) {
     try {
         System.out.println("Starting of try block");

         // Throw the custom exception using throw
         throw new MyException("This is My error Message");
     } catch (MyException exp) {
         // Catch the custom exception
         System.out.println("Catch Block");
         System.out.println(exp);
     }
 }
}
