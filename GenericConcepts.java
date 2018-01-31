package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericConcepts {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("bcd");
		
		for(int i=0; i<list.size(); i++)
		{
			String string = list.get(i);
			System.out.println(string);
		}
		
		Set<String> set= new HashSet<String>();
		set.add("Sai");
		set.add("Jo");
		set.add("Sai");
		
		Set<A> s1=new HashSet<A>();
		s1.add(new A());
		s1.add(new A());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
		String s = it.next();
		System.out.println(s);
		}
		
		Map<String, String> map =new HashMap<String, String>();
		map.put("abc", "ash");
		map.put("sai", "raj");
		
		Set<String> keys = map.keySet();
		Iterator<String> it1 = keys.iterator();
		while(it1.hasNext())
		{
			String key = it1.next();
		    String value = map.get(key);
		    System.out.println(key);
		    System.out.println(value);
		}
		
		
	}
}
