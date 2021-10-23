package oops.hasa;

public class Department {
	
	int dno;
	String dname;
	
	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}
	
	

}
