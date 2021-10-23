package stringhandling;

public class A {
	public static void main(String[] args) {
		
		String s="Java";
		int d=s.codePointAt(1);
		System.out.println(d);
		
		int k=s.codePointCount(1, 3);
		System.out.println(k);
		
		int a=s.codePointBefore(1);
		System.out.println(a);
	}

}
