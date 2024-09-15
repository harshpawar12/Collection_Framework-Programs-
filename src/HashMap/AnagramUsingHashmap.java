package HashMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String:");
		String str=sc.next();
		System.out.println("Enetr the second String:");
		String str2=sc.next();
		HashMap<Character,Integer>H=new HashMap();
		HashMap<Character,Integer>H1=new HashMap();
		for(char ch:str.toCharArray())
		{
			H.put(ch, H.get(0));
		}
		//System.out.println(H);
		for(char ch:str2.toCharArray())
		{
			H1.put(ch, H.get(0));
		}
		if(H.equals(H1))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		//System.out.println(H);
		
		

	}

}
