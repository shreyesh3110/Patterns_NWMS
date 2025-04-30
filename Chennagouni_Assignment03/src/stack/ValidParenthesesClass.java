package stack;
import java.util.*;

/**
* Class: 44642-02 Application Design Patterns and Frameworks
* @author Shreyesh Chennagouni
* SID:S576283
* Description: Making sure everything works
* Due: 02/25/2025
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under my circumstances.
*/

public class ValidParenthesesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any string: ");
		//Taking input from the user
		String userInput=input.nextLine();
		char[] arr=userInput.toCharArray();
		Stack<String> operands=new Stack<>();
		Stack<String> operators=new Stack<>();
		Stack<String> braces=new Stack<>();
		boolean correctString=true;
		
		//Using for loop to push different elements to different stacks
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='0' && arr[i]<='9') || (arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
			{
				operands.push(String.valueOf(arr[i]));
			}
			
			else if((arr[i]=='+') || (arr[i]=='-') || (arr[i]=='*') || (arr[i]=='/') || (arr[i]=='%'))
			{
				operators.push(String.valueOf(arr[i]));
			}
			
			else if((arr[i]=='[') || (arr[i]==']') || (arr[i]=='(') || (arr[i]==')') || (arr[i]=='{') || (arr[i]=='}'))
			{
				braces.push(String.valueOf(arr[i]));
			}
			
			else if((arr[i]=='!')||(arr[i]=='@')||(arr[i]=='#')||(arr[i]=='$')||(arr[i]=='^')||(arr[i]=='&'))
			{
				correctString=false;
			}
		}
		
		//Checking whether the given string is correct or not
		if(correctString==true)
		{
			//printing three stacks
			System.out.println("Operands stack: "+operands);
			System.out.println("Operators stack: "+operators);
			System.out.println("Braces stack: "+braces);
			
			//Checking whether the braces are correct or not
			int count1=0;
			int count2=0;
			int count3=0;
			while(braces.isEmpty()==false)
			{
				String element=braces.pop();
				//System.out.println("element"+element);
				if(element.equals("{"))
				{
					count1++;
					//System.out.println("Count1");
				}
				else if(element.equals("}"))
				{
					count1--;
					//System.out.println("Count1");
				}
				else if(element.equals("["))
				{
					count2++;
					//System.out.println("Count2");
				}
				else if(element.equals("]"))
				{
					count2--;
					//System.out.println("Count2");
				}
				else if(element.equals("("))
				{
					count3++;
					//System.out.println("Count3");
				}
				else if(element.equals(")"))
				{
					count3--;
					//System.out.println("Count3");
				}
			}
			
			//System.out.println("count1: "+count1+" count2: "+count2+" count3: "+count3);
			
			if(count1==0 && count2==0 && count3==0)
			{
				System.out.println("The braces are closed correctly");
			}
			else
			{
				System.out.println("The braces aren't closed correctly");
			}
		}
		else
		{
			System.out.println("Input String must contain numbers, alphabets and mathematical operators.");
		}
		
		input.close();
	}

}
