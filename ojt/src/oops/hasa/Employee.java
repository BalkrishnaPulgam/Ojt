package oops.hasa;

public class Employee {

	// Employee has a variable dept which is of type Department
	// container object
	int eno;
	String ename;
	
	// Aggregation 
	Department dept; // dependent object / contained object
	
	public Employee(int eno, String ename, Department dept) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}
	

}
