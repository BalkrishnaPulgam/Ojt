package oops.overriding;

public class EqualsOveriding {
	
	public static void main(String[] args) {
		
		Student s1=new Student(1,90); //s1==> [rno=1 marks=90] Student class object
		Student s2=new Student(1,90);// s2,o,s==> [rno=1 marks=90] Student class object
				
				System.out.println(s1==s2);
				System.out.println(s1.equals(s2));
				
				System.out.println(s1);
				// == compare addresses of object
				// equals() from object class , compares addresses present in object references.
				// equals() should be overriden to compare 
				// contents of an object
			}

}
