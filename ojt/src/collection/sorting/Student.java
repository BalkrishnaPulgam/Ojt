package collection.sorting;

public class Student implements Comparable<Student> {
	
	int rno, marks;

	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(rno>o.rno) 
			return 1;
		if(rno<o.rno)
			return -1;
		else
		return 0;
	}
	

}
