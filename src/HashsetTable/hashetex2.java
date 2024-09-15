package HashsetTable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet();
		s.add(13);
		s.add(45);
		s.add(76);
		s.add(12);
		s.add(90);
		System.out.println(s);
		
		System.out.println("using Iterator:");
		Iterator i1=s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
		
		
		
		

	}

}
