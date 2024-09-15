package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Even
{
	public void islist(List<Integer> al);
}
public class LambEven {

	
	public static void main(String[] args) {
		
		List<Integer>a1=new ArrayList<Integer>();
		Even ob=(al)->{
			
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(5);
			
		List a=al.stream().filter(i->i%2==0).toList();
		System.out.println("Even in List:"+a);
		
		
			
		};
		ob.islist(a1);
		
	}
	
	
	

}
