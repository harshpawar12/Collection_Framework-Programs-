package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorArrayList 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		
		
		ListIterator li=l.listIterator();
		
		li.next();//1
		
		li.next();//2
		li.previous();//1
		System.out.println(li.previous());//---> 1
		while(li.hasNext())
		{
			li.next();   // cursor going to the Last.
			
		}

		System.out.println("Iterating at the reverse ");
	
		while(li.hasPrevious())  //printing ele has previoues
		{
			System.out.println(li.previous());
		}
	}
	

}
