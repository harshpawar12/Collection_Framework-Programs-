package Treeset;

import java.util.TreeSet;

public class lessthan7number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet();
		t.add(12);
		t.add(1);
		t.add(45);
		t.add(7);
		t.add(26);
		
		System.out.println(t);
		System.out.println("lessThan 7 elements:");
		for(int i:t)
		{
			if(i<7)
			{
				System.out.println(i);
			}
		}

	}

}
