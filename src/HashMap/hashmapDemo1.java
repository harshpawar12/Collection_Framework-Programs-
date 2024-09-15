package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String>h=new HashMap<Integer, String>();
		h.put(2, "java");
		h.put(1, "javac");
		h.put(3, "bin");
		System.out.println(h);
		
		for(Map.Entry<Integer, String>e:h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
