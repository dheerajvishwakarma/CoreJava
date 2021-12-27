package Exercise;

public class MissingElement {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int[] a = { 10, 20, 30, 20, 30, 50 };
		int[] b = { 25, 30, 19, 75, 40 };

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];

		}
		for (int j = 0; j <= b.length - 1; j++) {

			sum1 = sum1 + b[j];

		}
		int h = sum1 - sum;
		System.out.println(h);
	}

}
