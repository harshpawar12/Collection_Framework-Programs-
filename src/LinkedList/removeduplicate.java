package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size:");
		LinkedList<Integer>l=new LinkedList<Integer>();
		int size=sc.nextInt();
		System.out.println("Enetr the element:");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("Duplicate removes:");
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					l.remove(j);
				}
			}
		}
		System.out.println(l);

	}

}
