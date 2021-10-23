package stringhandling;

public class StringImmutability {

	/*
	 * String -- Immutable ( Unchangeable )
	 * 
	 * StringBuffer --Mutable ( Changeable )
	 * 
	 * StringBuilder class is similar to StringBuffer class . Only difference is :-
	 * 
	 * StringBuffer is synchronized object .StringBuilder class is not synchronized
	 * .
	 * 
	 */

	public static void main(String[] args) {

		String s1 = new String("JBK"); // s1-->[JBK]

		s1.concat("JAVA"); // s1=s1.concat("JAVA"); //s1-->[JBKJAVA]

		System.out.println(s1);

		String s2 = new String("JBK");

		s2 = s2.concat("JAVA");

		System.out.println(s2);

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		StringBuffer sb1 = new StringBuffer("JBK"); // sb1,sb2--->[JBKJAVA] StringBuffere object

		StringBuffer sb2 = sb1.append("JAVA");

		if (sb1 == sb2)
			System.out.println("Same objects");
		else
			System.out.println("Different objects");
		sb1.insert(2, "CA");

		System.out.println(sb1);

		sb1.replace(2, 4, "BA");
		System.out.println(sb1);

// Duplicate objects are not created inside SCP ( String Constant pool )		

		String s3 = "Hello";

		String s4 = "Hello";

		System.out.println(s3 == s4);

	}

}
