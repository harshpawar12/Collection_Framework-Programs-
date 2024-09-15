package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(al);
		Collections.reverse(al);
		System.out.println("Reverse the List");
		System.out.println(al);
		
	}

}
