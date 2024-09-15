package HashsetTable;

import java.util.HashSet;
import java.util.Set;

public class HashetUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add(12);
		s.add(16);
		s.add(45);
		s.add(89);
		s.add(76);
		Set s1=new HashSet();
		s1.add(14);
		s1.add(16);
		s1.add(4);
		s1.add(9);
		s1.add(6);
		System.out.println("union in the hashset....");
		s.addAll(s1);
		System.out.println(s);
		s.equals(s1);
	
		
			
		
		
		

	}

}
