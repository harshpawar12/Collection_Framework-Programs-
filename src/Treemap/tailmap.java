package Treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class tailmap {
	public static void main(String[] args) {
		/*
		 * 23. Write a Java prog
		 * ram to get a portion of a m
		 * ap whose keys are greater than
		 *  or equal to a given key.
		 */
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(Comparator.reverseOrder());
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
		System.out.println(t);
		System.out.println("Getting portion given to greteror equval:");
		System.out.println(t.tailMap(6));
		
	}

}
