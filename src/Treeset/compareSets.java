package Treeset;

import java.util.Collections;
import java.util.TreeSet;

public class compareSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(1);
		t.add(56);
		t.add(89);
		t.add(45);
		t.add(90);
		System.out.println(t);
		TreeSet T=new TreeSet();
		T.add(12);
		T.add(1);
		T.add(56);
		T.add(89);
		T.add(45);
		T.add(90);
		System.out.println(T);
		System.out.println("All the contain present:");
		if(t.containsAll(T))
		{
			System.out.println("Treset are same");
		}
		else
			System.out.println("not same both");
		

	}

}
