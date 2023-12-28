package com.mphasis.work.project;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileHandling {

	    private static final String FILE_PATH = "sample.txt";

	    public static void main(String[] args) {
	        writeToTextFile("Hello, this is a sample text.");
	        readFromTextFile();
	        appendToTextFile("Appending new content to the file.");
	    }

	    private static void writeToTextFile(String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
	            writer.write(content);
	            System.out.println("Content written to the file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void readFromTextFile() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
	            String line;
	            System.out.println("Reading from the file:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void appendToTextFile(String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
	            writer.newLine();
	            writer.write(content);
	            System.out.println("Content appended to the file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

