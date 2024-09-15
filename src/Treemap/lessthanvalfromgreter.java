package Treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lessthanvalfromgreter {
	
	public  String isgreater(TreeMap t,Scanner sc)
	{
		
		for(int i=1;i<=5;i++)
		{
			t.put(sc.nextInt(), sc.next());
		}
		System.out.println("Enetr the key");
		return  t.higherEntry(sc.nextInt())+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, String>t=new TreeMap<Integer, String>();
		lessthanvalfromgreter h=new lessthanvalfromgreter();
		
		System.out.println("Strictly less than Given key:");
		System.out.println(h.isgreater(t, sc));
		
		
		
		

	}

}
