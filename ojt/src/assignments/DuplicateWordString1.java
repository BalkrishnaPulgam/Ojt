package assignments;

public class DuplicateWordString1 {
	
	public static int countOccurrences(String str, String word) {
				
		String[] temp=str.split(" ");
		
		int count=0;
		
		for(int i=0; i<temp.length; i++) {
			if(word.equals(temp[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
        String str="java is simple . java is object oriented .";
		
		String word="java";
		
		int count =countOccurrences(str, word);
		
		System.out.println("The Word "+word+" occurs "+count+" times in the above string");
	}
	

}
