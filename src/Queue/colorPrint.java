package Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class colorPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>p=new PriorityQueue<String>();
		p.add("pink");
		p.add("orange");
		p.add("grenn");
		p.add("violet");
		System.out.println("color printing in Queue");
		System.out.println(p);
		System.out.println("Iterator using:");
		Iterator i1=p.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		PriorityQueue<String>p1=new PriorityQueue<String>();
		
		p1.add("orange");
		p1.add("chocklate");
		System.out.println(p1);
		System.out.println("Adding the 2 Queue:");
		p.addAll(p1);
		System.out.println(p);
		System.out.println("Inserting in Queue:");
		p.offer("Black");
		System.out.println(p);
		System.out.println("Removing element in priority Queue:");
		p.removeAll(p1);
		System.out.println(p1);
		System.out.println("count of priority Que:");
		System.out.println(p1.size());
		System.out.println("-------------");
		System.out.println("compairing Two priority Queue:");
		PriorityQueue<String>pr=new PriorityQueue<String>();
		pr.add("black");
		pr.add("white");
		System.out.println(pr);
		PriorityQueue<String>pr1=new PriorityQueue<String>();
		pr1.add("black");
		pr1.add("white");
		System.out.println(pr1);
		if(pr.containsAll(pr1))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		System.out.println("Retriving the First Element:");
		System.out.println("first ele:"+p1.element());
		System.out.println("Retrive or remove the element:");
		System.out.println(pr1.remove());
		System.out.println("original array:");
		System.out.println(pr1);
		System.out.println("converting the Queue to array:");
		PriorityQueue <Integer>I=new PriorityQueue<>();
		I.add(12);
		I.add(34);
		I.add(56);
		I.add(89);
		I.add(12);
		
		
		System.out.println(I);
		
		Object ch[]=I.toArray();
		System.out.println("making That:");
		System.out.println(Arrays.toString(ch));
		
		System.out.println("------------------");
		System.out.println("Descending making:");
		TreeSet<Integer> t=new TreeSet<Integer>(I);
		
		Iterator i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		

	}

}
