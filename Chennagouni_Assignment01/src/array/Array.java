package array;

import java.util.Random;
import java.util.Scanner;

/**
 * The Array class demonstrates the use of arrays by generating random values,
 * finding pairs with a given sum, and displaying results.
 * It creates two arrays: one with unique random values and another with random values,
 * then finds and prints pairs whose sum matches user input.
 * 
 * @author Shreyesh Chennagouni
 * SID: S576283
 */
public class Array {

    /**
     * The main method initializes two arrays, fills them with random values,
     * displays them, takes user input for a sum, and finds pairs with that sum.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Declare arrays
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        // Fill arr1 with unique random values between 25-50
        fillUniqueRandomValues(arr1, 25, 50);
        
        // Fill arr2 with random values between 25-35
        fillRandomValues(arr2, 25, 35);
        
        // Display arrays
        System.out.print("Array 1: ");
        printArray(arr1);
        System.out.print("Array 2: ");
        printArray(arr2);
        
        // Take the sum input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();
        
        // Find and display pairs with the given sum
        findPairsWithSum(arr1, arr2, sum);
        
        scanner.close();
    }

    /**
     * Fills an array with unique random values within a given range.
     * 
     * @param array the array to fill
     * @param min   the minimum value (inclusive)
     * @param max   the maximum value (inclusive)
     */
    private static void fillUniqueRandomValues(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomValue;
            boolean isUnique;
            do {
                randomValue = random.nextInt(max - min + 1) + min;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (array[j] == randomValue) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            array[i] = randomValue;
        }
    }

    /**
     * Fills an array with random values within a given range.
     * 
     * @param array the array to fill
     * @param min   the minimum value (inclusive)
     * @param max   the maximum value (inclusive)
     */
    private static void fillRandomValues(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    /**
     * Finds and prints pairs of numbers from two arrays whose sum matches the given value.
     * 
     * @param arr1 the first array
     * @param arr2 the second array
     * @param sum  the target sum to find pairs for
     */
    private static void findPairsWithSum(int[] arr1, int[] arr2, int sum) {
        boolean foundPair = false;
        int pairCount = 0;
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 + num2 == sum) {
                    foundPair = true;
                    System.out.println("Pair " + (++pairCount) + ": (" + num1 + "," + num2 + ")");
                }
            }
        }
        if (!foundPair) {
            System.out.println("No pair found");
        }
    }

    /**
     * Prints the elements of an array in a single line.
     * 
     * @param array the array to print
     */
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
