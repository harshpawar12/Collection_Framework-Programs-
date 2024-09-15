package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheindexPositionele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList ob=new ArrayList();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(null);
		
		for(int i=0;i<ob.size();i++)
		{
			System.out.println(ob.get(i));
		}
		System.out.println("the index of elment is:");
		int ind=sc.nextInt();
		
		System.out.println("Element at"+ind+":--"+ob.get(ind));
		
		

	}

}
