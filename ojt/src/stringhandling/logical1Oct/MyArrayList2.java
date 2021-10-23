package stringhandling.logical1Oct;

import java.util.Arrays;

public class MyArrayList2 {

	int index=0;
	int capacity;
	
	
	Object[] a = new Object[4];
	
	MyArrayList2()
	{
		capacity=4;
	}
	
	boolean add(Object o)
	{
		if(index==capacity)
		{
			a=Arrays.copyOf(a, a.length*2); // increasing capacity of an array 
			capacity=a.length;
		}
		
		a[index]=o;
		index++;
		
		return true;
	}
	
	
	//to print contents of an object 
	
	public String toString()
	{
		
		StringBuffer s=null;
	
		s=new StringBuffer("[");
		
		for(int i=0;i<size();i++)
		{
						
				s.append(a[i] + ",");
				
		}
		
		s.append("]");
		
		
		String s1 = new String(s);
		
		//System.out.println(s1);
				
		//removing last ,
		
		try
		{
			s1=s1.replace(s1.charAt(s1.lastIndexOf(',')), ' ').trim();
		}
		catch(Exception e)
		{
			s1="[]";// when no element is present in arraylist
		}
		
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
		
		capacity=capacity-1;
		
		return true;
	}
	
	
	Object get(int index)
	{
					
		return a[index];
	}
	
	
	int size()
	{
		int length=-1;
		
		for(int i=0;i<capacity;i++)
		{
			if(a[i]!=null)
				
				length++;
	
		}
		
		if(length==-1)
			length=0;
				
		//System.out.println("No of elements are " + length);
		
		return length;
	
		
	}
	
	
	public static void main(String[] args) {
		
		MyArrayList2 al = new MyArrayList2();
		al.add(10);
		al.add("java");
		al.add(30);
		al.add("JBK");
		al.add("JBK");
		al.add(10);
		al.add("java");
		al.add(30);
		al.add("JBK");
		al.add("JBK");
		
		al.add("JBK");
		al.add("JBK");
		
		
		System.out.println(al);
		
		System.out.println(al.get(1));;
		
		for(int i=0;i<=al.size();i++)
		{
			al.remove(i);
		}

		
		/*
		for(int i=al.size();i>=0;i--)
		{
			System.out.println("Element deleted " + al.get(i));
			al.remove(i);
		}
		*/
		
		System.out.println(al);
				
				
	}
	

}
