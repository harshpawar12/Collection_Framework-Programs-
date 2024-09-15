package HashMap;

import java.util.HashMap;
import java.util.Map;

public class StringFrequsingHashmap {
	
	StringFrequsingHashmap()
	{
		String str="java is simple java";
		String s1[]=str.split(" ");
		System.out.println("cont is:"+s1.length);
		HashMap<String, Integer>h=new HashMap<String, Integer>();
		for(int i=0;i<s1.length;i++)
		{
			if(h.containsKey(s1[i]))
			{
				h.put(s1[i], h.get(s1[i])+1);
			}
			else
			{
				h.put(s1[i], 1);
			}
		}
		System.out.println("----------");
		for(Map.Entry<String, Integer>e:h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		StringFrequsingHashmap g=new StringFrequsingHashmap();

	}

}
