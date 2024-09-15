package HashMap;

import java.util.Scanner;

public class aman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String");
		String s=sc.next();
		System.out.println("serch perticular Ele:");
		String j=sc.next();
		int l=s.length();
		String s2=s.replace(j, "");
		int l2=s2.length();
		
		System.out.println(l-l2);
		
	}

}
