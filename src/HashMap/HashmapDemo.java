package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="xyz";
		String s2="xyz";
		
		
		
		int tru=0;
		int fal=0;
		HashMap<Character,Integer>H=new HashMap();
		HashMap<Character,Integer>H1=new HashMap();
	
		for(char ch:s1.toCharArray())
		{
			
			H.put(ch, H.getOrDefault(ch, 0)+1);
			
		}
		for(char ch1:s2.toCharArray())
		{
			H1.put(ch1, H1.getOrDefault(ch1, 0)+1);
			
		}
		if(H.equals(H1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
		
		
		
		

		
		
		//System.out.println(H);

	}

}
