package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckList {
	
	public static void main(String[] args) {
		
		List al=new ArrayList(Arrays.asList(1,2,3));
		
		if(al.isEmpty())
		{
			System.out.print("list are empty");
		}
		else
		{
			System.out.println("list are not empty");
		}
		
	}

}
