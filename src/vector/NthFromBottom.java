package vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class NthFromBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		Stack<Integer> s=new Stack<Integer>();
		System.out.println("Enetr the elelment in stack:");
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		System.out.println("Original stack");
		System.out.println(s);
		System.out.println("Enter the nTh position in stack");
		int I=sc.nextInt();
		System.out.println("The bottom ele is:");
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(I));
			break;
		}
		
		
		

	}

}
