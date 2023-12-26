package com.mphasis.work.project;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

    public static void main(String[] args) {
        // Example 1: Matching a specific pattern in a string
        String text1 = "The quick brown fox jumps over the lazy dog.";

        // Pattern to match any word starting with 'q'
        String pattern1 = "\\bq\\w*";

        // Creating a Pattern object
        Pattern p1 = Pattern.compile(pattern1);

        // Creating a Matcher object
        Matcher m1 = p1.matcher(text1);

        // Finding and printing matches
        System.out.println("Matches for pattern1 in text1:");
        while (m1.find()) {
            System.out.println(m1.group());
        }

        // Example 2: Splitting a string using a regular expression
        String text2 = "apple,orange,banana,grape";

        // Pattern to match commas
        String pattern2 = ",";

        // Splitting the string using the pattern
        String[] fruits = text2.split(pattern2);

        // Printing the split elements
        System.out.println("\nSplitting text2 using pattern2:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Example 3: Replacing a pattern in a string
        String text3 = "Hello, Java!";

        // Pattern to match 'Java'
        String pattern3 = "Java";

        // Replacing 'Java' with 'World'
        String replacedText = text3.replaceAll(pattern3, "World");

        // Printing the replaced text
        System.out.println("\nReplaced text3: " + replacedText);
    }
}
