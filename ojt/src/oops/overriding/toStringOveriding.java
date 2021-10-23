package oops.overriding;

//class Object  is super class of all classes in java 
//using any java object we can call methods from class Object . That's why it's name is Object .

//class String

//Object class toString() displays className and hashcode of an object .
//Hence , We override toString() to describe state of an object .

//hashcode is an unique number assigned by JVM for idenfying object .

//Object class hashCode() calculates hashcode based on memory address .

//Hence we should override hashCode() if we want .


class Student
{
	int rno,marks;
	
	Student(int r,int m)
	{
		rno=r;
		marks=m;
	}

	
	
	//Student s1=new Student(1,90); //s1==> [rno=1 marks=90 equals()] Student class object
	//Student s2=new Student(1,90);// s2,o,s==> [rno=1 marks=90 equals()] Student class object
	//s1.equals(s2)
	
		
	
//toString() should return string having information about object state ( values of variables from the object ) 
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
}//class student


class toStringOveridings {

	public static void main(String[] args) {
				
		Student sanjay=new Student(1,90);
			
		System.out.println(sanjay.toString());
		
		
	}
}
