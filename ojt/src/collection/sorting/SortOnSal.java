package collection.sorting;

import java.util.Comparator;

public class SortOnSal implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.sal > e2.sal)
			return 1;
		if(e1.sal < e2.sal)
			return -1;
		
		return 0;
	}

}
