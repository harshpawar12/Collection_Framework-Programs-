package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class pellindromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>l=new LinkedList<Integer>();
		System.out.println("Enetr the size");
		int size=sc.nextInt();
		System.out.println("Enter the Element in list:");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("checkiing the pellindrom..");
		int temp=l.size()-1;
		System.out.println(temp);
		int c=0;
		/*for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals(l.get(temp--)))
			{
				c++;
			}
			
		}
		if(c==l.size())
		{
			System.out.println("pellindrom List");
		}
		else
			System.out.println("Not pellindrom List");
			*/
		int temp1=0;
		for(int i=l.size()-1;i>=0;i--)
		{
			temp+=l.get(i);
			if(temp==l.size())
			{
				System.out.println("pellindrom");
				break;
			}
			else
			{
				System.out.println("not pellindrom");
				break;
			}
			
		}
		
		
		

	}

}
