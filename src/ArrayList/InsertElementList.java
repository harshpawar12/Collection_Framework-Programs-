package ArrayList;

import java.util.ArrayList;

public class InsertElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		obj.add(0,11);

		System.out.println("inserted array are:");
		for(int i=0;i<obj.size();i++)
		{
		}
		System.out.print(obj+" ");
	}
		

	}


