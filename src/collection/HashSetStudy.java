package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{
	public static void main(String[] args) 
	{
		HashSet<Object> hs=new HashSet<>();
		hs.add(4);
		hs.add(5);
		hs.add(12.3F);
		hs.add(23.4F);
		hs.add('A');
		hs.add('B');
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println("=====================================");
		System.out.println(hs.remove(5));
		System.out.println(hs);
		System.out.println("=====================================");
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=====================================");
		
		for(Object h:hs) 
		{
			System.out.println(h);
		}
		
	}

}
