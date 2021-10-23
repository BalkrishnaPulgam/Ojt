package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class A {
	
	public static void main(String[] args) {
		
		String input="Hello";
		
		char[] ch=input.toCharArray();
		
		HashMap<Character, Integer> hashmap= new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(hashmap.containsKey(c))
				hashmap.put(c, hashmap.get(c)+1);
				else
					hashmap.put(c, 1);
		}
		
		
	Set<Entry<Character, Integer>> in =hashmap.entrySet();
	for (Entry<Character, Integer> entry : in) {
		
		System.out.println(entry.getKey()+" has appeared "+ entry.getValue()+" times.");
		
	}
	
	
	}

}
