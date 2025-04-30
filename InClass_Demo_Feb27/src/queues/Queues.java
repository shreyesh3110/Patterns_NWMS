package queues;

import java.util.*;
public class Queues {
	int rear;
	int front;
	int[] arr;
	int size;
	int capacity; //size of the array
	
	public Queues(int cap) {
		rear = -1;
		front = 0;
		size = 0;
		arr = new int[cap];
		capacity = cap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues(5);
		q.enqueue(23);
		q.enqueue(12);
		q.enqueue(24);
		q.enqueue(32);
		q.enqueue(33);
		q.enqueue(36);
		q.dequeue();
		q.dequeue();
		q.enqueue(36);
		q.peek();
				
	}
	
	public void enqueue(int val) {
		if(size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear+1)%capacity;
		arr[rear] = val;
		System.out.println("Inserted element "+arr[rear]);
		size = size+1;
	}
	
	public void dequeue() {
		System.out.println("Removed element "+arr[front]);
		front = (front+1)%capacity;
		size = size-1;
	}
	
	public void peek() {
		System.out.println("Peeking element "+arr[front]);
	}


}
