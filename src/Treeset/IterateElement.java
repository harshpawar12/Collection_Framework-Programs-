package Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(1);
		t.add(65);
		t.add(45);
		t.add(99);
		System.out.println(t);
		System.out.println("Displaying using Iterator:");
		Iterator i1=t.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
