package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class charFreqUsingHashmap {
	/*
	 * Java program to count the occurrence 
	 * of each character in a string using Hashmap

Given a string, the task is to write a program
 in Java which prints the number of occurrences of each character in a string.

Examples: 

Input: str = "GeeksForGeeks"
Output:
r 1
s 2
e 4
F 1
G 2
k 2
o 1
	 */
	void occcurence()
	{
		String str = "GeeksForGeeks";
		HashMap<Character,Integer>h=new HashMap();
		
		for(int i=0;i<str.length();i++)
		{
			
			
			if(h.containsKey(str.charAt(i)))
			{
				h.put(str.charAt(i), h.get(str.charAt(i))+1);
			}
			else
			{
				h.put( str.charAt(i),1);
			}
			
			
			
		}
		
		for(Entry<Character,Integer> e:h.entrySet())
		{
			System.out.println(e.getKey()+"-------> "+e.getValue());
		}
	}
	void method()
	{
		String s="hasrh";
		HashMap<Character, Integer>H=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(H.isEmpty())
				
			if(H.containsKey(s.charAt(i)))
			{
				H.put(s.charAt(i), H.get(s.charAt(i))+1);//get the value Retrive
			}
			else
			{
				H.put(s.charAt(i), 1);
			}
		}
		System.out.println("element are:");
		for(Map.Entry<Character, Integer>e:H.entrySet())
		{
			System.out.println(e.getValue()+" "+e.getKey());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charFreqUsingHashmap s=new charFreqUsingHashmap();
		s.occcurence();
		s.method();

	}

}
