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

public class Person implements Comparable<Person>{
	String name;
    String role;
    int priority;
    String message;

    // Constructor
    public Person(String role, String name, int priority, String message) {
        this.role = role;
        this.name = name;
        this.priority = priority;
        this.message = message;
    }

    // Compare based on priority
    @Override
    public int compareTo(Person a) {
        return Integer.compare(a.priority, this.priority);
    }

    // toString method for formatted output
    @Override
    public String toString() {
        return "[" + role + "] " + name + " (Priority: " + priority + ") - Message: " + message;
    }

}
