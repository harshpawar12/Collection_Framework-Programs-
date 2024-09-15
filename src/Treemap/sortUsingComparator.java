package Treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class sortUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(Comparator.reverseOrder());
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
		System.out.println(t);
		System.out.println("comparator using Reverse order:");
		for(Map.Entry<Integer,String>e:t.entrySet())
		{
		System.out.println(e.getKey());
		}
	}

}
