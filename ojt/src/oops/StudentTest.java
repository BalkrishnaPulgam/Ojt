package oops;

public class StudentTest {
	
	public static void main(String[] args) {
		int a;
		a=20; // primitive variable
		 
		System.out.println(a);
		Student kunal , mangesh ; // reference variable declaration
		
		kunal=new Student(1, 90);
		mangesh=new Student(2, 80);
		
	//  kunal(1000) => [rno=1 marks=90] Student class object at address 1000
	//  mangesh(2000) => [rno=2 marks=80] Student class object at address 2000

		System.out.println(kunal);
		System.out.println(kunal.toString());
		
		/* class variable / static variable should be accessed using class name
		 * object variable / instance variable should be accessed using object name
		 *  
		 *  */
			System.out.println(kunal.marks);
			System.out.println(kunal.rno);
			System.out.println(mangesh.marks);
			
			System.out.println(Student.subName);

			kunal.studyMore(10);
			
			System.out.println(kunal);
	}
}
