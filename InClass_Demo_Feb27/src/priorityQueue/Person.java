package priorityQueue;

public class Person implements Comparable<Person>{
	int priority;
	String name;
	public Person(int val,String data) {
		priority = val;
		name = data;
	}
	@Override
	public int compareTo(Person o) {
		// Least number has the highest priority
		return Integer.compare(this.priority, o.priority);
	}
	
	public String toString() {
		return "Priority "+priority+" Name "+name;
	}

}
