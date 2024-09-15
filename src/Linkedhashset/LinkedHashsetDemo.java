package Linkedhashset;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet l=new LinkedHashSet();
		l.add(12);
		l.add(50);
		l.add(11);
		l.add(70);
		l.add("java");
		
		l.add(null);// multiple null value not allow.
		l.add(null);
		l.add(12); // duplicates are not allowed.
		System.out.println(l);
		

	}

}
