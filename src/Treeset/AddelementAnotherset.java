package Treeset;

import java.util.TreeSet;

public class AddelementAnotherset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(56);
		t.add(1);
		t.add(3);
		System.out.println(t);
		TreeSet T=new TreeSet();
		T.add(88);
		T.add(5);
		T.add(0);
		T.add(76);
		System.out.println(T);
		
		System.out.println("adding element in one Treeset:");
		t.addAll(T);
		System.out.println(t);

	}

}
