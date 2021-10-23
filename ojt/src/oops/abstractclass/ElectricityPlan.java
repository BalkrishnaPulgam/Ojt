package oops.abstractclass;

public abstract class ElectricityPlan {

	int rate;

	abstract void setRate();

	void calculateBill(int units) {
		System.out.println(units * rate);
	}

}
