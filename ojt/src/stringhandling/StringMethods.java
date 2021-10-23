package stringhandling;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
		

		String check = "java$2";
		System.out.println(check.contains("@") || check.contains("$"));
		
	
		
		String s="javabykiran";
		char c=s.charAt(2);
		System.out.println(c);
		
	
		String sub=s.substring(3,5);//end index is not considered
		System.out.println(sub);
		
		System.out.println(s.substring(2));
		
		System.out.println(s.indexOf('a'));//gives index of first occurrence of this character
		System.out.println(s.lastIndexOf('a'));//gives index of last occurrence of this character
		
		System.out.println(s.contains("by"));
		
		String s2="abc.txt";
		System.out.println(s2.endsWith(".txt"));
		System.out.println(s2.endsWith(".jpg"));
		
		String s3="Mrs.Rohan";
		System.out.println(s3.startsWith("Mr"));
		
		System.out.println("----");
		String s4="java";
		String s5=new String("java");
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);//objects are created on different location (memory addresses)
		
		
		String s6="JAVA";
		System.out.println(s6.toLowerCase());
		
		

		String s7="java";
		System.out.println(s7.toUpperCase());
		
		
		String s8=" JBK  ";
	
		System.out.println(s8.trim().length());// it will remove starting and ending space 
		System.out.println(s8.length());	
		
		
		String s9="javabykiran";
		char[]  charcters=s9.toCharArray();
		
		for(char ch : charcters)
		{
			System.out.println(ch);
		}
		
		System.out.println(charcters);
		
		int[] ar= {10,20};
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		
		String s10="dhara";//[dhara] String class object 
		s10=s10.replace("dha","maa");//s10-->[maara] String class object
		System.out.println(s10);
		
		
		String s11="";
		System.out.println(s11.isEmpty());
//		System.out.println(s11.isBlank());
		
		String s1=new String();
		System.out.println(s1.isEmpty());
//		System.out.println(s1.isBlank());
	}

}
