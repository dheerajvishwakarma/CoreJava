package Exercise;

public class PositionOfArray {

	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20, 52, 30, 45, 62 };
		int x = 15;
		boolean fountNumner = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println("Position of x is : " + (i + 1));
				fountNumner = true;
				break;

			}
			if (fountNumner == false)
				;
			System.out.println("Number could'nt foundHance, -1");

		}

	}
}