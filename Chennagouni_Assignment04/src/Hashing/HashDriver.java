package Hashing;
import java.util.*;

/**
* Class: 44642-02 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID:S576283
* Description: Making sure everything works
* Due: 03/28/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/

public class HashDriver {

	static int collision = 0;
	//static array of LinkedLists
    static LinkedList<Integer>[] hashTable = new LinkedList[31];
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        arrayInitialize();
        Set<Integer> set1 = new HashSet<>();
        Random rand = new Random();
         
        while (set1.size() < 1000) {
            set1.add(rand.nextInt(10000)); // adding random numbers between 0-9999 to the set1
        }
        
        for (int num : set1) {
            hashing(num);
        }
        
        System.out.println("Total Collisions: " + collision);
        System.out.println("Hash Table with chanining");
        for (int i = 0; i < 31; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
               
        }
        // Answer for the 11th question
        System.out.println("\nCollisions happened because 1000 numbers were placed into only 31 slots, causing some numbers to share the same spot. \n\nChaining solved this by using linked lists to store multiple numbers in the same slot, keeping the data organized and easy to find.");
    }
    
    public static void arrayInitialize() {
        for (int i = 0; i < 31; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }
    
    public static void hashing(int val) {
        int index = val % 31;
        if (!hashTable[index].isEmpty()) {
            collision++;
        }
        hashTable[index].add(val);
    }
}
