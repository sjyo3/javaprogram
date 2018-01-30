package package1;

import java.util.ArrayList;
import java.util.List;


public class ArrayIndex {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("abc");
		list.add(new A());
		list.add(new B());
		list.add(new ArrayIndex());
		
		int size=list.size();
		System.out.println(size);
		System.out.println(list.get(4));
		
		
		String s=(String)list.get(0);
		System.out.println(s);
		
		A s2=(A)list.get(1);
		System.out.println(s2);
		
		B s1= (B)list.get(2);
		System.out.println(s1);
		
		
		
		
	}

}
 

