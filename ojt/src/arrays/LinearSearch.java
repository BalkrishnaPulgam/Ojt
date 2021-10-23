package arrays;

public class LinearSearch {
	
	public static void main(String[] args) {

		int[] a= {10,20,30};
		int no=20;
		for(int i=0; i<a.length;i++) {
			if(a[i]==no) {
				System.out.println("Element found");
				break;
			}
		}
	}

}
