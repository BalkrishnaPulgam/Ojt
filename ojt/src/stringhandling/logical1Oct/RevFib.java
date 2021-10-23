package stringhandling.logical1Oct;

public class RevFib {
	public static void main(String[] args) {
		
		int no1=5;
		int no2=3;
		
		int res=-1;
		
		System.out.print(no1+" "+no2+" ");
		
		while(res!=0) {
			
			res=no1-no2;
			no1=no2;
			no2=res;
			System.out.print(res+" ");
		}
		
	}

}
