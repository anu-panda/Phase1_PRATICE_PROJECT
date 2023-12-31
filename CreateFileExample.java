package com.mphasis.work.project;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFileExample {
    public static void main(String[] args) throws IOException {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }

    private static void createFileUsingFileClass() throws IOException {
        // Using File class to create a file
        File file = new File("c://temp//testFile1.txt");

        // Create the file
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

        // Write content to the file using FileWriter
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
    }

    private static void createFileUsingFileOutputStreamClass() throws IOException {
        // Using FileOutputStream to create a file and write data
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }

    private static void createFileIn_NIO() throws IOException {
        // Using NIO to create a file and write data
        String data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());

        // Appending lines to an existing file
        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("c://temp//testFile3.txt"),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}