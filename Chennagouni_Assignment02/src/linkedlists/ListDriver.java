package linkedlists;

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


 // The driver class to test the operations of a SinglyLinkedList class.
 // It allows the user to input student details and perform operations such as
 // inserting nodes, updating student details, swapping nodes, and merging two linked lists.
 
public class ListDriver {

    
     // Main method to drive the execution of various linked list operations.
     // It allows the user to create a linked list of students, update their details, 
     // swap students' positions, and merge two linked lists.
     
    public static void main(String[] args) {
        // Create a SinglyLinkedList object
        SinglyLinkedList studentsList = new SinglyLinkedList();
        Scanner input1 = new Scanner(System.in);

        // Input and insert the first node
        System.out.print("Enter student ID: ");
        int sid1 = input1.nextInt();
        System.out.print("Enter first name: ");
        String firstName = input1.next();
        System.out.print("Enter last name: ");
        String lastName = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int age = input1.nextInt();
        Node node1 = new Node(sid1, firstName, lastName, isGrad, age);
        Node head = node1;

        // Input and insert additional nodes
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid2 = input1.nextInt();
        System.out.print("Enter first name: ");
        String firstName1 = input1.next();
        System.out.print("Enter last name: ");
        String lastName1 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad1 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int age1 = input1.nextInt();
        Node node2 = new Node(sid2, firstName1, lastName1, isGrad1, age1);
        studentsList.insertNode(node1, node2);

        // Continue adding more student nodes
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid3 = input1.nextInt();
        System.out.print("Enter first name: ");
        String firstName2 = input1.next();
        System.out.print("Enter last name: ");
        String lastName2 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad2 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int age2 = input1.nextInt();
        Node node3 = new Node(sid3, firstName2, lastName2, isGrad2, age2);
        studentsList.insertNode(node1, node3);

        // Add one more student
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid4 = input1.nextInt();
        System.out.print("Enter first name: ");
        String firstName3 = input1.next();
        System.out.print("Enter last name: ");
        String lastName3 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad3 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int age3 = input1.nextInt();
        Node node4 = new Node(sid4, firstName3, lastName3, isGrad3, age3);
        studentsList.insertNode(node1, node4);

        // Add a final student to the list
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid5 = input1.nextInt();
        System.out.print("Enter first name: ");
        String firstName4 = input1.next();
        System.out.print("Enter last name: ");
        String lastName4 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad4 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int age4 = input1.nextInt();
        Node node5 = new Node(sid5, firstName4, lastName4, isGrad4, age4);
        System.out.println("******************************************");
        studentsList.insertNode(node1, node5);

        // Print the list after all insertions
        studentsList.print(head);

        // Update details for specific students
        System.out.print("Enter the student ID you want to update: ");
        int sID = input1.nextInt();
        studentsList.updateDetails(head, sID);
        studentsList.print(head);

        System.out.print("Enter the student ID you want to update: ");
        int sID1 = input1.nextInt();
        studentsList.updateDetails(head, sID1);
        studentsList.print(head);

        // Swap two students in the list
        studentsList.swap(head, 3, 5);
        studentsList.print(head);

        // Merge two linked lists and print the result
        System.out.println("******************************************");
        System.out.println("After swapping the student: ");
        studentsList.print(head);
        System.out.println("******************************************");
        System.out.println("Reading inputs for second linked list:");

        // Create and populate second list
        SinglyLinkedList secondStudentsList = new SinglyLinkedList();
        System.out.print("Enter student ID: ");
        int ssid = input1.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName = input1.next();
        System.out.print("Enter last name: ");
        String slastName = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int s_age = input1.nextInt();
        Node snode1 = new Node(ssid, sfirstName, slastName, sisGrad, s_age);
        Node head1 = snode1;

        // Add more students to the second list
        System.out.print("Enter student ID: ");
        int ssid1 = input1.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName1 = input1.next();
        System.out.print("Enter last name: ");
        String slastName1 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad1 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int sage1 = input1.nextInt();
        Node snode2 = new Node(ssid1, sfirstName1, slastName1, sisGrad1, sage1);
        secondStudentsList.insertNode(snode1, snode2);

        // Add another student to the second list
        System.out.print("Enter student ID: ");
        int ssid2 = input1.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName2 = input1.next();
        System.out.print("Enter last name: ");
        String slastName2 = input1.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad2 = input1.nextBoolean();
        System.out.print("Enter student age: ");
        int sage2 = input1.nextInt();
        Node snode3 = new Node(ssid2, sfirstName2, slastName2, sisGrad2, sage2);
        secondStudentsList.insertNode(snode1, snode3);

        // Merge the two lists and print
        System.out.println("Linked List after merging is");
        System.out.println("******************************************");
        System.out.println("After merging the two linked lists: ");
        head = studentsList.merge(head, head1);
        studentsList.print(head);
    }
}
