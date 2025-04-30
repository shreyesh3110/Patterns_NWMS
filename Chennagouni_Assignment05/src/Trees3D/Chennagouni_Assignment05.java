package Trees3D;
import java.util.*;


/**
* Class: 44642-02 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID:S576283
* Description: Making sure everything works
* Due: 04/17/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/

public class Chennagouni_Assignment05 {

	static class Node {
        int k1, k2, k3;
        Node left, right, horizontal;
        

        public Node(int k1, int k2, int k3) {
            this.k1 = k1;
            this.k2 = k2;
            this.k3 = k3;
            
        }

        @Override
        public String toString() {
            return "(" + k1 + "-" + k2 + "-" + k3 + ")";
        }
    }

    static class ThreeDTree {
        Node root;

        public ThreeDTree() {
            root = null;
        }

        public void insert(int k1, int k2, int k3) {
            root = insertRec(root, k1, k2, k3);
        }

        private Node insertRec(Node root, int k1, int k2, int k3) {
            if (root == null) {
                return new Node(k1, k2, k3);
            }

            if (k1 == root.k1) {
                root.horizontal = insertHorizontal(root.horizontal, k1, k2, k3);
            } else if (k1 < root.k1) {
                root.left = insertRec(root.left, k1, k2, k3);
            } else {
                root.right = insertRec(root.right, k1, k2, k3);
            }
            

            return root;
        }

        private Node insertHorizontal(Node root, int k1, int k2, int k3) {
            if (root == null) {
                return new Node(k1, k2, k3);
            }

            if (k2 == root.k2 && k3 == root.k3) {
                return root; 
            }

            root.horizontal = insertHorizontal(root.horizontal, k1, k2, k3);
            return root;
        }

        public void traverse() {
            System.out.println("Tree Traversal Result:");
            traverseRec(root);
        }

        private void traverseRec(Node root) {
            if (root == null) return;

            traverseRec(root.left);

            Node current = root;
            while (current != null) {
                System.out.println(current);
                current = current.horizontal;
            }

            traverseRec(root.right);
        }
    }

    public static int[][] generateRandomPhoneNumbers(int count) {
        int[][] phoneNumbers = new int[count][3];
        for (int i = 0; i < count; i++) {
            phoneNumbers[i][0] = 100 + (int) (Math.random() * 900);
            phoneNumbers[i][1] = 100 + (int) (Math.random() * 900);
            phoneNumbers[i][2] = 1000 + (int) (Math.random() * 9000);
        }
        return phoneNumbers;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] recordsSet1 = {
	            {3, 1, 2}, {1, 2, 2}, {2, 2, 2}, {5, 2, 2}, {4, 1, 2},
	            {5, 1, 1}, {5, 3, 2}, {5, 3, 1}, {5, 3, 3}, {5, 2, 3}
	        };

	        System.out.println("Testing with First Set of 10 Records");
	        ThreeDTree tree1 = new ThreeDTree();
	        for (int[] record : recordsSet1) {
	            tree1.insert(record[0], record[1], record[2]);
	        }
	        tree1.traverse();

	        int[][] recordsSet2 = {
	            {5, 2, 2}, {5, 2, 3}, {5, 2, 4}, {5, 2, 5}, {5, 3, 1},
	            {5, 3, 2}, {5, 3, 99}, {7, 4, 3}, {5, 3, 87}, {6, 4, 3},
	            {1, 7, 4}, {5, 4, 3}, {5, 4, 1}
	        };

	        System.out.println("\nTesting with Second Set of 13 Records");
	        ThreeDTree tree2 = new ThreeDTree();
	        for (int[] record : recordsSet2) {
	            tree2.insert(record[0], record[1], record[2]);
	        }
	        tree2.traverse();

	        System.out.println("\nTesting with 10 Random Phone Numbers");
	        int[][] randomPhones10 = generateRandomPhoneNumbers(10);
	        ThreeDTree randomTree10 = new ThreeDTree();
	        for (int[] phone : randomPhones10) {
	        	 System.out.println("Inserting: (" + phone[0] + "-" + phone[1] + "-" + phone[2] + ")");
	            randomTree10.insert(phone[0], phone[1], phone[2]);
	        }
	        randomTree10.traverse();

	        System.out.println("\nTesting with 100 Random Phone Numbers");
	        int[][] randomPhones100 = generateRandomPhoneNumbers(100);
	        ThreeDTree randomTree100 = new ThreeDTree();
	        for (int[] phone : randomPhones100) {
	        	 System.out.println("Inserting: (" + phone[0] + "-" + phone[1] + "-" + phone[2] + ")");
	            randomTree100.insert(phone[0], phone[1], phone[2]);
	        }
	        System.out.println("Inserted and Traversed 100 random phone numbers");

	        System.out.println("\nTesting with 500 Random Phone Numbers");
	        int[][] randomPhones500 = generateRandomPhoneNumbers(500);
	        ThreeDTree randomTree500 = new ThreeDTree();
	        for (int[] phone : randomPhones500) {
	        	System.out.println("Inserting: (" + phone[0] + "-" + phone[1] + "-" + phone[2] + ")");
	            randomTree500.insert(phone[0], phone[1], phone[2]);
	        }
	        System.out.println("Inserted and Traversed 500 random phone numbers");

	}

}
