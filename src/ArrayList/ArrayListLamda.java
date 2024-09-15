package ArrayList;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface lamb
{
	void list(ArrayList al);
}
public class ArrayListLamda {
	
public static void main(String[] args) {
		
	
	ArrayList al1=new ArrayList();
		lamb ob=(al)->
		{
			al.add(23);
			al.add(32);
			al.add(2);
			al.add(89);
			
			
			System.out.println(Collections.max(al));
			
			
		};
		ob.list(al1);
	
		
		
	}

}
