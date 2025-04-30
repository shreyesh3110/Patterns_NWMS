package inClass;
import java.util.*;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> studentsLinkL=new LinkedList<>();
		studentsLinkL.add("John");
		studentsLinkL.add("Ajay");
		studentsLinkL.add("Rachel");
		studentsLinkL.add("Ross");
		studentsLinkL.add("Sai");
		for(int i=0;i<studentsLinkL.size();i++)
		{
			if(studentsLinkL.get(i)=="John")
			{
				studentsLinkL.set(i, "Chandler");
			}
		}
		studentsLinkL.add("Phoebe");
		ArrayList<String> studArrayL = new ArrayList<>();
		for(int i=0;i<studentsLinkL.size();i++)
		{
			studArrayL.add(studentsLinkL.get(i));
		}
		System.out.println("Array List: "+studArrayL);

	}

}
