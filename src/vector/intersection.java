package vector;

import java.util.Vector;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v1=new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(33);
		v1.add(33);
		v1.add(53);
		Vector<Integer> v2=new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(49);
		v1.add(37);
		v1.add(55);
		
		for(int i=0;i<v1.size();i++)
		{
			for(int j=0;j<v2.size();j++)
			{
				if(v1.get(i)==v2.get(j))
				{
					System.out.println(v1.get(i));
				}
			}
		}

	}
}
