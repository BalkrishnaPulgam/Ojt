package collection.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> al=Arrays.asList(1,2,3,4);
		
	Stream<Integer> stream	=al.stream();
	
	Stream<Integer> filterstream=stream.filter(Integer-> Integer>2);
	
	
	filterstream.forEach(System.out::println);
	
	
	
	al.stream().filter(Integer->Integer>2).forEach(System.out::println);
	
	
	List<Student> al2= Arrays.asList(new Student(1, 80),new Student(2, 70), new Student(3, 50) );
	
	al2.stream().filter(student->student.marks>60).forEach(System.out::println);
	
	}

}
