package Exercise;

public class SecondLarge {

	public static void main(String[] args) {
		int[] a = { 12, 15, 16, 20, 23, 25, 24 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		int num = a.length - 2;
		System.out.println(a[num]);
	}
}
