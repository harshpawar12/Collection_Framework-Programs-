package Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.add(13);
		p.add(100);
		p.add(89);
		p.add(67);
		p.add(1);
	
		System.out.println(p);
		
		PriorityQueue p1=new PriorityQueue();
		p1.add(1);
		p1.add(2);
		p1.add(3);
		p1.add(4);
		p1.add(5);
		System.out.println(p1);
		*/
		PriorityQueue<String>p2=new PriorityQueue<String>();
		System.out.println("poll emty check:"+p2.poll());
		//System.out.println("remove empty check:"+p2.remove());

		try {
			
		}
		catch(Exception e)
		{
			System.out.println("remove emty check:"+p2.remove());

		}
		
		p2.add("Hp");
		p2.add("pa");
		p2.add("cf");
		p2.add("kk");
		p2.add("zp");
		p2.offer("mp");
		System.out.println(p2);
		System.out.println("get the First Ele not remove:"+p2.peek());
		System.out.println("poll method retrive or Delete Ele:"+p2.poll());
		System.out.println(p2);
		System.out.println("remove or retrive the Ele:"+p2.remove());
		System.out.println(p2);
		System.out.println("it only get the ele not Remove:"+p2.element());
		System.out.println("-----------------");
		System.out.println(p2);
		System.out.println("Using the Iterator:");
		Iterator i=p2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		

	}

}
