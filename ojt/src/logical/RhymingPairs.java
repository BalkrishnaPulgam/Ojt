package logical;

public class RhymingPairs {
	
	public static void main(String[] args) {
		
		String[] words= {"may","day","say","why","bhy","good"};
		
		String match="";
		
		for(int i=0; i<=words.length-2;i++) {
			match="";
			
			String lastword=words[i].substring(words[i].length()-2);
			
			for(int j=i+1; j<=words.length-1;j++) {
				
				if(words[j].endsWith(lastword)) {
					match=words[j];
					break;
				}
			}
			if(match!="")
			System.out.println(words[i]+ " "+  match);
		}
		
	}

}
