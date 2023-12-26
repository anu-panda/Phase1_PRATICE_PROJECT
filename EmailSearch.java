package com.mphasis.work.project;
import java.util.Arrays;
import java.util.Scanner;

public class EmailSearch {

    public static void main(String[] args) {
        // Array of email IDs
        String[] emailArray = {"john.doe@example.com", "jane.smith@example.com", "bob.jones@example.com"};

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Search for the email ID
        boolean found = searchEmail(emailArray, searchEmail);

        // Display the result
        if (found) {
            System.out.println("Email ID found!");
        } else {
            System.out.println("Email ID not found.");
        }
    }

    // Method to search for the email ID in the array
    private static boolean searchEmail(String[] emailArray, String searchEmail) {
        // Convert the array to a list for easy search
        Arrays.sort(emailArray); // Optional: Sort the array for binary search
        return Arrays.binarySearch(emailArray, searchEmail) >= 0;
    }
}
