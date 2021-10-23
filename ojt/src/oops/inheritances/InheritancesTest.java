package oops.inheritances;

public class InheritancesTest {
	public static void main(String[] args) {

		A aa=new A();
		B bb = new B(); // aa,bb ==> [m1()] B class object
	//	bb=aa;
		aa.m1();
		
	//	A s = new String();
		
			A obj = new B();

			System.out.println(obj.a);// NOT VARIABLE OVERRIDING . Here object reference is important
			
			obj.m1();// METHOD OVERRIDING . Here object is important
		
			//obj.show();
			
			B obj2 = new B();
			obj2.show();
			
			A obj3 = new A();
			obj3.m1();

	}
}
