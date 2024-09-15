package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortList {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
		System.out.println(al);

		System.out.println("Ascending order");
		Collections.sort(al);
		System.out.println(al);
		
	}

}
