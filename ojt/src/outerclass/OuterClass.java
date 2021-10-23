package outerclass;

public class OuterClass {
	
	static void display(Demo d)
	{
		d.show();
	}
	
	public static void main(String[] args) {
		
		display(new DemoImpl());
		display(new Demo() 
		{
			
			@Override
			public void show() {
				
				System.out.println("All is well from anonymous inner class");
			}
		});
		
		display(()->System.out.println("All is well from lambda"));
		
	}//main
}// class outer


interface Demo
{
	void show();
}

class DemoImpl implements Demo
{

	@Override
	public void show() {
		
		System.out.println("All is well");
	
		
	}

}
