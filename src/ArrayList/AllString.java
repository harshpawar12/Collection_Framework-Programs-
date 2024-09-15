package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface al
{
	public void aslist(String a);
}
public class AllString {
	
	public static void main(String[] args) {
		String n="";
		al o=(a)->{
			
			a="java is simple";
		List al=new ArrayList(Arrays.asList(a));
		
		String d=al.toString().toUpperCase();
		System.out.println(d);
			
		};
		o.aslist(n);
	}

}
