package collection.sorting.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		
		//ArrayList al = new ArrayList();
		
				ArrayList<Student> al= new ArrayList<Student>();
				
				Student s1=new Student(); // s1 => [name=null age=0 phones=null] Student class object
				s1.name=new String("abc");
				s1.age=25;
				s1.phones= new Phone[] {new Phone(9879875,10000,"pune"),new Phone(6879875,20000,"pune")};
				//new int[] {10,20};
				Student s2=new Student(); 
				s2.name=new String("xyz");
				s2.age=30;
				s2.phones= new Phone[] {new Phone(9979875,40000,"mumbai"),new Phone(54879875,70000,"mumbai")};
				
				al.add(s1);
				al.add(s2);// s2.compare(s1)
				
						
			// for each Student object from arraylist as
				
				for(Student object:al)
				{
					System.out.println(object);
				}
				
				
				System.out.println();
				System.out.println();
				
				
				System.out.println("Sorting the ArrayList on the basis of Age using comparator interface:====");
				
				System.out.println();
				System.out.println();
				
				
				Collections.sort(al,new AgeComparator());
				
				// using iterator we can read list in forward direction only . we use next() from iterator 
				// using ListIterator we can read list in forward and backward both direction  . we use next() & previous() from ListIterator	
				
				ListIterator<Student> itr= al.listIterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				System.out.println();
				System.out.println();
				
				System.out.println("Sorting the ArrayList  on the  basis of Cost using Comparator interface: ");
				
				System.out.println();
				System.out.println();
				
			
				Collections.sort(al, new CostComparator());
				ListIterator<Student> itr1= al.listIterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
				
				//hm.remove(1)
		
	}

}
