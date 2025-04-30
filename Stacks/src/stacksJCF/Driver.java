package stacksJCF;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray stack=new StackArray(4);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Element popped: "+stack.pop());
		
		stack.push("4");
		System.out.println("Top element: "+stack.peek());
		
		System.out.println("Stack is empty:"+stack.isEmpty());
		stack.pop();
		System.out.println("Stack is empty:"+stack.isEmpty());

	}

}
