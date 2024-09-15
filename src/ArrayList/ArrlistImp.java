package ArrayList;

import java.util.ArrayList;

public class ArrlistImp {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		
		ArrayList<Integer>al1=new ArrayList();
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i;j<al.size();j++)
			{
				if(al.subList(i, j+1).equals(al1) && al.subList(i, j+1).size()==al1.size())
				{
					System.out.println("true");
					break;
				}
			}
		}
	}

}
