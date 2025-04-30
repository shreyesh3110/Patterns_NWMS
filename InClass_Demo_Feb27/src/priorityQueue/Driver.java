package priorityQueue;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		PriorityQueue<Person> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//Comparator.reverseOrder() method will reverse the priority from low to high
		pq.add(new Person(1,"viplav"));
		pq.add(new Person(2,"kumar"));
		pq.add(new Person(3,"reddy"));
		pq.add(new Person(4,"billa"));
		
		System.out.println("Priority Queue "+pq);
		

	}

}
