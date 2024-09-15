package ArrayList;

import java.util.ArrayList;
import java.util.List;

interface A{
	public void isk(List<Integer> al);
}
public class AvgNumber {

	
	public static void main(String[] args) {
		List<Integer>f=new ArrayList<Integer>();
		A ob=(al)->{
			
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(4);
			
			double s=al.stream().mapToInt(i->i).average().getAsDouble();
			
			System.out.println(s);
		};
		ob.isk(f);
	}
}
