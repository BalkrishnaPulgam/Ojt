package stringhandling;

public class StringSplitExample {

	public static void main(String[] args) {
		String s1 = "20/09/2021";
		String[] s = s1.split("/");  // strings [20][09][2021]
		System.out.println(s.toString());
		
		for (String string : s) {
			System.out.println(string.length());
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			System.out.println(s[i].length());
		}
	}

}
