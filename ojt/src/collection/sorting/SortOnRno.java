package collection.sorting;

import java.util.Comparator;

public class SortOnRno implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.rno>s2.rno)
			return 1;
		if(s1.rno < s2.rno)
			return -1;
		return 0;
	}

}
