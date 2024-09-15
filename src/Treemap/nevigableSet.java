package Treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class nevigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(Comparator.reverseOrder());
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
		System.out.println(t);
		System.out.println("Nevigable set:");
		System.out.println(t.navigableKeySet());

	}

}
