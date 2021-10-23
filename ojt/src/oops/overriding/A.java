package oops.overriding;

import java.io.FileNotFoundException;

/*
 
  Polymorphism :- It is ability to exist in multiple forms



 * */

public class A {
	

	 void m1(int d) throws FileNotFoundException
	{
		System.out.println("Parent class method");
	}

}




class B extends A
{
	//method definition
	protected void m1(int a) 
	{
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		A obj = new B();
		obj.m1(0);//method call
		
		
	}
}

