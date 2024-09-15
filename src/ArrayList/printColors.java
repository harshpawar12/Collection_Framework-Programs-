package ArrayList;

import java.util.ArrayList;

public class printColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj=new ArrayList();
		obj.add("Yellow");
		obj.add("Purple");
		obj.add("violet");
		obj.add("white");
		System.out.println("colors are:");
		for(int i=0;i<obj.size();i++)
		{
			System.out.print(i+" "+obj.get(i)+" ");
		}

	}

}
