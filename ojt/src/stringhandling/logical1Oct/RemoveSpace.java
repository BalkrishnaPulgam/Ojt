package stringhandling.logical1Oct;

public class RemoveSpace {
	public static void main(String[] args) {

		String s = "java is  easy";
		StringBuffer newstring = new StringBuffer();  //newString=>[javaiseasy] StringBuffer object
		char[] ch = s.toCharArray();

		for (char c : ch) {

			if (c != ' ') {
				newstring.append(c);
			}
		}
		System.out.println(newstring);
		s=newstring.toString();     //converting Stringbuffer into string, we need tostring 
		System.out.println(s);  
	}

}
