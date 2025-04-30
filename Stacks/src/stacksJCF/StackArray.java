package stacksJCF;

public class StackArray {
	int top;
	String[] arr1;
	int capacity;
	
	public StackArray(int size)
	{
		capacity=size;
		arr1=new String[size];
		top=-1;
	}
	
	public void push(String str)
	{
		if(top+1==capacity)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			arr1[top]=str;
			System.out.println("Element pushed: "+arr1[top]);
		}
	}
	
	public String pop()
	{
		if(top == -1)
		{
			return "Stack is empty";
		}
		else
		{
		String popElement = arr1[top];
		top--;
		return popElement;
		}
		
	}

	public String peek()
	{
		if(top==-1) {
			return null;
		}
		else
		return arr1[top];
	}
	
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
}
