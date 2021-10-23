package stringhandling.logical1Oct;

public class RemoveSpace2 {

	public static void main(String[] args) {

		String s = "java is  easy";
		String newstring = new String();

		char[] ch = s.toCharArray();

		for (char c : ch) {
			if (c != ' ') {
				newstring = newstring.concat("" + c);
			}

		}
		s = newstring;
		System.out.println(s);
	}

}
