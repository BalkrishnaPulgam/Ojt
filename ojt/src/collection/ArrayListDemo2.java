package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {

		// Generic Collection makes collection type safe
		// We don't need type casting
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.set(0, 50);
		System.out.println(al);
		al.add(60);
		
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
System.out.println(al.remove(new Integer(20)));
System.out.println(al.remove(new Integer(20)));
System.out.println(al);
		System.out.println(al.remove(Integer.valueOf(20)));
		System.out.println(al);
	//	al.add("Java");
		
		/*
		 	
			Integer i=al.get(0);
			System.out.println(i);
			
		al.set(0, 40);
		
		System.out.println(al);
	
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println(al.remove(new Integer(20)));
		
		System.out.println(al.remove(Integer.valueOf(20)));
		
		//remove(int index){}
		//remove(Object o){}
	
		System.out.println(al);
		  */
		
		System.out.println("Retrieving Elements using for each");
		
		for (Integer integer : al) {
			
			System.out.println(integer.intValue());
		}
		
		System.out.println("Retrieving Elements using for loop ");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	
		System.out.println("Retrieving Elements using iterator ");
		
		Iterator<Integer> itr= al.iterator();
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Integer num =itr.next();
			System.out.println(num.toString());
		}
		
		
		System.out.println("Retrieving Elements using ListIterator ");
		
		
		ListIterator<Integer> lst=al.listIterator();
		
		while(lst.hasNext()) {
			System.out.println(lst.next());
		}
		
		System.out.println("Retrieving Elements using ListIterator in reverse direction:-   ");
		
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
