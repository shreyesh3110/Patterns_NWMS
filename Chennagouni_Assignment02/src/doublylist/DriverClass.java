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

import java.util.Scanner;


 // The DriverClass class provides a simple implementation of a doubly linked list 
 // of students. It allows users to input student information, insert nodes into 
 // the doubly linked list, print the list, and print the list in reverse order.
 
public class DriverClass {

   
     // The main method that serves as the entry point of the program.
     // It takes user input for multiple student records, inserts them into a 
     // doubly linked list, and then prints the list in both regular and reverse orders.
    
    public static void main(String[] args) {
        // Create an instance of DoublyLinkedList
        DoublyLinkedList doublylinkedlist = new DoublyLinkedList();
        Scanner input = new Scanner(System.in);
        
        // Input data for the first student
        System.out.print("Enter student ID is: ");
        int sid1 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName1 = input.next();
        System.out.print("Enter last name: ");
        String lastName1 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad1 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age1 = input.nextInt();
        Node node1 = new Node(sid1, firstName1, lastName1, isGrad1, age1);
        node1.previous = null;
        Node head = node1;
        
        // Input data for the second student
        System.out.print("Enter student ID is: ");
        int sid2 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName2 = input.next();
        System.out.print("Enter last name: ");
        String lastName2 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad2 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age2 = input.nextInt();
        Node node2 = new Node(sid2, firstName2, lastName2, isGrad2, age2);
        doublylinkedlist.insertNode(head, node2);
        
        // Input data for the third student
        System.out.print("Enter student ID is: ");
        int sid3 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName3 = input.next();
        System.out.print("Enter last name: ");
        String lastName3 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad3 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age3 = input.nextInt();
        Node node3 = new Node(sid3, firstName3, lastName3, isGrad3, age3);
        doublylinkedlist.insertNode(head, node3);
        
        // Input data for the fourth student
        System.out.print("Enter student ID is: ");
        int sid4 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName4 = input.next();
        System.out.print("Enter last name: ");
        String lastName4 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad4 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age4 = input.nextInt();
        Node node4 = new Node(sid4, firstName4, lastName4, isGrad4, age4);
        doublylinkedlist.insertNode(head, node4);
        
        // Input data for the fifth student
        System.out.print("Enter student ID is: ");
        int sid5 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName5 = input.next();
        System.out.print("Enter last name: ");
        String lastName5 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad5 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age5 = input.nextInt();
        Node node5 = new Node(sid5, firstName5, lastName5, isGrad5, age5);
        doublylinkedlist.insertNode(head, node5);
        
        // Input data for the sixth student
        System.out.print("Enter student ID is: ");
        int sid6 = input.nextInt();
        System.out.print("Enter first name: ");
        String firstName6 = input.next();
        System.out.print("Enter last name: ");
        String lastName6 = input.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad6 = input.nextBoolean();
        System.out.print("Enter student age: ");
        int age6 = input.nextInt();
        Node node6 = new Node(sid6, firstName6, lastName6, isGrad6, age6);
        doublylinkedlist.insertNode(head, node6);

        // Print the doubly linked list
        System.out.println("******************************************");
        System.out.println("Doubly Linked List: ");
        doublylinkedlist.print(head);

        // Print the doubly linked list in reverse order
        System.out.println("******************************************");
        System.out.println("************************************");
        System.out.println("The linked list printed in reverse order is");
        doublylinkedlist.reverseList(head);
    }
}


