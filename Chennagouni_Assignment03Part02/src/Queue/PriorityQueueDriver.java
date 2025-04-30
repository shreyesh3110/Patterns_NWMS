package Queue;
import java.util.*;

/**
* Class: 44642-02 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID:S576283
* Description: Making sure everything works
* Due: 03/03/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/

public class PriorityQueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Person> pqueue = new PriorityQueue<>();

        // Adding persons to the queue
        pqueue.add(new Person("Faculty", "Prof. Johnson", 4, "Submit grades"));
        pqueue.add(new Person("Student", "Alice", 1, "Need help with assignment"));
        pqueue.add(new Person("Faculty", "Dr. Smith", 3, "Schedule meeting for research"));
        pqueue.add(new Person("Staff", "David", 2, "Organize department event"));
        pqueue.add(new Person("Student", "Charlie", 1, "Request for leave"));
        pqueue.add(new Person("Staff", "Bob", 2, "Fix the lab computer"));

        // Printing output in priority order
        System.out.println("Processing messages in priority order:");
        while (!pqueue.isEmpty()) {
            System.out.println(pqueue.poll());
        }

	}

}
