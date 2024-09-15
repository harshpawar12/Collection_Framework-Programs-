package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj=new ArrayList();
		obj.add(123);
		obj.add("Harsh");
		obj.add("pawar");
		obj.add(true);
		obj.add(123);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}

	}

}
