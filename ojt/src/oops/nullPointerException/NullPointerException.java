package oops.nullPointerException;

import java.util.ArrayList;

public class NullPointerException {
	
	// Global variables are initialized if we are not initializing them.
	
	int a=20; // primitive variables stores value
	
	static ArrayList al;  // al is object reference variable which stores address of an object
	
	public static void main(String[] args) {
		
		System.out.println(al);
		
		//when we use null reference to call any method or variable, we get null NullPointerException.
				
		al.get(0); //NullPointerException will occur as we are calling method using null reference.
		
		al=new ArrayList(); //al 1000==>[add() remove() [10]] Arraylist class object at address 1000
		al.add(10);
		
		if(al!=null) {
			System.out.println(al.get(0));
			System.out.println("All is well");
		}
		
	}
}
