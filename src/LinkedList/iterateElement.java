package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class iterateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(5);
		Collections.disjoint(l, l);
		System.out.println(l);
		
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(i+" Displaying element: "+l.get(i));
		}
		/*System.out.println("Shuffling the eelement");
		Collections.shuffle(l); // shuffling elemnt
		System.out.println(l);
		Collections.reverse(l);
		System.out.println("Reverse the List");
		System.out.println(l);*/
		System.out.println("Add allList :in second");
		l.addAll(l);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);

		


	}

}
