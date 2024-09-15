package vector;

import java.util.LinkedList;
import java.util.Scanner;

public class removeFAndL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the element");
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		
		System.out.println("Removing first and last element in List");
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		

	}

}
