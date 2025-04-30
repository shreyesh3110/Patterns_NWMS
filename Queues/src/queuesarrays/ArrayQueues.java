package queuesarrays;

public class ArrayQueues {
	int arr[];
	int size;
	int rear;
	int front;
	int capacity;
	
	public ArrayQueues(int capacity)
	{
		arr = new int[capacity];
		size=0;
		rear=0;
		front=0;
		this.capacity=capacity;
	}
	
	public static void main(String[] args)
	{
		ArrayQueues arr=new ArrayQueues(5);
	}
	
	public void enqueue(int val)
	{
		if(size==capacity)
		{
			System.out.println("queue is full");
		}
	}
	
}
