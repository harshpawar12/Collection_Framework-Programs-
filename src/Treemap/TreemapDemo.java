package Treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(15, "RED");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		
	//	System.out.println(t);
	
	
		//System.out.println(t.floorEntry(5));
		
		System.out.println(t.get(15));
		
		System.out.println("Interator using:");
		System.out.println("keys and Values:");
		for(Map.Entry<Integer, String>e:t.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		

	}

}
