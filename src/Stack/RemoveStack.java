package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class RemoveStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s);
		System.out.println("Removing specific ele:");
		int n=sc.nextInt();
		//s.removeElementAt(n);
		System.out.println(s);
		
		ArrayDeque ss=new ArrayDeque();
		ss.add(1);
		ss.add(1);
		
		
		
		
	
		System.out.println(ss);
		

	}

}
