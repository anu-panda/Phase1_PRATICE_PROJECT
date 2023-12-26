package com.mphasis.work.project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList demonstration
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        // Displaying elements of the ArrayList
        System.out.println("ArrayList elements: " + arrayList);

        // HashMap demonstration
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");

        // Displaying key-value pairs of the HashMap
        System.out.println("HashMap elements: " + hashMap);

        // Accessing specific elements from the collections
        System.out.println("Element at index 1 in ArrayList: " + arrayList.get(1));
        System.out.println("Value for key 2 in HashMap: " + hashMap.get(2));

        // Iterating through ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Iterating through HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
