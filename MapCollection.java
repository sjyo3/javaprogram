package package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {
	public static void main(String[] args) {
		
	
	Map m = new HashMap();
	m.put("sai", "abd");
	m.put("Jo", "acd");
	
	Set keys=m.keySet();
	Iterator it=keys.iterator();
	while(it.hasNext())
			{
		Object o=it.next();
		if(o instanceof String){
			String key=(String)o;
			String value=(String) m.get(key);
			System.out.println(key);
			System.out.println(value);
		}
	}
	
	
	
//	int size=m.size();
//	System.out.println(size);
//	
//	Object o = m.get("sai");
//	String v= (String) o;
//	System.out.println(v);
//	
//	Object o1=m.get("Jo");
//	String s=(String)o1;
//	System.out.println(s);
	
	
	
	}
}
