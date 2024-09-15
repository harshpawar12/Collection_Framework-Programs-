package vector;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the eleemnt:");
		ArrayList l=new ArrayList();
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		l.add(sc.nextInt());
		System.out.println("Removing eleemnt:");
		l.removeAll(l);
		System.out.println(l);

	}

}
