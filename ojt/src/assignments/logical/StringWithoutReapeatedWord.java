package assignments.logical;

public class StringWithoutReapeatedWord {
	public static void main(String[] args) {
		
		String s ="java by kiran";
		
		String [] words=s.split(" "); //words   [java][by][kiran]
		
		String WithOutRepeatChar="";
		
		for (String word : words) {
			if(! isRepeat(word))
			{
				if(word.length() > WithOutRepeatChar.length())
				{
					
					WithOutRepeatChar=word;
				}
			}
			
		}
		
	}
	
	
	
	public static boolean isRepeat(String word) {
		char [] ch=word.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
