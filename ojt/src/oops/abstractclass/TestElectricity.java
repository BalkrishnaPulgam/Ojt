package oops.abstractclass;

import java.util.Calendar;

public class TestElectricity {
	
	public static void main(String[] args) {
		
		ElectricityPlan plan;
		
		plan=new DomesticPlan();
		plan.setRate();
		plan.calculateBill(5);
		
		plan=new CommercialPlan();
		plan.setRate();
		plan.calculateBill(3);
		
		Calendar c=Calendar.getInstance();
		

		// abstraction means hiding implementation 
	}

}
