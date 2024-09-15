package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface upper
{
	public void iscase(String s);
}
public class StringUppercae {
	
	
	public static void main(String[] args) {
		String k="";
		upper ob=(s)->{
			
			s="java";
		
			List< String>al=new ArrayList<String>(Arrays.asList(s));
			
			String l=al.toString().toUpperCase();
			
			System.out.println(l);
		};
		ob.iscase(k);
		
	}

}
