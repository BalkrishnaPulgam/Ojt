package stringhandling.logical1Oct;

import java.util.Arrays;

public class MyArrayList {

	int index=0;
	int size;
	
	Object[] a = new Object[4];
	
	MyArrayList()
	{
		size=a.length;
	}
	
	boolean add(Object o)
	{
		if(index==size)
		{
			a=Arrays.copyOf(a, a.length*2); // increasing size of an array 
			size=a.length;
		}
		
		a[index]=o;
		index++;
		
		return true;
	}
	
	public String toString()
	{
		
		StringBuffer s=null;
	
		s=new StringBuffer("[");
		
		for(int i=0;i<size;i++)
		{
			if(a[i]!=null)
				
				s.append(a[i] + ",");
				
		}
		
		s.append("]");
		
		
		String s1 = new String(s);
		
		//System.out.println(s1);
				
		//removing last ,
		
		s1=s1.replace(s1.charAt(s1.lastIndexOf(',')), ' ').trim();
		
		return s1;
	}
	
	//  0  1  2  3
	// 10 20 30 40
	
	boolean remove(int index)
	{
		for(int i=index;i<=a.length-2;i++)
		{
			a[i]=a[i+1];
		}
		
		size=size-1;
		
		return true;
	}
	
	
	Object get(int index)
	{
			
		return a[index];
	}
	
	public static void main(String[] args) {
		
		MyArrayList al = new MyArrayList();
		al.add(10);
		al.add("java");
		al.add(30);
		al.add("JBK");
		al.add("JBK");
		al.add(10);
		
		System.out.println(al);
		
		System.out.println(al.get(1));;
		
		al.remove(2);
		
		System.out.println(al);
				
				
	}

}
