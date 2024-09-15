package Treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class RangeFromGivenKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(Comparator.reverseOrder());
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
		System.out.println(t);
		System.out.println("Range from given to another key:");
		
		System.out.println(t.subMap(70, 6));
		System.out.println("portion from given to another:");
		System.out.println(t.subMap(15, true, 4, true));
		

	}

}
