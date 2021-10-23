package collection.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapExample {
	
	public static void main(String[] args) {
		
		
		List<Integer> al= Arrays.asList(1,2,3,4);
		
		al.stream().filter(Integer->Integer>2).forEach(System.out::println);
		al.stream().map(Integer->(Integer*2)).forEach(System.out::println);
		
		List<Student> al2=Arrays.asList(new Student(1, 80),new Student(2, 70), new Student(3, 56));
		
		al2.stream().map(student->(student.marks*2)).forEach(System.out::println);
		
		al2.stream().map(student->student.marks).reduce((a,b)->a*b);
		

		Stream<Student> stream3 = al2.stream();
		
		Stream<Integer> marksStream=stream3.map(student -> student.marks);
			
		Optional<Integer> op = marksStream.reduce((a,b)->a*b);; // [ [280000] Integer class object ] Optional Object

		if(op.isPresent()) {
			System.out.println(op.get().toString());
			
			
			
		Stream<Student> stream4 = al2.stream();
		Stream<Integer> marksStream1=stream4.map(student->student.marks);
		Optional<Integer> op1=	marksStream1.max((no1,no2)->(no1>no2)? 1:(no1<no2)? -1:0);
		
		if(op1.isPresent()) {
			System.out.println((op1.get().toString()));
		}
		}
	}

}
