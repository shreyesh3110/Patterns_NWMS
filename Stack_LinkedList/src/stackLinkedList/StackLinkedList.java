package stackLinkedList;

public class StackLinkedList {

	public static Node top=null;
	public static Node head=top ;
	public static int size=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(23);
		push(32);
		push(15);
		System.out.println("Top element: "+top.val);
		stackPrint();
		pop();
		System.out.println();
		stackPrint();
		System.out.println();
		System.out.println("Top element: "+top.val);
		
		System.out.println(peek());

	}
	
	public static void push(int data)
	{
		Node node=new Node(data);
		
		if(top==null)
		{
			head=node;
			top=node;
			size=size+1;
		}
		//if top is not empty we will link the new node to top
		else
		{
			top.next=node;
			top=node;
		}
	}
	
	public static void stackPrint()
	{
		Node curr=head;
		System.out.println("Elements in Stack: ");
		while(curr!=null)
		{
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
	}
	
//	public static void pop()
//	{
//		Node curr=head;
//		Node prev=null;
//		while(curr.next!=null)
//		{
//			prev=curr;
//			curr=curr.next;
//		}
//		prev.next=null;
//		top=prev;
//		size=size-1;
//		
//	}
	
	public static void pop()
	{
		Node prev=head;
		while(prev.next!=top)
		{
			prev=prev.next;
		}
		prev.next=null;
		top=prev;
		size=size-1;
		
	}
	
	
	public static int peek()
	{
		return top.val;
	}

}
