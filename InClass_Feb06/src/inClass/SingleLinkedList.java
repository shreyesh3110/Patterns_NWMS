package inClass;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one=new Node("Java");
		Node two=new Node("Python");
		Node three=new Node("Ruby");
		Node four=new Node("C++");
		Node five=new Node("Lisp");
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		Node head=one;
		
		display(head);
		
		circularLL(head);
		
		displayCLL(head);
		
		
	}
		
		public static void circularLL(Node head)
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=head;
		}
		
		public static void display(Node head)
		{
			System.out.print("Linked List: ");
			Node temp=head;
			System.out.print(" "+temp.data);
			while(temp.next!=null)
			{
				temp=temp.next;
				System.out.print(" "+temp.data);
			}
			System.out.println("\n");
		}
		
		public static void displayCLL(Node head)
		{
			System.out.print("Circular Linked List: ");
			Node temp=head;
			System.out.print(" "+temp.data);
			while(temp.next!=head)
			{
				temp=temp.next;
				System.out.print(" "+temp.data);
			}
			temp=temp.next;
			System.out.print(" "+temp.data);
			System.out.println("\n");
		}

}
