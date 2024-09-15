package Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
// 20 35 15 18 13 10 30
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet T=new TreeSet();
		T.add(20);
		T.add(35);
		T.add(15);
		T.add(18);
		T.add(13);
		T.add(10);
		T.add(30);
		System.out.println(T);
		System.out.println("using Iterator Element:");
		Iterator i=T.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Descending order using Iterator:");
		Iterator i1=T.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		


	}

}
