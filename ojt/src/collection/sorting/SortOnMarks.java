package collection.sorting;

import java.util.Comparator;

public class SortOnMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.marks > o2.marks)
			return 1;
		if (o1.marks < o2.marks)
			return -1;
		else
			return 0;
	}

}
