package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

interface sord
{
	public void issort(List< String> al);
}
public class SortStringLength {
	
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		sord ob=(al)->
		{
			al.add("zebra");
			al.add(" apple");
			al.add("mango");
			al.add("banana");
			al.add(" orange");
			
			List <String>a=al.stream().map(i->i).sorted().toList();

			System.out.println(a);
		};
		ob.issort(l);
	}

}
