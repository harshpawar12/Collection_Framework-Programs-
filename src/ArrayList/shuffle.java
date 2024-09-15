	package ArrayList;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	
	public class shuffle {
		
		public static void main(String[] args) {
			
			List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
			System.out.println(al);
			System.out.println("shuffling list");
			Collections.shuffle(al);
			System.out.println(al);
	
		}
	
	}
