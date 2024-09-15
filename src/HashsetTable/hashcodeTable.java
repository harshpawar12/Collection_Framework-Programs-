package HashsetTable;

import java.util.HashSet;
import java.util.Set;

public class hashcodeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java";
		String str2="sharp";
		String str3="python";
		System.out.println(str1+" code:"+str1.hashCode()%16);
		System.out.println(str2+" code:"+str2.hashCode()%16);
		System.out.println(str3+" code:"+str3.hashCode()%16);

		Set<String> s=new HashSet();
		s.add(str1);
		s.add(str2);
		s.add(str3);
		
			System.out.println(" "+s);
			s.remove(str1);
			System.out.println(s);
/*
 * the formula of calculate Hashet.
 * s[0]*31^(n-1)+s[1]*31^(n-2)+s[2]*31^(n-3)+....+s[n-1]*
 * 
 */

		
		

	}

}
