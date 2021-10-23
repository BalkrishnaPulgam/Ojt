package oops.overriding;

/* Covarient return type :-
 
 In overriding , in place of parent return type , we can have child 
 return type .
 
 * */
public class C {
	
Object m1()
{
	return new Integer(10);
	
}

}//class C ends


class D extends C
{
	String m1()
	{
		return new String("JBK");
		
	}
		
	public static void main(String[] args) {
		
		C obj = new D();
		
	//	int s1= (int) obj.m1();
		
		Object a =obj.m1();
		System.out.println(a);
		
		String s=(String) obj.m1();
		
		System.out.println(s);
		
	}

}