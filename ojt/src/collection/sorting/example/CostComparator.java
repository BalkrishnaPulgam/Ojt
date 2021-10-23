package collection.sorting.example;

import java.util.Comparator;

public class CostComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub

		System.out.println("First Object in argument is " + s1);

		Phone[] s1Phones = s1.phones;
		Phone[] s2Phones = s2.phones;

		int s1totalcost = 0, s2totalcost = 0;

		// calculating cost of all phones of student 1

		for (int i = 0; i < s1Phones.length; i++) {
			s1totalcost = s1totalcost + s1Phones[i].cost;

		}
		System.out.println("All phone cost of Student 1 is " + s1totalcost);

		// calculating cost of all phones of student 1

		for (int i = 0; i < s2Phones.length; i++) {
			s2totalcost = s2totalcost + s2Phones[i].cost;
		}

		System.out.println("All phone cost of Student 2 is " + s2totalcost);

		// -3 -2 -1 0 1 2 3

		// comparing student object based on total phone cost

		if (s1totalcost > s2totalcost)
			return 1;
		if (s1totalcost < s2totalcost)
			return -1;
		else
			return 0;
	}

}
