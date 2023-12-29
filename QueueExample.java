package com.mphasis.work.project;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> locationsQueue = new LinkedList<>();

        // Adding elements to the queue
        locationsQueue.add("Kolkata");
        locationsQueue.add("Patna");
        locationsQueue.add("Delhi");
        locationsQueue.add("Gurgaon");
        locationsQueue.add("Noida");

        // Printing the queue
        System.out.println("Queue is: " + locationsQueue);

        // Getting and printing the head of the queue without removing it
        System.out.println("Head of Queue: " + locationsQueue.peek());

        // Removing the head of the queue
        locationsQueue.remove();
        
        // Printing the queue after removal
        System.out.println("After removing Head of Queue: " + locationsQueue);

        // Printing the size of the queue
        System.out.println("Size of Queue: " + locationsQueue.size());
    }
}

