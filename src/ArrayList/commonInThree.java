package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commonInThree {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		List<Integer>al1=new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
		System.out.println(al1);
		List<Integer>al2=new ArrayList<Integer>(Arrays.asList(4,5,9,10));
		System.out.println(al2);
		al.addAll(al1);
		al.addAll(al2);
		System.out.println(al);
		System.out.println("duplicate in three array:");
		for(int i=0;i<al.size();i++)
		{
			int c=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					c++;
					al.get(j).equals(null);
				}
			}
			if(c!=1)
			{
				if(al.get(i)!=null)
				System.out.print(al.get(i)+" ");
			}
		}
		
		
	}

}
