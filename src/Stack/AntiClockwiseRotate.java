package Stack;

import java.util.Stack;

public class AntiClockwiseRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		System.out.println("Rotating at the Anti-clockwise:");
		int temp=s.get(0);
		
		s.remove(s.get(0));
		
		s.add(s.size(), temp);
		System.out.println(s);
		
	}

}
