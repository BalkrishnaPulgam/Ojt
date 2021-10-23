package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

class Student3 implements Comparable<Student3> {
	
	int rno, marks;
	
	

	public Student3(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}


	// Student3 d = new Student3(1,80)
	 // d.toString()
	@Override
	public String toString() {
		return "Student3 [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
	//-3 -2 -1 0 1 2 3
	 // s2.compareTo(s1)
	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		if(this.rno> o.rno)
			return 1;
		if(this.rno<o.rno)
			return -1;
		else
		return 0;
	}

}



class DemoSorting
{

public static void main(String[] args) {

	TreeSet<Student3>  treeset = new TreeSet<Student3>();
	
	Student3 s1= new Student3(2,80);
	Student3 s2= new Student3(1,90);
	Student3 s3= new Student3(1,80);


	//  1 3  0
	treeset.add(s1);
	treeset.add(s2);// s2.compareTo(s1)
	treeset.add(s3);
	
	System.out.println(treeset);

}
}


class MyCollection implements Collection{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
}