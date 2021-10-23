package logical;

public class Series {
	
	//7 17 27 37 47 57 67 70 77 87 97
	
	public static void main(String[] args) {
		
		
		int[] a= new int[101];
		
		for(int i=0; i<101; i++) {
			a[i]=i;
		}
		
		for (int num : a) {
			if(num%10==7 || num/10.0==7.0) {
				System.out.print(num+" ");
			}
		}
		
		
	}

}
