package Stack;

import java.util.Stack;

public class StringEx {
	
	public static void main(String[] args) {
		
		String s="tom jerry jerry tom";
		String s1[]=s.split(" ");
		
		Stack<String>st=new Stack<String>();
		
			st.add(s1[0]);
		
		for(int i=1;i<s1.length;i++)
		{
			
			if(st.peek().equals(s1[i]))
			{
				st.pop();
			}
			else
			{
				st.push(s1[i]);
			}
		}
		System.out.print(st+"====>"+st.size());
	}

}
