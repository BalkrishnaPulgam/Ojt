package assignments.logical.ownPractice;

import java.util.Arrays;

public class OwnArraylist {

	int index = 0;
	int capacity;
	Object[] a = new Object[4];

	OwnArraylist() {
		capacity = 4;
	}

	Object get(int index) {
		return a[index];
	}

	Boolean add(Object o) {
		if (index == capacity) {
			a = Arrays.copyOf(a, a.length * 2);
			capacity=a.length;
			}
		a[index] = o;
		index++;
		return true;
	}

	int size() {
		int length = 0;

		for (int i = 0; i < capacity; i++) {
			if(a[i]!=null)
			length++;
		}
		/*if (length == 0) {
			length = 0;
		}*/

		
		return length;

	}
	
	
	boolean remove(int index) {
		for(int i=index; i<a.length-1; i++) {
			a[i]=a[i+1];
		}
		capacity=capacity-1;
		return true;
	}
	
	public String tostring() {
		
		StringBuffer s=null;
		s=new StringBuffer("[");
		
		for(int i=0; i<size(); i++) {
			s.append(a[i]+",");
		}
		
		String s1=new String(s);
		if(size()!=0)
		s1=s1.substring(0,s1.length()-1);
		s1=s1.concat("]");
		return s1;
	}
	
	
	public static void main(String[] args) {
		
		OwnArraylist a=new OwnArraylist();
		System.out.println(a.size());
		System.out.println(a.capacity);
		System.out.println(a);
		
		a.add(10);
		a.add("Java");
		a.add("By");
		a.add("Kiran");
	//	a.get(3);
		System.out.println(a.get(3));
	System.out.println(a.tostring());
	a.add("Krishna");
	System.out.println(a.capacity);
	System.out.println(a.size());
	System.out.println(a.tostring());
	a.remove(1);
	System.out.println(a.tostring());

	
	for(int i=a.size();i>=0;i--) {
		if(a.get(i)!=null) {
		System.out.println("element deleted "+a.get(i));
		a.remove(i);
		}
	}
		
	System.out.println(a.size());
	System.out.println(a.capacity);
		
	}
}
