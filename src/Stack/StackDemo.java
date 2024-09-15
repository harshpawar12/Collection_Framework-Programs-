package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(15);
	
		System.out.println(s);
		s.pop();
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		

	}

}
