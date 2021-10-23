package designPattern;

import java.util.Calendar;

public class EletricityPlanTest {
	
	public static void main(String[] args) {
		
		EletricityPlan plan = null ;
		
		plan.getPlan("domestic");
		plan.setrate();
		plan.calculate(10);
		
		plan=EletricityPlan.getPlan("commercial");
		plan.setrate();
		plan.calculate(12);
		
		Calendar c=Calendar.getInstance();
		
		// Here Calendar is abstract class whose object is not possible
		// getInstance() will give object of child class of Calendar class whose name we do not know
		// Hence we create reference of Parent class Calendar .
		// In abstraction we hide the implementation
		// Hence in abstract class case , we do not know child classes of abstract classes which implements abstract methods from abstract class
		// in interface case , we do not know implementation classes of interface which implements abstract methods from interface.
			
	}

}
