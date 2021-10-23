package assignments.logical.ownPractice;

//Reverse String

public class A {
	public static void main(String[] args) {

		String s = "Hello";
		String a = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			a = a + s.charAt(i);
		}
		System.out.println(a);

		// ----

		String sb = "Balkrishna";
		String sa = "";

		for (int i = sb.length() - 1; i >= 0; i--) {
			sa = sa + sb.charAt(i);
		}

		System.out.println(sa);

		// -----

		String ss = "Radha";

		char[] aa = ss.toCharArray(); // just for length==>
		                             // Array having length variable & string having length();
		String b = "";

		for (int i = aa.length - 1; i >= 0; i--) {
			b = b + ss.charAt(i);
		}

		System.out.println(b);

	}
}
