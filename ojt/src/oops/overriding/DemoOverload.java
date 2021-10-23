package oops.overriding;

public class DemoOverload {

/* 
  	having multiple methods with same name but different arguments is method overloading
 
 	polymorphism is an ability to exist in multiple forms
 	
	It is an compile time polymorphism/early binding/staic binding 
	as method call is bound with method definition
	based on arguments 
	
	*/
	
	static  void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
		
	static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
			add(10,20);
			add(10,20,30);
	}

}
