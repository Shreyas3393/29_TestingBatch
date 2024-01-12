package collection;

import java.util.TreeSet;

public class TreeSetStudy {
	
	public static void main(String[] args) 
	{
	
		TreeSet<Object> ts = new TreeSet<>();
		ts.add("Pune");
		//ts.add(1);//class cast exception
		//ts.add(null);//Null Pointer Exception
		ts.add("Dhule");
		ts.add("Amravatiune");
		ts.add("Chandrapur");
		ts.add("Parbhani");
		ts.add("Satara");
		ts.add("pandharpur");
		System.out.println(ts);
		System.out.println("-----------------------------------");
		
		TreeSet<Integer>ts2 = new TreeSet<>();
		ts2.add(67);
		ts2.add(63);
		ts2.add(61);
		ts2.add(69);
		ts2.add(62);
		ts2.add(60);
		System.out.println(ts2);
		System.out.println("--------------------------------------");
		System.out.println(ts2.ceiling(61));
		System.out.println(ts2.floor(61));
		System.out.println(ts2.first());
		System.out.println(ts2.last());
		System.out.println(ts2.size());
		System.out.println(ts2.remove(69));
		System.out.println(ts2.remove(72));
		System.out.println(ts2.higher(63));
		System.out.println(ts2.lower(60));
		
		System.out.println("---------Iterator------------");
		for(Integer t:ts2)
		{
			System.out.println(t);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
