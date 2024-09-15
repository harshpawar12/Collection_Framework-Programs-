package Treeset;

import java.nio.file.spi.FileSystemProvider;
import java.util.TreeSet;

public class getFirstLastval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(2);
		t.add(89);
		t.add(23);
		t.add(45);
		t.add(34);
		
	System.out.println(t);
	System.out.println("first val:"+t.pollFirst());
	System.out.println("Last val:"+t.pollLast());

	}

}
