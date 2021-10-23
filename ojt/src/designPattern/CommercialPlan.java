package designPattern;

public class CommercialPlan extends EletricityPlan {
	
	public CommercialPlan() {
		super();
		System.out.println("child class constructor");
	}

	@Override
	void setrate() {
		// TODO Auto-generated method stub
		rate=20;

	}

}
