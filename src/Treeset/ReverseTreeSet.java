package Treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(5);
		t.add(14);
		t.add(89);
		t.add(50);
		t.add(8);
		System.out.println(t);
		System.out.println("making Treeset Reverse Order:");
		
		Iterator i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
