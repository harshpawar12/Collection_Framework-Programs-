package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashmapAllExample {
	
	void map()
	{
		HashMap<Integer,String>hb=new HashMap();
		hb.put(5, "Apple");
		hb.put(7, "kiwi");
		hb.put(2, "banana");
		hb.put(24, "orange");
		hb.put(15, "Grapes");
		System.out.println(hb);
		
		System.out.println("Iterator using Hashmap:");
		System.out.println();
		for(Map.Entry<Integer, String>e:hb.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}

	}
	void count()
	{

		HashMap<Integer, String>H=new HashMap();
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		System.out.println(H.size());
	}
	void copying()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("First map:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		
		System.out.println("second map is:");

		HashMap<Integer, String>H1=new HashMap();
		H1.put(5, "coconut");
		H1.put(7, "Dragon_Fruits");
		
		System.out.println(H);
		H.putAll(H1);
		System.out.println("merged map:");
		System.out.println(H);
	}
	void removeAll()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		H.clear();
		System.out.println(H);

	}
	void isEmpty()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		H.isEmpty();
		System.out.println(H.isEmpty());
	}
	void shallowCopy()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		System.out.println("making the copy:");
		H.clone();
		System.out.println(H);
	}
	void contains()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		System.out.println("checking the contains for key:");
		
		System.out.println(H.containsKey(2));
System.out.println("checking the contains for value:");
		
		System.out.println(H.containsValue("kiwi"));
	}
	void Entryset()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		Set s=H.entrySet();
		System.out.println("Creating the setView:");
		System.out.println(H);
	}
	void specificValkey()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		System.out.println("getting the val of key:");
		System.out.println(H.get(7));
	}
	void setkeys()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		Set s=H.keySet();
		System.out.println("SetView of the Key:");
		System.out.println(s);
	}
	void getcollection()
	{
		HashMap<Integer, String>H=new HashMap();
		System.out.println("map is:");
		H.put(5, "Apple");
		H.put(7, "kiwi");
		H.put(2, "banana");
		H.put(24, "orange");
		H.put(15, "Grapes");
		System.out.println(H);
		System.out.println("Collection of values:");
		for(Map.Entry<Integer, String>e:H.entrySet())
		{
			System.out.println(e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("List:");
		System.out.println("1. Write a Java program to associate the specified value with the specified key in a HashMap.\r\n"
				+ "\r\n"
				+ "2. Write a Java program to count the number of key-value (size) mappings in a map.\r\n"
				+ "\r\n"
				+ "3. Write a Java program to copy all mappings from the specified map to another map.\r\n"
				+ "\r\n"
				+ "4. Write a Java program to remove all mappings from a map.\r\n"
				+ "\r\n"
				+ "5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
		System.out.println("6. Write a Java program to get a shallow copy of a HashMap instance.\r\n"
				+ "\r\n"
				+ "7. Write a Java program to test if a map contains a mapping for the specified key.\r\n"
				+ "\r\n"
				+ "8. Write a Java program to test if a map contains a mapping for the specified value.\r\n"
				+ "\r\n"
				+ "9. Write a Java program to create a set view of the mappings contained in a map.\r\n"
				+ "\r\n"
				+ "10. Write a Java program to get the value of a specified key in a map.\r\n"
				+ "\r\n"
				+ "11. Write a Java program to get a set view of the keys contained in this map.\r\n"
				+ "\r\n"
				+ "12. Write a Java program to get a collection view of the values contained in this map.");
		
		HashmapAllExample H=new HashmapAllExample();
		int ch=-1;
		do
		{
			System.out.println("Enter the number:");
			 ch=sc.nextInt();
			 System.out.println("------------------");
		
		switch(ch)
		{
		case 1:
			H.map();
			break;
		case 2:
			H.count();
			break;
		case 3:
			H.copying();
			break;
		case 4:
		
			H.removeAll();
			break;
		case 5:
			H.isEmpty();
			break;
		case 6:
		H.shallowCopy();
		break;
		case 7:
			H.contains();
			break;
		case 8:
			H.contains();
			break;
		case 9:
			H.Entryset();
			break;
		case 10:
			H.specificValkey();
			break;
		case 11:
			H.setkeys();
			break;
		case 12:
			H.getcollection();
			break;
			default :
				System.out.println("Invalid Input...!!!");
				break;
		
		
			
			
		}
		}while(ch!=0);
		
		
	}

}
