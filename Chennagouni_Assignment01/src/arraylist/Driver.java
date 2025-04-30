package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * The Driver class demonstrates operations on an ArrayList of integers.
 * 
 * @author Shreyesh Chennagouni
 * SID: S576283
 */

public class Driver {
    /**
     * The main method executes the program and manipulates the ArrayLists.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();

        // Populate numberList with 15 unique random values between 100 and 150
        while (numberList.size() < 15) {
            int randomNum = rand.nextInt(51) + 100; // Generates numbers from 100 to 150
            if (!numberList.contains(randomNum)) {
                numberList.add(randomNum);
            }
        }

        // Display initial numberList
        System.out.println("Initial random numbers in numberList ArrayList:");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println("\nSize of the numberList: " + numberList.size());

        // Populate indexList with 15 random values from 1 to 50
        for (int i = 0; i < 15; i++) {
            indexList.add(rand.nextInt(50) + 1); // Generates numbers from 1 to 50
        }

        // Display indexList
        System.out.println("\nInitial random numbers in indexList ArrayList:");
        for (int num : indexList) {
            System.out.print(num + " ");
        }
        System.out.println("\nSize of the indexList: " + indexList.size());

        // Replace random positions in numberList with values from indexList
        for (int value : indexList) {
            int randomPos = rand.nextInt(numberList.size());
            numberList.set(randomPos, value);
        }

        // Display updated numberList
        System.out.println("\nUpdated random numbers in numberList ArrayList:");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println("\nSize of the numberList: " + numberList.size());

        // Remove 7 random elements from numberList
        for (int i = 0; i < 7 && !numberList.isEmpty(); i++) {
            numberList.remove(rand.nextInt(numberList.size()));
        }

        // Display numberList after removal
        System.out.println("\nNumberList ArrayList after removing 7 numbers:");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println("\nSize of the numberList: " + numberList.size());

        // Insert 8 new random values between 150 and 200 at random positions
        for (int i = 0; i < 8; i++) {
            int newNum = rand.nextInt(51) + 150; // Generates numbers from 150 to 200
            int insertPos = rand.nextInt(numberList.size() + 1);
            numberList.add(insertPos, newNum);
        }

        // Display final numberList
        System.out.println("\nNumberList ArrayList after adding numbers:");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println("\nSize of the numberList: " + numberList.size());
    }
}
