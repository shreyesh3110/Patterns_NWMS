package queues;
import java.util.*;

public class QueuesJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> ql=new LinkedList<>();
		Queue<Integer> qa=new ArrayDeque<>();
		Queue<String> qp=new PriorityQueue<>(Comparator.reverseOrder());
		
		System.out.println("Is the queue linked list empty? "+ql.isEmpty());
		ql.add(12);
		ql.add(24);
		ql.add(36);
		System.out.println("Queue Linked List: "+ql);
		ql.remove();
		System.out.println("Queue Linked List: "+ql);
		ql.poll();
		System.out.println("After Removing element using poll: "+ql);
		ql.offer(45);
		ql.offer(50);
		ql.offer(55);
		System.out.println("Queue Linked List: "+ql);
		System.out.println("Element method in queue: "+ql.element());
		System.out.println("Peek method in queue: "+ql.peek());
		
		//ArrayDeque
		System.out.println();
		System.out.println("ArrayDqueue ");
		qa.add(12);
		qa.offer(23);
		qa.add(29);
		qa.offer(33);
		System.out.println("Queue using ArrayDqueue: "+qa);
		
		System.out.println("Removing element from the queue: "+qa.remove());
		System.out.println("Polling element from the queue: "+qa.poll());
		System.out.println("Polling element from the queue: "+qa.poll());
		System.out.println("Polling element from the queue: "+qa.poll());
		System.out.println("Polling element from the queue: "+qa.poll());
		
		System.out.println("Using peek in an empty queue: "+qa.peek());
		//System.out.println("Element method in empty queue: "+qa.element()); //Throws an exception
		
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		adq.add(12);
		adq.addFirst(24);
		adq.addLast(34);
		adq.offer(12);
		adq.offerFirst(24);
		adq.offerLast(34);
		System.out.println("Printing ArrayDeque"+adq);
		System.out.println("Access element using get: "+adq.getFirst());
		System.out.println("Access element using get: "+adq.getLast());
		
		//PriorityQueue
		System.out.println();
		System.out.println("PriorityQueue ");
		qp.add("one");
		qp.add("two");
		qp.add("three");
		qp.add("four");
		qp.add("five");
		System.out.println("PriorityQueue: "+qp);
		qp.remove();
		System.out.println("Queue after removing: "+qp);
		System.out.println("Element method in queue: "+qp.element());
		
		System.out.println();
		
		PriorityQueue<String> name=new PriorityQueue<>();
		name.add("yeshu");
		name.add("ashwith");
		name.add("durga");
		name.add("siddu");
		System.out.println(name);
		

	}

}
