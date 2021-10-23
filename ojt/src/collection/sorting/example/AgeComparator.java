package collection.sorting.example;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.age>s2.age)
			return 1;
		if(s1.age<s2.age)
			return -1;
		else
		return 0;
	}

}
