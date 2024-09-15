package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		List<Integer>al1=new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
		System.out.println(al1);
		
		System.out.println("Finding the intersection in array:");
		al.addAll(al1);
		System.out.println(al);
		System.out.println("common in that List:");
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					System.out.println(al.get(i));
				}
			}
		}
		
		
		
		
		
	}

}
