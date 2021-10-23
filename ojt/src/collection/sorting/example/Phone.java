package collection.sorting.example;

public class Phone {
	
	int mob_no;
	int cost;
	String city;
	public Phone(int mob_no, int cost, String city) {
		super();
		this.mob_no = mob_no;
		this.cost = cost;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Phone [mob_no=" + mob_no + ", cost=" + cost + ", city=" + city + "]";
	}
	

}
