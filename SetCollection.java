package package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {
		
		Set obj = new HashSet();
		obj.add("sai");
		boolean b=obj.add("jo");
		System.out.println(b);
		obj.add(new SetCollection());
		boolean b1=obj.add("sai");
		System.out.println(b1);
		int size=obj.size();
		System.out.println(size);
		
		Iterator it = obj.iterator();
		while(it.hasNext())
		{
			Object o =it.next();
			if(o instanceof String){
				String s= (String) o;
				System.out.println(s);
			}

			else if(o instanceof SetCollection)
			{
				SetCollection obj1=(SetCollection) o;
				System.out.println(obj1);
			}
		
		
		}
		
		
		
	}

}
