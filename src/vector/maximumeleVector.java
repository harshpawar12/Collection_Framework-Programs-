package vector;

import java.util.Scanner;
import java.util.Vector;

public class maximumeleVector {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Vector <Integer>v1=new Vector<Integer>();
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
		}
		System.out.println();
		int max=0;
		for(int i=0;i<v1.size();i++)
		{
			if(v1.get(i)>max)
			{
				max=v1.get(i);
			}
			
		}
		System.out.println("maximum is:"+max);
	}

}
