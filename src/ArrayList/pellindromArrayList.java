package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pellindromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of list:");
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		
		int size=sc.nextInt();
		/*System.out.println("Enetr the eleemnt in List:");
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextLine());
		}
		*/
		System.out.println("Chekimg list are pellindrom:");
		int temp=a.size()-1;
		int c=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).equals(a.get(temp--)))
			{
				c++;
			}
			
		}
		System.out.println(c);
		if(c==a.size())
			System.out.println("pellindrom Arralist:");
		else
			System.out.println("Not pellindrom ArrayList:");

	}

}
