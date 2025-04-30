package linkedlists;

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

import java.util.Scanner;


 // Represents a singly linked list with various operations such as insertion, 
 // updating, printing, swapping, and merging nodes.
 
public class SinglyLinkedList {
    
    // The head node of the linked list.
    Node head;

    // Scanner object for user input.
    Scanner input = new Scanner(System.in);

    // Inserts a new node at the end of the linked list.
     
    public Node insertNode(Node head, Node newNode) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    
    //  Updates the graduation status of a student in the linked list.
    
    public Node updateDetails(Node head, int std) {
        System.out.print("Is the student graduated: ");
        boolean isGrad = input.nextBoolean();
        System.out.println("******************************************");
        System.out.println("After updating " + std + " details:");
        
        Node current = head;
        while (current.std_ID != std) {
            current = current.next;
        }
        current.isGradOrNot = isGrad;
        return head;
    }

//  Prints the details of all nodes in the linked list.
    
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

    // Swaps two nodes in the linked list based on their student IDs.
     
    public Node swap(Node head, int sid1, int sid2) {
        System.out.println("Linked List after swapping " + sid1 + " with " + sid2 + " is");
        if (sid1 == sid2) {
            return head;
        }
        Node prev1 = null, prev2 = null;
        Node node1 = head, node2 = head;
        
        while (node1 != null && node1.std_ID != sid1) {
            prev1 = node1;
            node1 = node1.next;
        }
        while (node2 != null && node2.std_ID != sid2) {
            prev2 = node2;
            node2 = node2.next;
        }
        
        if (node1 == null || node2 == null) {
            return head;
        }

        if (prev1 != null) {
            prev1.next = node2;
        } else {
            head = node2;
        }

        if (prev2 != null) {
            prev2.next = node1;
        } else {
            head = node1;
        }
        
        Node temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;
        
        return head;
    }

    // Merges two linked lists by appending the second list to the end of the first list.
    
    public Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;

        return head1;
    }
}
