package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque a=new ArrayDeque();
		a.add(12);
		a.add(34);
		a.add(23);
		a.add(89);
		System.out.println(a);
		
		Iterator i=a.iterator();
		System.out.println("Iterator are:");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
