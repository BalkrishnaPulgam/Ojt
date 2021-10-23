package designPattern;

public abstract class EletricityPlan {
	
	int rate;
	abstract void setrate();
	
	void calculate(int unit) {
	int billAmount = unit*rate;
	System.out.println(billAmount);
	}
	
	static EletricityPlan getPlan(String planType) {
		if(planType.equals("domestic")) {
			return new DomesticPlan();
		}
		if(planType.equals("commercial")) {
			return new CommercialPlan();
		}
		else 
			return null;
	}

}//abstract class ends
