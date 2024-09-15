package HashsetTable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple";
		String str1="KIWI";
		String str2="DragonFruits";
		String str3="mango";
		System.out.println(str+" "+str.hashCode()%16);
		System.out.println(str1+" "+str1.hashCode()%16);
		System.out.println(str2+" "+str2.hashCode()%16);
		System.out.println(str3+" "+str3.hashCode()%16);

		HashSet<String> s=new HashSet();
		s.add(str);
		s.add(str1);
		s.add(str2);
		s.add(str3);
	
		System.out.println(s);
		HashSet<String>obj=new HashSet<String>();
		obj.add("apple");
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//methods:
/*
 * 1)add("bhg");
 * 
 * 2)ob.addAll(ob1);
 * 3)ob.clear
 * 4)ob.contains("abcd");
 * 5)ob.containsAll(ob1);
 * 6)ob.equvals(ob);
 * 7)ob.isEmpty();
 * 8)ob.remove("abcj");
 * 9)ob.removeAll(ob1);
 * 10)ob.retainAll(ob1);
 */
		
		
		

	}

}
