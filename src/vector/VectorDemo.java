package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	
	void add1()
	{
		
		Vector v=new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(0,100);//1) add the index position ele
		System.out.println(v);
	}
	void getindex()
	{
		Vector v=new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		 
		
		System.out.println("index element are:"+v.get(0));
	}
	void contains()
	{
		Vector v=new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		 if(v.contains(14))
		{
			System.out.println("present containt...");
		}
		else
		{
			System.out.println("not present");
		}
}
	void firstLast()
	{
		Vector v=new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		 
		System.out.println("first ele:"+v.firstElement());
		System.out.println("last ele:"+v.lastElement());
}
	void replace()
	{
		Vector v=new Vector();
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		System.out.println(v);
		v.removeAll(v);
		System.out.println("Removed list:");
		System.out.println(v);
		
	}
	void arr()
	{
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(4);
		v1.add(7);
		Object a[]=v1.toArray();
		System.out.println("Conversion vector to array:");
		System.out.println(Arrays.toString(a));
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorDemo v=new VectorDemo();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enetr the number");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			v.add1();
			break;
		case 2:
			v.getindex();
			break;
		case 3:
			v.contains();
			break;
		case 4:
			v.firstLast();
			break;
		case 5:
			v.replace();;
			break;
		case 6:
			v.arr();
			break;
		}
		
		
		
	}

}
