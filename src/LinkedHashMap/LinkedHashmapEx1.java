package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LinkedHashmapEx1 {
	
	void associte()
	{
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
		System.out.println("Enetr the Integer:");
		int n=sc.nextInt();
		System.out.println("Enetr the String:");
		String n1=sc.next();
		l.put(n, n1);
		System.out.println("The original list are:");
		System.out.println(l);
	}
	void copying()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
		LinkedHashMap<Integer, String>L=new LinkedHashMap<Integer, String>(l);
		System.out.println("Copying in anothe Map:");
		System.out.println(L);
	}
	void serchKey()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
	
		System.out.println("serched key present or not:");
		System.out.println(	l.containsKey(2));
		
	}
	void serchValue()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
	
		System.out.println("serched value present or not:");
		System.out.println(	l.containsValue("h"));
		
	}
	void getkeys()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
	
		System.out.println("get keying in the map:");
		
		System.out.println(l.keySet());
		
	}
	void deleteAll()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
	
		System.out.println("Delete all element map:");
		l.clear();
		System.out.println(l);
		
	}
	void greatestOrMinKeyvalue()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(l);
		System.out.println("least Key in map:");
		System.out.println(t.pollFirstEntry());
		System.out.println("max Key in map:");
		System.out.println(t.pollLastEntry());
		
		
	}
	void greatestOrMinKey()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(l);
		System.out.println("least Key in map:");
		System.out.println(t.firstKey());
		System.out.println("max Key in map:");
		System.out.println(t.lastKey());
		
		
	}
	void reverseOreder()
	{
		LinkedHashMap<Integer, String>l=new LinkedHashMap<Integer, String>();
		l.put(34, "Apple");
		l.put(2, "Orange");
		l.put(10, "Kiwi");
		l.put(56, "Banana");
		l.put(1, "Dragon Fruit");
		System.out.println(l);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>(l);
		System.out.println("Reverse order:");
		System.out.println(t.descendingKeySet());
		
		
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("select the option:");
		int ch=sc.nextInt();
		LinkedHashmapEx1 L=new LinkedHashmapEx1();
		switch (ch) {
		case 1:
			L.associte();
			break;
		case 2:
			L.copying();
			break;
		case 3:
			L.serchKey();
			break;
		case 4:
			L.serchValue();
			break;
		case 5:
			L.getkeys();
			break;
		case 6:
			L.deleteAll();
			break;
		case 8:
			L.greatestOrMinKeyvalue();
			break;
		case 9:
			L.greatestOrMinKey();
			break;
		case 10:
			L.reverseOreder();
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
		

	}

}
