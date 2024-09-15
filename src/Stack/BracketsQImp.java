package Stack;

import java.util.Stack;

/*
 * Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘
 */
public class BracketsQImp {
	
	public static boolean isbal(String str)
	{
		Stack<Character> s=new Stack();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='['||ch[i]=='('||ch[i]=='{')
			{
				s.push(ch[i]);
			}
			else
				
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					char top=s.pop();
					if(ch[i]==')' && top!='('||
					   ch[i]=='}' && top!='{'||
					   ch[i]==']' && top!='[')
					{
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[(])";
			String str1="[()]{}{[()()]()}";
		if(BracketsQImp.isbal(str1))
		{
			System.out.println("Brackets are balanced");
		}
		else
		{
			System.out.println("bracket its not balanced");
		}
		

	}

}
