package pattern;

public class Diamond {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <n-1; i++) {

			// for space
			for (int k = n - 1; k > i; k--) {
				System.out.print(" ");
			}
			// printing star
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		for (int i = n-1; i >=0 ; i--) {

			// for space
			for (int k = n - 1; k > i; k--) {
				System.out.print(" ");
			}
			// printing star
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
