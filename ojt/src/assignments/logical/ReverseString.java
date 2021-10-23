package assignments.logical;



public class ReverseString {
	
	public static void main(String[] args) {
		
		
		
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next(); */
		
		String str="Hello World";
		String reverse=" ";
		
		char [] ch=str.toCharArray();
		int length=ch.length;
		
		for(int i=length-1; i>=0; i--) {
			reverse=reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
