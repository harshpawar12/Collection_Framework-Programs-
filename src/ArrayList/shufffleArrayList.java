package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class shufffleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size:"); 
		ArrayList<Integer> A=new ArrayList<Integer>();
		int size=sc.nextInt();
		System.out.println("Enetr the element in list:");
		for(int i=0;i<size;i++)
		{
			A.add(sc.nextInt());
		}
		Random rd=new Random();
		System.out.println("without shuffling Method");
		for(int i=0;i<A.size();i++)
		{
			int ind=rd.nextInt(A.size());
		/*	int temp=A.get(i);
			A.set(i, A.get(ind));
			A.set(ind, temp);
			*/
			Collections.swap(A, i, ind);
			
		}
		System.out.println(A);

	}

}
