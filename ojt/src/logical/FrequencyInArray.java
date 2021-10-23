package logical;

public class FrequencyInArray {
	
	
	public static void main(String[] args) {
		
		int[] a=new int[10];
		
		int num=121;
		
		while (num!=0) {
			int digit=num%10;
			a[digit]=a[digit]+1;
			num=num/10;
		}
		
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
				System.out.println(i+"has ap"+a[i]);
		}}
		
	}

}
