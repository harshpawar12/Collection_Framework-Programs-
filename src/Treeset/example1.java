package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class example1 {
/*
 * Write a Java program to create a tree set,
 *  add some colors (strings)
 *  and print out the tree set.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size:");
		TreeSet<String> t=new TreeSet<String>();
		int size=sc.nextInt();
		System.out.println("Enetr the colors:");
		for(int i=0;i<size;i++)
		{
			t.add(sc.next());
		}
		System.out.println(t);
		

	}

}
