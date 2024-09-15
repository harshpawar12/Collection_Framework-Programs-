package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pellindrom {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		List<Integer>l=new ArrayList();
		System.out.println(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			l.add(al.get(i));
		}
		if(al.equals(l))
		{
			System.out.println("pellindrom");
		}
		else
		{
			System.out.println("not pellindrom");
		}
		
		for(Integer e:al)
		{
			
			
		}
		
		
		
	}

}
