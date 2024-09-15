package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enetr the Size:");
		ArrayDeque a=new ArrayDeque();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println("Enetr the element:");
		
		System.out.println("the ArrayDeQue are:");
		System.out.println(a);
		a.offerFirst(100);
		a.offerLast(10);
		
		System.out.println(a);
		System.out.println("poll element:"+a.poll());
		System.out.println(a);
		System.out.println("peekFirst:"+a.peekFirst());
		System.out.println("peekFirst:"+a.peekLast());
		System.out.println("offer");
		System.out.println("OfferFirst:"+a.offerFirst(4)+"-->"+a);
		System.out.println("OfferLast:"+a.offerLast(4)+"-->"+a);
		
	
		

	}

}
