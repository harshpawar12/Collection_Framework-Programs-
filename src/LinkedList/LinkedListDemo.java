package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob=new LinkedList();
		ob.add(12);
		ob.add(13);
		ob.add(14);
		ob.add(15);
		ob.add(12);
		
		System.out.println(ob);
		
		
		System.out.println("lastIndex:"+ob.getLast());
		System.out.println(ob.removeFirstOccurrence(12));
		System.out.println(ob.lastIndexOf(12));
		System.out.println(ob.removeFirstOccurrence(12));
		System.out.println(ob);
		
		if(ob.contains(12))
		{
			System.out.println("pre");
		}
		else
		{
			System.out.println("ab");
		}
		Iterator i1= ob.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
	}
}

