package collection.sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
public static void main(String[] args) {
		
		TreeSet<Students> treeset = new TreeSet<Students>(new RnoAs());
		treeset.add(new Students(3, 60));
		treeset.add(new Students(1, 40));
		treeset.add(new Students(2, 80));
		
		System.out.println(treeset);
		TreeSet<Students> treeset2= new TreeSet<Students>(new RnoDesc());
			
		treeset2.addAll(treeset);
		
		System.out.println(treeset2);
	}

}



class Students
{

	int rno , marks;
	
	public Students(int rno, int marks) {
		
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
}

class RnoAs implements Comparator<Students>
{
	public int compare(Students s1, Students s2) {
		
		if(s1.rno>s2.rno)
			return 12;
		
		else if(s1.rno<s2.rno)
			return -10;
		
		else
			return 0;
	
	}
	
}




class RnoDesc implements Comparator<Students>
{
	public int compare(Students s1, Students s2) {
		
		if(s1.rno<s2.rno)
			return 12;
		
		else if(s1.rno>s2.rno)
			return -10;
		
		else
			return 0;
	
	}
	
}
