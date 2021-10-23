package collection.sorting;

import java.util.Comparator;

public class SortOnEno implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.eno >e2.eno)
			return 1;
		if(e1.eno< e2.eno)
			return -1;
		
		return 0;
	}

}
