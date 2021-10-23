package oops;

public class Student {

	int rno, marks; // object variables / instance variable / non-static variables

	static String subName = "Java"; // static variable / class variable

	public Student(int rno, int marks) {

		this.rno = rno;
		this.marks = marks;
	}


	void studyMore(int noOfHours)
	{
		if(noOfHours>8)
		{
			marks=marks+70;
		}
		else if(noOfHours<8)
		{
			marks=marks+50;
		}
		else
		{
			marks=0;
		}
	}


	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	


}
