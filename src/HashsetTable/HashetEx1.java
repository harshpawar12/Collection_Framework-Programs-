package HashsetTable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set  s=new HashSet();
		s.add(12);
		s.add(11);
		s.add(10);
		s.add(9);
		s.add(8);
		System.out.println(s);
		System.out.println("Enetr the element at append:");
		int ele=sc.nextInt();
		s.add(ele);
		System.out.println(s);
	

}
}
