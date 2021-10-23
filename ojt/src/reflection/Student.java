package reflection;

public class Student {
	
	public int rno;
	int marks;

	private int b;
	
	public Student() {
		System.out.println("default constructor called");
	}
	
	private void show()
	{
		System.out.println("Hello");
	}
	
	public void display(int a , String n)
	{
		System.out.println(a + " " + n);
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}

	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}
	

}
