package oops.overriding;

public class Parents {
	
int a=10;
	
	void acceptPayement()
	{
		System.out.println("Accept payement in cash only");
	}

}// class ends


class Childs extends Parents
{
	
	int a=30;

	void acceptPayement()
	{
		System.out.println("Accept payement in card , online , UPI");
	}
	
	
	public static void main(String[] args) {
		
		Parents p = new Childs();// p===>[acceptPayement()] Childs class object
		p.acceptPayement();

		System.out.println(p.a);
		
		p=new Parents(); // p==>[acceptPayement()] Parents class object
		p.acceptPayement();
	
		System.out.println(p.a);// reference is considered as NO Variable Overriding  
		
		Childs c = new Childs();
		System.out.println(c.a);
		
	}
}