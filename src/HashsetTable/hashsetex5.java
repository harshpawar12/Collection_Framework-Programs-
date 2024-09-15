package HashsetTable;

import java.util.HashSet;
import java.util.Set;

public class hashsetex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s=new HashSet();
		s.add("h");
		s.add("a");
		s.add("j");
		s.add("k");
		s.add("L");
		System.out.println(s);
		String []str=s.toArray(new String[0]);
	
		System.out.println("convert hashet to String array");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i].charAt(0));
		}
		
		
		
		
		
		
		

	}

}
