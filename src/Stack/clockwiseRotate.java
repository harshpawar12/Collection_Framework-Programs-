package Stack;

import java.util.Stack;

public class clockwiseRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		System.out.println("Rotating at the clockwise:");
		int temp=s.size();
		s.remove(s.size()-1);
		s.add(0, temp);
		System.out.println(s);
		
	}

}
