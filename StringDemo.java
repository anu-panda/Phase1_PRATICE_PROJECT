package com.mphasis.work.project;
public class StringDemo {

    public static void main(String[] args) {
        // String demonstration
        String str1 = "Hello";
        String str2 = "World";

        // Concatenating strings
        String resultString = str1 + " " + str2;
        System.out.println("Concatenated String: " + resultString);

        // StringBuffer demonstration
        StringBuffer stringBuffer = new StringBuffer("Java");
        
        // Appending text to StringBuffer
        stringBuffer.append(" is");
        stringBuffer.append(" a");
        stringBuffer.append(" programming language.");
        System.out.println("StringBuffer content: " + stringBuffer);

        // StringBuilder demonstration
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");

        // Inserting text into StringBuilder
        stringBuilder.insert(5, " is");
        stringBuilder.append(" in Java.");
        System.out.println("StringBuilder content: " + stringBuilder);
    }
}

