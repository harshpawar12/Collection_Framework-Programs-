package HashsetTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashetEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>h=new HashSet<Integer>();
		
		h.add(1);
		h.add(2);
		h.add(13);
		h.add(41);
		h.add(15);
	//	System.out.println(h);
		TreeSet<Integer> t=new TreeSet(h);
		System.out.println(t);
		for(int j:t)
		{
			if(j<7)
			{
				System.out.println(j);
			}
		}
		

	}

}
