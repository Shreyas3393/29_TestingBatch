package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistForloops 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		System.out.println("-----------------------");
		
		for (int i=0;i<al.size()-1;i++) // For Loop
		{
			System.out.println(al.get(i));//ArrayList Element Traversing

		}
		System.out.println("-----------------------");
		
		for (Integer a : al)//For Each loop
		{
			System.out.println(a);
		}
		System.out.println("-----------------------");
		
		Iterator<Integer> it= al.iterator();
		System.out.println(it.next());
		/*
		 * System.out.println(it.next());
		 * System.out.println(it.next());
		 * System.out.println(it.next());
		 * System.out.println(it.next());
		 * System.out.println(it.next());
		 */
		//System.out.println(it.next());//This is Extra value of index so... No Such Element Exception
		/*
		 * while(it.hasNext()) //Type 1)While loop Iterator
		 *  {
		 * System.out.println(it.next());
		 *  }
		 */
		//Type 2)
		
		 Integer ele1=it.next(); 
		 Integer ele2=it.next();
		 int sum= ele1 + ele2;
		  System.out.println(sum); 
		  System.out.println(ele1);
		  System.out.println(ele2);
		  System.out.println("------------------------------------------");
		 
		ListIterator <Integer> lit= al.listIterator();
		
		while(lit.hasNext()) 
		{
		}	
		System.out.println("-----Using List Iterator in Reverse Directio-------");
		
		while(lit.hasPrevious()) 
		{
			System.out.println(lit.previous());	
		}
		
				
	}
}
