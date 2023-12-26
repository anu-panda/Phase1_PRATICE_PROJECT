package com.mphasis.work.project;
import java.util.Scanner;
public class ArithmeticCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Arithmetic Calculator");

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the operation (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);

	        double result = 0;

	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Cannot divide by zero.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operation. Please enter +, -, *, or /");
	                return;
	        }

	        System.out.println("Result: " + result);
	    }
	}

