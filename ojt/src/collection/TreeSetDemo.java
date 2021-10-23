package collection;

import java.util.TreeSet;

public class TreeSetDemo {

public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add(10);
		// set.add("hh");

		System.out.println(set.add(10));
		//set.add(null);
		
		//String s=(String) set.get(1);
		//Integer i=(Integer) set.get(0);
		
		System.out.println(set);
		
		System.out.println(set.contains(100));
		
	
		TreeSet<Stu> set2 = new TreeSet<Stu>();
		set2.add(new Stu());
		set2.add(new Stu());
		
		
	
		
	}
}



class Stu
{
	int rno,marks;
}