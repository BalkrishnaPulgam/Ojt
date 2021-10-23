package collection;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };

		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		int[][] b= {{10,20},{30,40}};
		System.out.println(Arrays.deepToString(b));

	}

}
