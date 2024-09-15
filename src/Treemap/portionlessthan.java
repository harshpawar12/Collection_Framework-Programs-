package Treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class portionlessthan {
/*
 * 14. Write a Java program to get the portion 
 * of this map whose keys are less than (or equal
 *  to, if inclusive is true) a given key.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(Comparator.reverseOrder());
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
		System.out.println(t);
		System.out.println("portion of given is present or not:");
		System.out.println(t.headMap(70, true));

	}

}
