package vector;

import java.util.ArrayList;
import java.util.Vector;

public class vectorToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		ArrayList A=new ArrayList(v1);
		System.out.println("vector to arrayList Conversion:");
		System.out.println(A);

	}

}
