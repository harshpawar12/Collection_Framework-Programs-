package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removebyindex {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		al.remove(0);
		System.out.println("Removing index");
		System.out.println(al);
		
	}

}
