package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("making List to array:");
		Object[] s=al.toArray();
		
		System.out.println(Arrays.toString(s));
	}
}
