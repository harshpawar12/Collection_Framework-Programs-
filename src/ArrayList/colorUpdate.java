package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class colorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> obj=new ArrayList();
		obj.add("pink");
		obj.add("yellow");
		obj.add("greeen");
		obj.add("red");
		
		
		System.out.println(obj);
		
		System.out.println("Enter the index:");
		int ind=sc.nextInt();
		System.out.println("upadte the given positional alement:");
		String ele=sc.next();
		obj.set(ind, ele);
		System.out.println("the updated element are:");
		System.out.println(obj);
	
		
		
		

	}

}
