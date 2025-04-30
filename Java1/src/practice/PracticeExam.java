package practice;
import java.util.*;

public class PracticeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qobj=new LinkedList<>();
		Stack<Integer> stk=new Stack<>();
		for(int i=1;i<=5;i++)
		{
			qobj.offer(i*2);
		}
		
		System.out.println("Initial Queue: "+qobj);
		int qsize=qobj.size();
		for(int i=0;i<qsize;i++)
		{
			int a=qobj.poll();
			stk.push(a);
			//stk.push(qobj.poll());
		}
		System.out.println("Initial Stack: "+stk);
		
		
		int result=0;
		while(stk.isEmpty()!=true)
		{
			int popped=stk.pop();
			result=result+popped;
			qobj.offer(popped);
		}
		
		System.out.println("The value of Result: "+result);
		System.out.println("Final Stack: "+stk);
		System.out.println("Final Queue: "+qobj);
	}
	
}
