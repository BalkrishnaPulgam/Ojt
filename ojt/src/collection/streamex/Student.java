package collection.streamex;

public class Student {
	
	int rno, marks;
	static String subName="JAVA";
	
	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	


}
