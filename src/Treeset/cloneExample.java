package Treeset;

import java.util.TreeSet;

public class cloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(67);
		t.add(1);
		t.add(6);
		t.add(9);
		System.out.println(t);
		
		System.out.println("clone of original:");
		System.out.println(t.clone());
		

	}

}
