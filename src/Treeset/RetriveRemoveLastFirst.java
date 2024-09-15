package Treeset;

import java.util.TreeSet;

public class RetriveRemoveLastFirst {
/*
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(56);
		t.add(23);
		t.add(1);
		t.add(89);
		System.out.println(t);
		System.out.println("Retriving first and last val in set:");
		System.out.println("first val:"+t.pollFirst());
		System.out.println("last val:"+t.pollLast());
		System.out.println("after retriving then removed it:");
		System.out.println(t);

	}

}
