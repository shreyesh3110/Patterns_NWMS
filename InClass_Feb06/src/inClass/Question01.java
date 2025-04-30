package inClass;
import java.util.*;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrListMarks = new ArrayList<>();
		Random rand=new Random();
		for(int i=0;i<10;i++)
		{
			arrListMarks.add(rand.nextInt(30));
		}
		
		arrListMarks.set(4, 99);
		
		LinkedList<Integer> linkedListMarks=new LinkedList<>();
		for(int i=0;i<arrListMarks.size();i++)
		{
			linkedListMarks.add(arrListMarks.get(i));
		}
		System.out.print("Linked List: "+linkedListMarks);
	}

}

