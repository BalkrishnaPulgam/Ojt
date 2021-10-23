package oops.hasa;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee employee= new Employee(1, "Krishna", new Department(2, "Design"));
		System.out.println(employee);
		
		Employee2 employee2 = new Employee2(2, "Radha");
		System.out.println(employee2);
	}
	

}
