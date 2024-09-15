package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pellindromnumber {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,1));
		
		List<Integer>l=new ArrayList<Integer>();
		for(int i=al.size()-1;i>=0;i--)
		{
			l.add(al.get(i));
		}
		if(al.equals(l))
		{
			System.out.println("pell");
		}
		else
		{
			System.out.println("not pell");
		}
		
		
		
	}

}
