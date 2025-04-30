package deques;

import java.util.*;
public class Deques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<>();
		dq.add("viplav"); dq.add("kumar");
		System.out.println("Elements in Deque "+dq);
		dq.addFirst("billa"); 
		System.out.println("Elements in Deque "+dq);
		dq.addLast("reddy");
		System.out.println("Elements in Deque "+dq);
		System.out.println("After using offer");
		dq.offer("ajay");
		System.out.println("Elements in Deque "+dq);
		dq.offerFirst("kum");
		System.out.println("Elements in Deque "+dq);
		dq.offerLast("red");
		System.out.println("Elements in Deque "+dq);
		
		System.out.println("Size of the Deque "+dq.size());
		System.out.println("Removing elements in Deque ");
		dq.remove();
		System.out.println("Elements in Deque "+dq);
		dq.removeFirst();
		System.out.println("Elements in Deque "+dq);
		dq.removeLast();
		System.out.println("Elements in Deque "+dq);
		System.out.println("Removing elements using poll method ");
	
		System.out.println("Elements in Deque "+dq);
		System.out.println("Printing elements using iterator ");
		Iterator<String> itr = dq.iterator();
		Iterator<String> itr2 = dq.descendingIterator();
 		while(itr.hasNext()) {
			System.out.println(" "+itr.next());
		}
 		System.out.println("Printing elements using descendingOrder() ");
 		while(itr2.hasNext()) {
			System.out.println(" "+itr2.next());
		}
	
		
		}

}
