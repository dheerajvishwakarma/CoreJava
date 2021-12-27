package Exercise;

public class Prrime {
	public static void main(String[] args) {
		int num = 21;
		boolean condition = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				condition = true;
				break;

			}
		}
		if (!condition)
			System.out.println("Prime number: " + num);
		else
			System.out.println("Not Prime number: " + num);
	}

}
