package collection;
	
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSetStudy 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet<String>lh =new LinkedHashSet<>();
		lh.add("Pune");
		lh.add("Pune");
		lh.add(null);
		lh.add(null);
		lh.add("Mumbai");
		lh.add("Nagpur");
		lh.add("Aurangabad");
		
		System.out.println(lh);
		System.out.println(lh.size());
		
		System.out.println("=========================================");
		
		for(String l:lh) 
		{
			System.out.println(l);
		}
		
		System.out.println("=========================================");
		
		Iterator<String> it = lh.iterator();
		
		while(it.hasNext()) 
		{
			
			System.out.println(it.next());
		}
		
	}

}
