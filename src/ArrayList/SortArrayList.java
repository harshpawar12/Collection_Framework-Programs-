package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(21);
		a.add(3);
		a.add(46);
		a.add(5);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);

	}

}
