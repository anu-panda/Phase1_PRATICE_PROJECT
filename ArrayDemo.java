package com.mphasis.work.project;
public class ArrayDemo {

    public static void main(String[] args) {
        // One-dimensional array
        int[] oneDimensionalArray = {1, 2, 3, 4, 5};

        // Displaying elements of the one-dimensional array
        System.out.println("One-dimensional array elements:");
        for (int i : oneDimensionalArray) {
            System.out.print(i + " ");
        }

        // Two-dimensional array
        int[][] twoDimensionalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Displaying elements of the two-dimensional array
        System.out.println("\n\nTwo-dimensional array elements:");
        for (int[] row : twoDimensionalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Initializing and displaying a dynamic array
        int dynamicArrayLength = 5;
        int[] dynamicArray = new int[dynamicArrayLength];
        System.out.println("\nDynamic array elements:");
        for (int i = 0; i < dynamicArrayLength; i++) {
            dynamicArray[i] = i * 2;
            System.out.print(dynamicArray[i] + " ");
        }
    }
}
