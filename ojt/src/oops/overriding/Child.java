package oops.overriding;

public class Child extends Parent {

	private void m1()
	{
		
	}
	
	
//	 void m2()
//	{
//		
//	}
	 
	 static void m3()
		{
			System.out.println("Child class method");
		}
	 
	 
	 
	 public static void main(String[] args) {
		
		 Parent p = new Child();
		 p.m3();
		 
		 p=new Parent();
		 p.m3();
		 
		 Child d = new Child();
		 d.m3();
		 
		 
	}

}
