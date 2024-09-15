package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unionList {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		List<Integer>al1=new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
		System.out.println(al1);
		al.addAll(al1);
		System.out.println("union array");
		for(int i=0;i<al.size();i++)
		{
			int c=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					c++;
			
				}
			}
			if(c==1)
			{
				System.out.print(al.get(i)+" ");
			}
		}
		
		
	}

}
