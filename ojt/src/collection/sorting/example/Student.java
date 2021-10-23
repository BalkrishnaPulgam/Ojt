package collection.sorting.example;

import java.util.Arrays;

//Student has a phone . It is a has a relationship

// Assignment is :- modify this program considering one student may have multiple phones .

public class Student {
	
		String name;
		int age;
		public Phone[] phones;
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", phones=" + Arrays.toString(phones) + "]";
		}
		
		// Annotation gives more information ( metadata )  about variable / method / class / interface to compiler / JVM .
		// @Override annotions gives more information about toString() to compiler
		// Here using @Override annoation we are informing compiler that we are overriding toString() of super class Object .
		
		
	public static void main(String[] args) {
		System.out.println( new Student());
	}

	
}
