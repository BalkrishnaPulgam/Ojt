package collection;

import java.util.ArrayList;

public class ArrayListGeneric {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(20));// 0
	//	al.add("JBK");//1  // [ [10] Integer class object ] ArrayList class object
		
	
		for(Integer o : al)
		{
			System.out.println(o.intValue());
		}
		
		
		// [ [JBK] String class object ] ArrayList class object
		
	ArrayList<String> al2 = new ArrayList();
		
		//al2.add(10);// 0
		al2.add("JBK");//1  
		
	
		for(Integer o : al)
		{
			System.out.println(o.intValue());
		}
				
	}

}
