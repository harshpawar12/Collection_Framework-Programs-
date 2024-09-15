package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class removeOccurences {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,1,3,2));
		
	System.out.println(al);
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
		{
			if(al.get(i).equals(al.get(j)))
			{
				al.remove(j);
				
			}
		}
	}
	System.out.println(al);
		
	}

}
