package Set;
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

public class SetPerformanceComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testWithSize(1000);
		System.out.println("***************************************");
		testWithSize(10000);
		System.out.println("***************************************");
		testWithSize(1000000);
		
		// Answer for the 10th question
		System.out.println("\nHashSet performed the fastest as it uses hashing, allowing O(1) average-time insertions.\n"
				+ "\n"
				+ "LinkedHashSet was slightly slower due to maintaining insertion order with a linked list.\n"
				+ "\n"
				+ "TreeSet was the slowest since it maintains sorted order using a Red-Black Tree, causing O(log n) insertions.\n"
				+ "\n"
				+ "HashSet is best for fast lookups, LinkedHashSet for maintaining order, and TreeSet for sorted data.");
	}

	public static void testWithSize(int m) {
		Set<Integer> hashset = new HashSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		Random rand = new Random();
		
		long startTime,endTime ;
		
		// for HashSet
		
		startTime = System.nanoTime();
		for (int i = 0;i < m;i++) {
			hashset.add(rand.nextInt());
			
		}
		endTime = System.nanoTime();
		long finaltime = endTime-startTime;
		System.out.println("Time taken for Hashet: "+finaltime+" ns");
		
		// for Linked HashSet
		
		startTime =  System.nanoTime();
		for(int j=0;j<m;j++) {
			linkedHashSet.add(rand.nextInt());
		}
		endTime = System.nanoTime();
		finaltime = endTime-startTime;
		System.out.println("Time taken for LinkedHashSet: "+finaltime+" ns");
		
		// for Treeset
		
		startTime = System.nanoTime();
		for (int k =0;k<m;k++) {
		treeSet.add(rand.nextInt());
			
		}
		endTime =  System.nanoTime();
		finaltime = endTime-startTime;
		System.out.println("Time taken for TreeSet: "+finaltime+" ns");
		
	}
}
