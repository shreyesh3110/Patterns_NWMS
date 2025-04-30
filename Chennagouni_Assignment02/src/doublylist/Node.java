package doublylist;

/**
* Class: 44642-01 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID: S576283
* Description: Making sure everything works
* Due: 02/17/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/


 // The Node class represents an individual node in a doubly linked list.
 // Each node contains student information and references to the next and previous nodes.
 
public class Node {
    
    int std_ID;
    int age;
    String firstName;
    String lastName;
    boolean isGradOrNot;
    Node next;
    Node previous;

    
    //  Constructor to initialize a node with student details.
     
    public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age) {
        this.std_ID = std_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGradOrNot = isGradOrNot;
        this.age = age;
    }
}
