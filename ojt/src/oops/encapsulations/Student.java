package oops.encapsulations;

public class Student {
	

	// Encapulsation means grouping variables and methods together in a one unit .
	// Data members should be declared private and methods should be declared public 
	// Java bean class is a fully encapsulated class
	// class Person
	// class Teacher extends Person
	// Teacher is a Person 
	
	private int rno, age;

	public int getRno() {
		return rno;
	}

	public int getAge() {
		return age;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public void setAge(int age) {
		if(age<0) {
			age=0;
		}else {
			
		this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", age=" + age + "]";
	}
	
	
	

}
