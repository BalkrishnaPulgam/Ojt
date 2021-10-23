package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass {
	
public static void main(String[] args) {
		
		ArrayList<Student>  arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2,80));
		arrayList.add(new Student(1,70));
		
		Collections.sort(arrayList);
	
		
		System.out.println(arrayList);
		
		
		arrayList=new ArrayList<Student>(arrayList);
		
		Collections.sort(arrayList, new SortOnRno());
		
		System.out.println("Objects sorted on Roll Numbers :- ");
		System.out.println(arrayList);
		
		Collections.sort(arrayList, new SortOnMarks());
		
		System.out.println("Objects sorted on Marks :- ");
		System.out.println(arrayList);
		
		
	
	}

}
