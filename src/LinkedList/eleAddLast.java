package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class eleAddLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj=new LinkedList();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		System.out.println(obj);
		obj.addLast(23);
		System.out.println(obj);
		
		//Iterator the element.
		
		Iterator i1=obj.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
