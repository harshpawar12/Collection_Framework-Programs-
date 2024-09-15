package HashsetTable;

import java.util.ArrayList;
import java.util.HashSet;

public class HashetDupliRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(11);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(11);
		a.add(3);
		a.add(null);
		a.add(null);
		HashSet hb=new HashSet(a);
		System.out.println("after duplaicate delting:using hashet");
		System.out.println(hb);

	}

}
