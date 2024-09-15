package vector;

import java.util.Scanner;
import java.util.Vector;

public class RemoveDuplicate {
	
	public Vector<Integer> isdupli(Vector<Integer> v1)
	{
		for(int i=0;i<v1.size();i++)
		{
			for(int j=i+1;j<v1.size();j++)
			{
				if(v1.get(i)==(v1.get(j)))
				{
					v1.remove(j);
					j--;
				}
			}
		}
		
		return v1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector< Integer> v1=new Vector<Integer>();
		for(int i=0;i<5;i++)
		{
			v1.add(sc.nextInt());
			
		}
		
		RemoveDuplicate r=new RemoveDuplicate();
		Vector<Integer>f=r.isdupli(v1);
		System.out.println("duplicate removed:"+f);

	}

}
