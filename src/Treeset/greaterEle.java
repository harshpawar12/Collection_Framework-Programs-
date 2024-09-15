package Treeset;

import java.util.TreeSet;

public class greaterEle {
/*
 * 10. Write a Java program to get the
 *  element in a tree set which is greater
 *   than or equal to the given element.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet();
		t.add(12);
		t.add(11);
		t.add(56);
		t.add(2);
		t.add(78);
		t.add(90);
		System.out.println(t);
		System.out.println("greater than 15");
		for(int i:t)
		{
			if(i>=15)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("less than 15");
		for(int i:t)
		{
			if(i<=15)
			{
				System.out.println(i);
			}
			
		}
		

	}

}
