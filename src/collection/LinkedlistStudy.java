package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistStudy {

	public static void main(String[] args) 
	{		
		LinkedList<Character> l=new LinkedList<>();
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
		l.add('a');
		l.add('b');
		l.add(null);
		l.add(null);
		System.out.println(l);
		System.out.println("-------------------------------------");
		l.addFirst('s');
		l.addLast('z');
		System.out.println("-------------------------------------");
		System.out.println(l.contains('y'));
		System.out.println(l.contains('s'));
		System.out.println("-------------------------------------");
		System.out.println(l);
		System.out.println(l.element());
		System.out.println("-------------------------------------");
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println("-----------------Get Method--------------------");
		System.out.println(l.get(0));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.offer('x'));
		System.out.println(l);
		System.out.println(l.offerFirst('g'));
		System.out.println(l.offerLast('q'));
		System.out.println(l);
		
		System.out.println("-------------------------------------");
		
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}		
		System.out.println("-------------------------------------");
		
		Iterator<Character> l1 = l.iterator();
		while(l1.hasNext()) 
		{
			System.out.println(l1.next());
		}
		System.out.println("-------------------------------------");
		l.clear();
		System.out.println(l);
		System.out.println(l.isEmpty());
		//System.out.println(l.element()); //Elements return "NoSuchElementException"
		System.out.println(l.peek());//Peek Returns Null
		System.out.println(l.poll());//pool returns Null
		System.out.println(l.pop());//pop return "NoSuchElementException"
		
		
		
	}

}
