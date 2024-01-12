package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy 
{
		public static void main(String[] args) 
		{
			Vector<String> v= new Vector<>();
			v.add("MH");
			v.add("AP");
			v.add("TN");
			v.add("KA");
			v.add("PB");
			v.add("UP");
			v.add("DL");
	System.out.println(v.capacity());
	System.out.println(v.size());
			v.add("KA");
			v.add("PB");
			//v.add(null);
			//v.add(null);
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println(v);
	System.out.println("------------------------Add Method------------------------------");
	Object v1 =v.clone();
	System.out.println("Clone Vector-->"+v1);
	System.out.println("----------------------------------------------------------");
	System.out.println(v.contains("MH"));//True
	System.out.println(v.contains("XY"));
	System.out.println("----------------------------------------------------------");
	System.out.println(v.elementAt(5));
	System.out.println("----------------------------------------------------------");
	System.out.println(v.equals(v1));
	System.out.println("----------------------------------------------------------");
	v.ensureCapacity(3);
	System.out.println("----------------------------------------------------------");
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println("----------------------------------------------------------");
	System.out.println(v.indexOf("UP"));
	System.out.println(v.indexOf("DL", 4));
	System.out.println("----------------------------------------------------------");
	System.out.println(v);
	v.insertElementAt("KL",9);
	System.out.println(v);
	System.out.println("------------------------Get Method------------------------------");
	System.out.println(v.get(1));
	System.out.println(v.remove(9));
	System.out.println(v.remove("PB"));
	System.out.println("------------------------Set Method------------------------------");
	v.setSize(8);
	System.out.println(v);
	
	System.out.println("------------Travercing Through Vector-----------------------");
	for(String vect:v) 
	{
		System.out.println(vect);
	}
	System.out.println("------------Iterator-----------------------");
	Iterator<String> it= v.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	System.out.println("------------Enumration-----------------------");
		Enumeration<String> ele = v.elements();
		while(ele.hasMoreElements()) 
		{
			System.out.println(ele.nextElement());
		}
	}
}
