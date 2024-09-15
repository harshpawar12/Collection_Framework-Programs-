package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkContains {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		System.out.println("checking contains");
		if(al.contains(1))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
	}

}
