package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minList {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(6,4,3,2,1,8));
		
		System.out.println("min in list");
		System.out.println(Collections.min(al));
	}

}
