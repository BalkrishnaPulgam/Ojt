package oops.encapsulations;

public class Employee {
	int eno ;
	String name;
	
	public int getEno() {
		return eno;
	}
	public String getName() {
		return name;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee(); // obj ==> [eno=0 name=null] Employee class object
		
		System.out.println(obj.getEno()+" "+obj.getName());
		
		obj.setEno(1);
		
		obj.setName("Krishna"); //  obj ==> [eno=1 name=JBK] Employee class object
		
		System.out.println(obj.getEno() + " " + obj.getName());
		
		
	}

}
