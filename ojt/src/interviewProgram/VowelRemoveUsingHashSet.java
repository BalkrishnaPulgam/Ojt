package interviewProgram;

import java.util.HashSet;
import java.util.Set;

public class VowelRemoveUsingHashSet {

	public static void main(String[] args) {
		

		String str="Balkrishna";

		char[] ch=str.toCharArray();

		Set<Character> vowelsSet=new HashSet<Character>();

		vowelsSet.add('A');
		vowelsSet.add('I');
		vowelsSet.add('E');
		vowelsSet.add('O');
		vowelsSet.add('U');
		vowelsSet.add('a');
		vowelsSet.add('i');
		vowelsSet.add('e');
		vowelsSet.add('o');
		vowelsSet.add('u');

		StringBuffer sb= new StringBuffer();

		for(Character character:ch) {
			if(!vowelsSet.contains(character)) {
				sb.append(character);
			}
		}
		System.out.println("All Vowels Are Removed..!!\n New String is: "+sb);

	}

}


