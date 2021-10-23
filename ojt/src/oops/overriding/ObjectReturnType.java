package oops.overriding;


import java.util.HashMap;

/*

 Whenever you find any find with return type Object , then create subclass reference so that you will be able
 
 to call both subclass and super class methods .
 
 Whenever you find Object class think about type casting .
 
 ***IMP Rule :- When method return type is Object then it can return any java object .
 
 
 Demo d = new Demo();
 //  d===> [m1(),m2()] Demo class object
// d.m1(); //  [ Hello World  length() ]   String class object
 
 
 */
class Demo
{
	Object m1()
	{
		return new String("Hello World");
		
	}
	
	Object m2()
	{
		return new StringBuffer("Java");
		
	}
}

public class ObjectReturnType {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		Object o=d.m2(); // o,s==> [java append()] StringBuffer class object
		
		String s=(String)o;// ClassCastException occurs  , when reference type and object type are not related
		                  // Here reference s is of type String and object is of type  StringBuffer and they are not related .
		
		
		System.out.println(s.length());
		
// String and StringBuffer are not parent - child .

//System.out.println(o.length());
			
		
		String s2=(String)d.m1();//s2=> [Hello World length()] String class object
		
		System.out.println(s2.length());
		
		
		StringBuffer sb=(StringBuffer)d.m2();
		System.out.println(sb.length());
		
		
		
		
		
		
		
	}
}
