package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class LowerThanGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(56);
		t.add(1);
		t.add(65);
		t.add(89);
		t.add(23);
		System.out.println(t);
		System.out.println("eneter the Given val:");
		int val=sc.nextInt();
		System.out.println("Lower val compare to given in set:");
		System.out.println(t.floor(val));
		

	}

}
