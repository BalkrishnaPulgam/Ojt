package oops.inheritances;

public class A {
	
	enum TimeZone {EST, CST, MST, PST }
	
	int a=20;
	
	void m1()
	{
	
				
		System.out.println("Parent class method");
	}
	
	
	
	public static void main(String[] args) {
		
		A obj1 = new A();
		A obj2=new A();
		
		obj1=obj2;
		
			String s = "-";
			switch(TimeZone.CST) {
				case EST: s += "e";
				case CST: s += "c";
				case MST: s += "m";
				default: s += "X";
				case PST: s += "p";
			}
			System.out.println(s);
		
	}
	

}
