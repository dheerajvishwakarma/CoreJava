package Exercise;

public class HarmonicSeries {
	public static void main(String[] args) {
		int num = 10;
		double result = 0.0;
		System.out.println("The Harmonic Series is : ");
		for (int i = num; i > 0; i--) {
			result = result + (double) 1 / i;
			System.out.println(result + ",");

		}
	}

}
