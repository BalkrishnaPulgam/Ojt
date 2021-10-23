package assignments;

public class DuplicateWordString {

	public static void main(String[] args) {
		
		String str="java is simple . java is object oriented .";
		
		String word="java";
		
		String[] temp=str.split(" ");
		
		int count=0;
		
		for(int i=0; i<temp.length; i++) {
			if(word.equals(temp[i])) {
				count++;
			}
		}
		System.out.println("The Strin is : "+str);
		System.out.println("The Word "+word+" occurs "+count+" times in the above string");
		
		
	}
	
}
