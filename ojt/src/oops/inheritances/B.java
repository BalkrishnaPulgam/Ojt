package oops.inheritances;

public class B extends A{
	int a=10;
	void show()
	{
		System.out.println(this.a); // this points to current class object
		System.out.println(super.a);// super points to super class ( parent class object )
	}
	
	void m1()
	{
		System.out.println("Child class method");
	}

}
