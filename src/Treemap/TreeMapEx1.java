package Treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx1 {
	
	public static final String Integer = null;


	void OneToFive(int ch)
	{
		
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("copying in secondTreeMap:");
		TreeMap<Integer, String>T=new TreeMap<Integer, String>(t);
		System.out.println(T);
		System.out.println("serched the key:");
		System.out.println("key are present or not :");
		System.out.println(t.containsKey(1));
		System.out.println("value are present or not :");

		
		System.out.println(t.containsValue("GREEN"));
		System.out.println("keys in set:");
		System.out.println(t.keySet());;
		
	}
	void delete()
	{
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		t.clear();
		System.out.println(t);
	}
	void GreatAndSmallkeyval()
	{
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("least value & key in map:");
		System.out.println(t.pollFirstEntry());
		System.out.println("max value & key in map:");
		System.out.println(t.pollLastEntry());
		
		
	}	
	void LowestHighKey()
	{
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("least  key in map:");
		System.out.println(t.firstKey());
		System.out.println("max key in map:");
		System.out.println(t.lastKey());
		
		
	}	
	void ReverseOrder()
	{
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("keys in descending order:");
		System.out.println(t.descendingKeySet());
		
		
	}
	void associtedGretestKey()
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("Enetr the keys:");
		int ch=sc.nextInt();
		
		System.out.println("associted to GreterKey with GivenKey");
		System.out.println(t.ceilingKey(ch));
		System.out.println("associted to smallerKey with GivenKey");
		System.out.println(t.floorKey(ch));
		
		
		
	}
	void PortionLess()
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		t.put(23, "Red");
		t.put(4, "GREEN");
		t.put(70, "GREAY");
		t.put(65, "WHITE");
		t.put(6, "VIOLET");
		System.out.println(t);
		System.out.println("Strictly less than porion given:");
		
		System.out.println(t.headMap(70));
	
		for(Map.Entry<Integer, String>e:t.entrySet())
		{
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number:");
		int ch=sc.nextInt();
		TreeMapEx1 t=new TreeMapEx1();
		switch(ch)
		{
		case 1:
			t.OneToFive(ch);
			break;
		case 6:
			t.delete();
			break;
		case 7:
			t.GreatAndSmallkeyval();
			break;
		case 8:
			t.LowestHighKey();
			break;
		case 9:
			t.ReverseOrder();
			break;
		case 10:
			t.ReverseOrder();
			break;
		case 11:
			t.associtedGretestKey();;
			break;
		case 12:
			t.PortionLess();
			break;
		}
		
	
		
		

	}

}
