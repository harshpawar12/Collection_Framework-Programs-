package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//update element in the give Index.
		
		Scanner sc=new Scanner(System.in);
		ArrayList obj=new ArrayList();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		System.out.println(obj);
		System.out.println("Enter the index:");
		int ind
		=sc.nextInt();
		System.out.println("Enetr the element wich updated..");
		int ele=sc.nextInt();
		obj.set(ind, ele); // this are the upadate index.
		System.out.println("Element updated...!!");
		System.out.println(obj);
		
		
			
	}

}
