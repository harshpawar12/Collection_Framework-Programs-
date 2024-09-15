package Treeset;

import java.util.TreeSet;

public class TreesetMethods {

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
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(100);
		t.add(99);
		T.addAll(t);
		System.out.println("Add Ele:"+T);
		
		System.out.println("ceiling method:"+T.ceiling(14));
		System.out.println("Floor method:"+T.floor(14));
		System.out.println("Higher method:"+T.higher(15));
		System.out.println("Lower method:"+T.lower(10));
		
		System.out.println("PollFirst:"+T.pollFirst());
		System.out.println("PollLast:"+T.pollLast());
		System.out.println("After the polls method remove polls Ele:"+T);
		System.out.println("contains method:"+T.contains(99));
		System.out.println("check 2 String containsAll:");
		System.out.println("ContainAll method:"+T.containsAll(t));
		
		
		

	}

}
