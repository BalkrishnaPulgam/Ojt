package collection.sorting;

import java.util.TreeSet;

public class TreeSetSorting1 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Student> tr=new TreeSet<Student>();
		
		Student s=new Student(2, 60);
		Student s1=new Student(1, 40);
		Student s2=new Student(3,30);
		
		tr.add(s);
		tr.add(s1);
		tr.add(s2);
		
		System.out.println("Sorted by rollnumber :- ");
		
		for (Student student : tr) {
			System.out.println(student);
		}
		
		TreeSet<Student> tr1=new TreeSet<Student>(new SortOnMarks());
		tr1.addAll(tr);
		System.out.println(tr1);
	}

}
