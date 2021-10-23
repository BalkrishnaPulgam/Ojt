package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Student implements Comparable<Student>{

	int rno , marks;  // instance variable / object variable
	static String subName="JAVA"; // static variable / class variable
	final int PRN;
	
	
	
	public Student(int rno, int marks, int pRN) {
		super();
		this.rno = rno;
		this.marks = marks;
		PRN = pRN;
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(rno>o.rno)
			return 1;
		if(rno<o.rno)
			return -1;
		else		
		return 0;
	}



	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + ", PRN=" + PRN + "]";
	}
	
	
	public static void main(String[] args) {
		
		Student s= new Student(1, 90,1000);
		Student s1= new Student(2,80,2000);
		System.out.println(Student.subName);
		System.out.println(s.rno);
		
		
	}
	
}



class sort1 implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.rno> o2.rno)
			return 1;
		if(o1.rno<o2.rno)
			return -1;
		else
		return 0;
	}
}


class sort2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks>o2.marks)
			return 1;
		if(o1.marks<o2.marks)
			return -1;
		else
		return 0;
	}
}
	
 class TestStudent{
	public static void main(String[] args) {
		
		
		TreeSet<Student> tr= new TreeSet<Student>(new sort1());
		Student s= new Student(3, 90, 1000);
		Student s1=new Student(1, 95, 2000);
		Student s2=new Student(2, 90, 3000);
		tr.add(s);
		tr.add(s1);
		tr.add(s2);
		
		System.out.println("Sorted by rollnumber :- ");
		
		for (Student student : tr) {
			System.out.println(student);
		}
		
		System.out.println("Sorted by Marks :- ");
		
		TreeSet<Student> tr1= new TreeSet<Student>(new sort2());
		tr1.addAll(tr);
		
		for (Student student : tr1) {
			System.out.println(student);
		}
		
	}
}
	
	


	

