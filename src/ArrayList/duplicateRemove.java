package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import vector.intersection;

public class duplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>al=new ArrayList();
		al.add(12);
		al.add(12);
		al.add(45);
		al.add(23);
		al.add(78);
		System.out.println(al);
		System.out.println("removing the duplicate:");
		TreeSet<Integer>t=new TreeSet(al);
		System.out.println(t); 
	
		System.out.println(	Collections.max(t));
	
		

	}

}
