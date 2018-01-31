package package1;

import java.util.ArrayList;
import java.util.List;


public class ArrayIndex {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("abc");
		list.add("jo");
		list.add(new A());
		list.add(new B());
		list.add(new ArrayIndex());
		
		for(int i=0; i<list.size(); i++)
		{
			String s= (String)list.get(i);
			System.out.println(s);
		}
		
		
		
		
	}

}
 

