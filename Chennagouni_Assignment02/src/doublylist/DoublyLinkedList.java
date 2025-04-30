package doublylist;

/**
* Class: 44642-01 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID:S576283
* Description: Making sure everything works
* Due: 02/17/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/


 // The DoublyLinkedList class provides methods for inserting nodes, printing the list,
 // and reversing the list traversal for a doubly linked list of student information.
 
public class DoublyLinkedList {

    // Prints the details of each student in the list starting from the head node.
     
    public void print(Node head) {
        while (head != null) {
            System.out.println("The student ID is : " + head.std_ID);
            System.out.println("First Name : " + head.firstName);
            System.out.println("Last Name : " + head.lastName);
            System.out.println("isGraduated?: " + head.isGradOrNot);
            System.out.println("Age: " + head.age);
            System.out.println("******");
            head = head.next;
        }
    }

    //  Inserts a new node at the end of the doubly linked list.
     
    public Node insertNode(Node head, Node newNode) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
        
        return head;
    }

    //  Traverses the doubly linked list in reverse order and prints the details of each student.
     
    public void reverseList(Node head) {
        Node current = head;

        // Traverse to the last node of the list
        while (current != null && current.next != null) {
            current = current.next;
        }

        // Traverse the list in reverse order
        while (current != null) {
            System.out.println("The student ID is: " + current.std_ID);
            System.out.println("First Name: " + current.firstName);
            System.out.println("Last Name: " + current.lastName);
            System.out.println("isGraduated?: " + current.isGradOrNot);
            System.out.println("Age: " + current.age);
            System.out.println("*****");
            current = current.previous;
        }
    }
}
