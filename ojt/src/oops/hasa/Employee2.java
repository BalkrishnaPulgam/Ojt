package oops.hasa;

public class Employee2 {
	
	// Employee has a variable dept which is of type Department
	// container object
	int eno;
	String ename;
	
	// Composition
	Department dept=new Department(2, "Design");  // dependent object / contained object

	public Employee2(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee2 [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}

	
}
